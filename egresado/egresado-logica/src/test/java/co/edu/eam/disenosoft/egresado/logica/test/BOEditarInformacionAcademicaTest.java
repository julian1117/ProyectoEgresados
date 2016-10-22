package co.edu.eam.disenosoft.egresado.logica.test;

import java.util.Calendar;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOEgresado;
import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionAcademica;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionAcademica;
import junit.framework.Assert;

public class BOEditarInformacionAcademicaTest {

	private BOEgresado boEgresado;
	private BOInformacionAcademica boInfoAc;

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EditarInformacionAcademica.sql");
	}

	@Before
	public void setUp() {
		boEgresado = new BOEgresado();
		boInfoAc = new BOInformacionAcademica();

	}

	@Test
	public void testEditarInformacionAcademica() throws Exception {

	
		Egresado egresado = boEgresado.buscarEgresado(1088);
		
		InformacionAcademica infoac = new InformacionAcademica();
		
		infoac.setAreaConocimiento("Web Super avanzado");
		infoac.setEgresado(egresado);
		infoac.setFacultad("Ingenieria");		
		Calendar cal = Calendar.getInstance();  
		cal.set(1990, 01, 20);  
		infoac.setFechaGrado(cal.getTime());
		infoac.setMaximoNivelAcademico("Doctorado");
		infoac.setNumeroDiploma("2223");
		infoac.setProgramaAcademico("Software");
		
		
		try {

			boInfoAc.editarInformacionAcademica(infoac);
			
			InformacionAcademica informacion = boInfoAc.buscarInformacionAcademica(1088);
			
			System.out.println(informacion.getAreaConocimiento());
			
			Assert.assertNotNull(informacion);
			Assert.assertEquals("Web Super avanzado",informacion.getAreaConocimiento());

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();		
		}
	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarEditarInformacionAcademica.sql");
	}

}
