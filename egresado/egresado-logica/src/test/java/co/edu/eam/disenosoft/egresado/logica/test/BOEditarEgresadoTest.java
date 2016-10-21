package co.edu.eam.disenosoft.egresado.logica.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOEgresado;
import co.edu.eam.disenosoft.egresado.logica.bos.BOPrograma;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import junit.framework.Assert;

public class BOEditarEgresadoTest {

	private BOPrograma boPrograma;
	private BOEgresado boEgresado;

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EditarEgresadoTest.sql");
	}

	@Before
	public void setUp() {
		boPrograma = new BOPrograma();
		boEgresado = new BOEgresado();

	}

	@Test
	public void testCrearPrograma() throws Exception {

		Programa pro = boPrograma.buscarPrograma(15);

		Egresado egresado = new Egresado();
		//System.out.println("-------------------------------- " +egresado.getNombre());
		egresado.setId(1088);
		egresado.setApellido("jaramillo");
		egresado.setCelular("300");
		egresado.setEmail("sam@gmail.com");
		egresado.setNombre("sandra milena");
		egresado.setPrograma(pro);
		egresado.setTelefono("732");
		egresado.setTipoDoc("Cedula");

		try {

			boEgresado.editarEgresado(egresado);
			
			Egresado egre = boEgresado.buscarEgresado(1088);
			System.out.println("-------------------------------- " +egre.getNombre());
			Assert.assertNotNull(egre);
			Assert.assertEquals("sandra milena", egre.getNombre());

		} catch (Exception e) {
			Assert.fail();
		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarEditarEgresadoTest.sql");
	}

}
