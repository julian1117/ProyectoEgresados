package co.edu.eam.disenosoft.egresado.logica.bos;

import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOEmpresaJPA;

/**
 * Clase encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos 
 * @author laura posada
 *
 */
public class BOEmpresa {

	/**
	 * se llama el dao de la Empresa
	 */
	private DAOEmpresaJPA daoEmpresa;

	/**
	 * constructor de la clase
	 */
	public BOEmpresa() {
		daoEmpresa = new DAOEmpresaJPA();
	}

	/**
	 * metodo que crea una empresa 
	 * @param empresa objeto por el cual se va a crear la empresa
	 * @throws Exception informando que la empresa a crear ya se 
	 * encuentra registrada
	 */
	public void crearEmpresa (Empresa empresa) throws Exception{
		Empresa emp = daoEmpresa.buscarEmpresa(empresa.getId());
		if(emp == null){
			daoEmpresa.crearEmpresa(empresa);
		}else{
			throw new ExcepcionNegocio("La empresa ya esta registrada");
		}
	}

	/**
	 * metodo que edita una empresa que se encuentre registrada
	 * @param empresa objeto por el cual se va a editar una empresa
	 * @throws Exception informando que la empresa a editar no se encuentre
	 * registrada
	 */
	public void editarEmpresa (Empresa empresa) throws Exception{
		Empresa emp = daoEmpresa.buscarEmpresa(empresa.getId());
		
		if(emp != null){
			daoEmpresa.editarEmpresa(empresa);
		}else{
			throw new ExcepcionNegocio("No hay empresa registrada con este ID");
		}
	}
	
	/**
	 * metodo que busca una empresa
	 * @param idEmpresa objeto por el cual se va a buscar la empresa 
	 * @return la busqueda de la empresa 
	 * @throws Exception
	 */
	public Empresa buscarEmpresa (int idEmpresa) throws Exception{
		return daoEmpresa.buscarEmpresa(idEmpresa);
	}
	
}
