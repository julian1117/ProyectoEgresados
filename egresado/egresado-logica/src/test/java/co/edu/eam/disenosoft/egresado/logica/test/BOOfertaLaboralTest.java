package co.edu.eam.disenosoft.egresado.logica.test;

import java.util.Calendar;
import java.util.Date;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOAreaInteres;
import co.edu.eam.disenosoft.egresado.logica.bos.BOCiudad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOEmpresa;
import co.edu.eam.disenosoft.egresado.logica.bos.BOFacultad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOOfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;
import junit.framework.Assert;

public class BOOfertaLaboralTest {

	private BOOfertaLaboral boOferta;
	private BOAreaInteres boArea;
	private BOEmpresa boEmpresa;
	private BOCiudad boCiudad;

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-AgregarOfertaLaboral.sql");
	}

	@Before
	public void setUp() {
		boOferta = new BOOfertaLaboral();
		boArea = new BOAreaInteres();
		boEmpresa = new BOEmpresa();
		boCiudad = new BOCiudad();

	}

	@Test
	public void testCrearOferta() throws Exception {

		Empresa em = boEmpresa.buscarEmpresa(11);
		AreaInteres area = boArea.buscarAreaInteres(77);

		Ciudad ciudad = boCiudad.buscarCiudad(88);

		OfertaLaboral ofer = new OfertaLaboral();
		ofer.setCargoOfrecer("q");
		ofer.setDescripcionOferta("q");

		Calendar cal = Calendar.getInstance();
		cal.set(2016, 04, 04);
		ofer.setFechaoferta(cal.getTime());
		ofer.setIdArea(area);
		ofer.setIdCiudad(ciudad);
		ofer.setIdempresa(em);
		ofer.setIdOferta(56789);
		ofer.setRequisitoOferta("q");
		ofer.setResumen("q");
		ofer.setSalario(654686);
		ofer.setCerrarOferta(true);

		try {
			boOferta.crearOfertaLaboral(ofer);

			OfertaLaboral ofertaLa = boOferta.buscarOferta(56789);

			

			Assert.assertNotNull(ofertaLa);
			Assert.assertEquals(56789, ofertaLa.getIdOferta());

		} catch (Exception e) {
			
			Assert.fail();
		}

	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarOfertaLaboral.sql");
	}

}
