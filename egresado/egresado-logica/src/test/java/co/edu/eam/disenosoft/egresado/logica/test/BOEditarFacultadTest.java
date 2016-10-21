package co.edu.eam.disenosoft.egresado.logica.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOFacultad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import junit.framework.Assert;

public class BOEditarFacultadTest {

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
	public void testEditarFacultad() throws Exception{
				
		Facultad facul = new Facultad();
		
		facul.setIdFacultad(9);
		facul.setNombreFacultad("Ciencias administrativas");
		
		try{
					
			boFacultad.editarFacultad(facul);
			
			Assert.assertNotNull(facul);
			Assert.assertEquals("Ciencias administrativas", facul.getNombreFacultad());
			
		}catch (Exception e) {
			Assert.fail();
		}
		
	}
	
	@AfterClass
	public static void afterClass(){
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarFacultad.sql");
	}

}
