package co.edu.eam.disenosoft.egresado.logica.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.egresado.logica.bos.BOContacto;
import co.edu.eam.disenosoft.egresado.logica.bos.BOEmpresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Contacto;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import junit.framework.Assert;

public class BOCrearContactoTests {
	
	private BOContacto boContacto ;
	private BOEmpresa boEmpresa;
	
	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-AgregarContacto.sql");
	}

	@Before
	public void setUp() {
		boContacto = new BOContacto();
		boEmpresa = new BOEmpresa();
	}
	
	
	@Test
	public void testCrearContacto() throws Exception {
		
			Empresa empre = boEmpresa.buscarEmpresa(98);
			
			Contacto cont = new Contacto();
			
			cont.setCargoEmpresa("Director");
			cont.setCorreoElectronico("posada@gmail.com");
			System.out.println(empre);
			cont.setIdEmpresa(empre);			
			cont.setNombreCompleto("Andres Felipe");
			cont.setTelefono("3146929162");
			try {
			boContacto.crearContacto(cont);
			
			Contacto buscarCon = boContacto.buscarContacto(98);
			
			Assert.assertNotNull(buscarCon);
			Assert.assertEquals("Andres Felipe",buscarCon.getNombreCompleto());
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-EliminarContacto.sql");
	}
	
}
