package co.edu.eam.disenosoft.egresado.logica.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOAreaInteres;
import co.edu.eam.disenosoft.egresado.logica.bos.BOFacultad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import junit.framework.Assert;

public class BOAreaInteresTest {
	
	private BOAreaInteres boArea;
	
	@BeforeClass
	public static void beforeClass(){
		TestDataUtil.ejecutarSQL("sqltest/Prueba-AgregarAreaInteres.sql");
	}
	
	@Before
	public void setUp(){
		boArea =new BOAreaInteres();
	}
	
	@Test
	public void CrearAreaTest() throws Exception{
		try {
			
			AreaInteres area = boArea.buscarAreaInteres(43);
			
			area.setIdArea(43);
			
			Assert.assertNotNull(area);
			Assert.assertEquals(43, area.getIdArea());
			
		} catch (Exception e) {
			Assert.fail();
		}
		
	}
	
	
	@AfterClass
	public static void afterClass(){
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarArea.sql");
	}

}
