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

public class BOEditarEmpresaTest {
	
	private BOEmpresa boEmpresa;
	private BOCiudad boCiudad;
	private BOSectorLaboral boSector;

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EditarEmpresa.sql");
	}

	@Before
	public void setUp() {
		boEmpresa = new BOEmpresa();
		boCiudad = new BOCiudad();
		boSector = new BOSectorLaboral();
	}

	@Test
	public void testEditarEmpresa() throws Exception {

		try {
			Empresa empresa = new Empresa();
			
			Empresa idEmpresa = boEmpresa.buscarEmpresa(68);
			// el id de la empresa es autoincrementable
			empresa.setId(68);
			empresa.setDireccion("mz 12 casa 7");
			empresa.setFax("7322");
			empresa.setNit("332342");
			empresa.setPais("Colombia");
			empresa.setRazonSocial("no se");
			empresa.setSitioWeb("julian1117@gmail.com");
			empresa.setTelefono("7538219");
			empresa.setDepartamento("Tolima");
			empresa.setTipoEmpresa("Publica");

			Ciudad ciudad = boCiudad.buscarCiudad(95);
			SectorLaboral sector = boSector.buscarSectorLaboral(4);

			empresa.setIdSectorLaboral(sector);

			empresa.setIdCiudad(ciudad);

			boEmpresa.editarEmpresa(empresa);
			Empresa em = boEmpresa.buscarEmpresa(empresa.getId());

			Assert.assertNotNull(em);
			Assert.assertEquals("Publica", em.getTipoEmpresa());

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EditarEliminarEmpresa.sql");
	}

}
