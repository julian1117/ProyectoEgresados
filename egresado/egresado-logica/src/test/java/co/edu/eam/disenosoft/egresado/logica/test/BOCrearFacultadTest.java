package co.edu.eam.disenosoft.egresado.logica.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOFacultad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import junit.framework.Assert;

public class BOCrearFacultadTest {

	
	private BOFacultad boFacultad;
	
	@BeforeClass
	public static void beforeClass(){
		TestDataUtil.ejecutarSQL("sqltest/Prueba-AgregarFacultad.sql");
	}
	
	@Before
	public void setUp(){
		boFacultad =new BOFacultad();
	}
	
	
	@Test
	public void testCrearFacultad() throws Exception{
				
		try{
					
			Facultad facul = boFacultad.buscarFacultad(9);
			
			Assert.assertNotNull(facul);
			Assert.assertEquals(9, facul.getIdFacultad());
			
		}catch (Exception e) {
			Assert.fail();
		}
		
	}
	
	@AfterClass
	public static void afterClass(){
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarFacultad.sql");
	}
	
	
}
