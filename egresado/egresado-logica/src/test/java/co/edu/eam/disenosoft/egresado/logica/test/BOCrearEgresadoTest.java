package co.edu.eam.disenosoft.egresado.logica.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOEgresado;
import co.edu.eam.disenosoft.egresado.logica.bos.BOFacultad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOPrograma;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import junit.framework.Assert;

public class BOCrearEgresadoTest {

	private BOPrograma boPrograma;
	private BOEgresado boEgresado;


	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-AgregarEgresadoTest.sql");
	}

	@Before
	public void setUp() {
		boPrograma = new BOPrograma();
		boEgresado = new BOEgresado();

	}

	@Test
	public void testCrearEgresado() throws Exception {

		Programa pro = boPrograma.buscarPrograma(15);
		
		
		Egresado egresado = new Egresado();
		
		egresado.setId(1088);
		egresado.setApellido("henao");
		egresado.setCelular("3105940620");
		egresado.setEmail("k-milo1117@hotmial.com");
		egresado.setNombre("julian");
		egresado.setPrograma(pro);
		egresado.setTelefono("734");
		egresado.setTipoDoc("Cedula");
		
		
		try {

			boEgresado.crearEgresado(egresado);
			
			Egresado egre = boEgresado.buscarEgresado(1088);

			Assert.assertNotNull(egre);
			Assert.assertEquals(1088,egre.getId());

		} catch (Exception e) {
			Assert.fail();
		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarEgresadoTest.sql");
	}

}
