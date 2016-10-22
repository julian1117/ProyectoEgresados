package co.edu.eam.disenosoft.egresado.logica.test;

import java.util.Calendar;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOEgresado;
import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import junit.framework.Assert;

public class BOEditarInformacionLaboralTest {

	private BOEgresado boEgresado;
	private BOInformacionLaboral boInfoLab;


	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EditarInformacionLaboralTest.sql");
	}

	@Before
	public void setUp() {
		boEgresado = new BOEgresado();
		boInfoLab = new BOInformacionLaboral();

	}

	@Test
	public void testEditarInformacionLaboral() throws Exception {

		Egresado egresado = boEgresado.buscarEgresado(1088);
		
		InformacionLaboral infoLab = new InformacionLaboral();
	
		infoLab.setCargoEmpresa("Bases de datos");
		infoLab.setEgresado(egresado);
		//infoLab.setCodEgresado(egresado.getId());
		Calendar fecIn = Calendar.getInstance();  
		fecIn.set(2010, 01, 20);  
		infoLab.setFechaIngreso(fecIn.getTime());
		Calendar fecSa = Calendar.getInstance();  
		fecSa.set(2014, 10, 20);  
		infoLab.setFechaSalida(fecSa.getTime());
		infoLab.setNombreEmpresa("Casa soft");
		infoLab.setSectorLaboral("Sistemas informaticos");
		infoLab.setSitucionLaboral("Desempleado");
		infoLab.setTipoEmpresa("Privado");
		
		
		try {

			boInfoLab.editarInformacionLaboral(infoLab);
			
			InformacionLaboral informacion = boInfoLab.buscarInformacionLaboral(1088);
			System.out.println("--------------------------------" +informacion.getSitucionLaboral());
			Assert.assertNotNull(informacion);
			Assert.assertEquals("Bases de datos",informacion.getCargoEmpresa());

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarEditarInformacionLaboralTest.sql");
	}
}
