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

public class BOEditarPrograma {

	private BOPrograma boPrograma;
	private BOFacultad boFacultad;
	
	@BeforeClass
	public static void beforeClass(){
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EditarPrograma.sql");
	}
	
	@Before
	public void setUp(){
		boPrograma =new BOPrograma();
		boFacultad = new BOFacultad();
	}
	
	
	@Test
	public void testEditarPrograma() throws Exception{
				
		Facultad facul = boFacultad.buscarFacultad(23);
		Programa prog = new Programa();
		
		//Programa prog = boPrograma.buscarPrograma(15);		
		//System.out.println(prog.getIdPrograma() +" - " +prog.getNombrePrograma() +" - " +prog.getIdFacultad().getIdFacultad());
		
		prog.setIdPrograma(15);;
		prog.setNombrePrograma("Contaduria");
		prog.setIdFacultad(facul);
		
		try{
					
			boPrograma.editarPrograma(prog);
			
			Programa pro =boPrograma.buscarPrograma(15);
			
			System.out.println(pro.getIdPrograma() +" - " +pro.getNombrePrograma() +" - " +pro.getIdFacultad().getIdFacultad());
		
			Assert.assertNotNull(pro);
			Assert.assertEquals("Contaduria", pro.getNombrePrograma());
			
		}catch (Exception e) {
			Assert.fail();
		}
		
	}
	
	@AfterClass
	public static void afterClass(){
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarEditarPrograma.sql");
	}


}
