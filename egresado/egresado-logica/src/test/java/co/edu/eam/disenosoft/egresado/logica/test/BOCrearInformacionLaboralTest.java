package co.edu.eam.disenosoft.egresado.logica.test;

import java.util.Calendar;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOEgresado;
import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionAcademica;
import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionAcademica;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import junit.framework.Assert;

public class BOCrearInformacionLaboralTest {


	private BOEgresado boEgresado;
	private BOInformacionLaboral boInfoLab;


	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-CrearInformacionLaboralTest.sql");
	}

	@Before
	public void setUp() {
		boEgresado = new BOEgresado();
		boInfoLab = new BOInformacionLaboral();

	}

	@Test
	public void testCrearInformacionLaboral() throws Exception {

		Egresado egresado = boEgresado.buscarEgresado(1088);
				
		InformacionLaboral infoLab = new InformacionLaboral();
	
		infoLab.setCargoEmpresa("Area Sistemas");
		infoLab.setEgresado(egresado);
		Calendar fecIn = Calendar.getInstance();  
		fecIn.set(2015, 01, 20);  
		infoLab.setFechaIngreso(fecIn.getTime());
		Calendar fecSa = Calendar.getInstance();  
		fecSa.set(2016, 10, 20);
		infoLab.setFechaSalida(fecSa.getTime());
		infoLab.setNombreEmpresa("Pepito Soft");
		infoLab.setSectorLaboral("Sistemas informaticos");
		infoLab.setSitucionLaboral("Independiente");
		infoLab.setTipoEmpresa("Privado");
		
		
		try {

			boInfoLab.crearInformacionLaboral(infoLab);
			
			InformacionLaboral informacion = boInfoLab.buscarInformacionLaboral(1088);

			Assert.assertNotNull(informacion);
			Assert.assertEquals("Area Sistemas",informacion.getCargoEmpresa());

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarInformacionLaboralTest.sql");
	}

}
