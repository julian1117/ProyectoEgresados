package co.edu.eam.disenosoft.egresado.logica.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOCiudad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOEmpresa;
import co.edu.eam.disenosoft.egresado.logica.bos.BOSectorLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;
import junit.framework.Assert;

public class BOCrearEmpresaTest {

	private BOEmpresa boEmpresa;
	private BOCiudad boCiudad;
	private BOSectorLaboral boSector;

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-AgregarEmpresa.sql");
	}

	@Before
	public void setUp() {
		boEmpresa = new BOEmpresa();
		boCiudad = new BOCiudad();
		boSector = new BOSectorLaboral();
	}

	@Test
	public void testCrearEmpresa() throws Exception {

		try {
			Empresa empresa = new Empresa();
			
			// el id de la empresa es autoincrementable

			empresa.setDireccion("crarrera 13");
			empresa.setFax("7322");
			empresa.setNit("332342");
			empresa.setPais("Colombia");
			empresa.setRazonSocial("no se");
			empresa.setSitioWeb("cualquiercosa@gmail.com");
			empresa.setTelefono("7538219");
			empresa.setDepartamento("Cual");
			empresa.setTipoEmpresa("Privada");

			Ciudad ciudad = boCiudad.buscarCiudad(95);
			SectorLaboral sector = boSector.buscarSectorLaboral(4);

			empresa.setIdSectorLaboral(sector);

			empresa.setIdCiudad(ciudad);
			empresa.setCiudad(ciudad.getNombre());

			boEmpresa.crearEmpresa(empresa);
			Empresa em = boEmpresa.buscarEmpresa(empresa.getId());

			Assert.assertNotNull(em);
			Assert.assertEquals("Privada", em.getTipoEmpresa());

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarEmpresa.sql");
	}

}
