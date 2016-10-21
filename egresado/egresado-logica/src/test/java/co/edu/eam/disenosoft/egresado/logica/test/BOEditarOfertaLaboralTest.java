package co.edu.eam.disenosoft.egresado.logica.test;

import java.util.Calendar;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOAreaInteres;
import co.edu.eam.disenosoft.egresado.logica.bos.BOCiudad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOEmpresa;
import co.edu.eam.disenosoft.egresado.logica.bos.BOOfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;

public class BOEditarOfertaLaboralTest {

	private BOOfertaLaboral boOferta;
	private BOAreaInteres boArea;
	private BOEmpresa boEmpresa;
	private BOCiudad boCiudad;

	@Before
	public void setUp() {
		boOferta = new BOOfertaLaboral();
		boArea = new BOAreaInteres();
		boEmpresa = new BOEmpresa();
		boCiudad = new BOCiudad();

	}

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EditarOfertaLaboral.sql");
	}

	@Test
	public void testEditarOfertaLaboral() throws Exception {
		try {
			Empresa em = boEmpresa.buscarEmpresa(181);
			AreaInteres area = boArea.buscarAreaInteres(777);
			Ciudad ciudad = boCiudad.buscarCiudad(838);
			OfertaLaboral ofer = boOferta.buscarOferta(567);

			ofer.setCargoOfrecer("q");
			ofer.setDescripcionOferta("q");

			Calendar cal = Calendar.getInstance();
			cal.set(2016, 04, 04);
			ofer.setFechaoferta(cal.getTime());
			ofer.setIdArea(area);
			ofer.setIdCiudad(ciudad);
			ofer.setIdempresa(em);
			ofer.setIdOferta(567);
			ofer.setRequisitoOferta("q");
			ofer.setResumen("qqq");
			ofer.setSalario(654686);
			ofer.setCerrarOferta(true);

			boOferta.editarOferta(ofer);

			OfertaLaboral oferta = boOferta.buscarOferta(567);

			Assert.assertNotNull(oferta);
			Assert.assertEquals("qqq", oferta.getResumen());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EditarEliminarOfertaLaboral.sql");
	}


}
