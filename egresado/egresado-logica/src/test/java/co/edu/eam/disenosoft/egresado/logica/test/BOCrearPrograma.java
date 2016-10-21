package co.edu.eam.disenosoft.egresado.logica.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOFacultad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOPrograma;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import junit.framework.Assert;

public class BOCrearPrograma {

	private BOPrograma boPrograma;
	private BOFacultad boFacultad;


	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-AgregarPrograma.sql");
	}

	@Before
	public void setUp() {
		boPrograma = new BOPrograma();
		boFacultad =new BOFacultad();

	}

	@Test
	public void testCrearPrograma() throws Exception {

		Facultad facul = boFacultad.buscarFacultad(11);
		
		
		Programa prog = new Programa();
		
		prog.setIdPrograma(24);
		prog.setNombrePrograma("Ciencias humanas");
		prog.setIdFacultad(facul);
		
		try {

			boPrograma.crearPrograma(prog);
			
			Programa busPro = boPrograma.buscarPrograma(24);

			Assert.assertNotNull(busPro);
			Assert.assertEquals(24,busPro.getIdPrograma());

		} catch (Exception e) {
			Assert.fail();
		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarPrograma.sql");
	}

}
