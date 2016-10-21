package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.definiciones.ICiudadDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOCiudadJPA;


public class BOCiudad implements ICiudadDAO {

	/**
	 *intanciacion de la interface
	 */
	private DAOCiudadJPA daoCiudad;
	
	/**
	 * Constructor de la clase
	 */
	public BOCiudad() {
		daoCiudad = new DAOCiudadJPA();
	}
	
	public List<Ciudad> listarCiudad() throws Exception {		
			return daoCiudad.listarCiudad();		
	}
	
	public Ciudad buscarCiudad(int ciudad) throws Exception{
		return daoCiudad.buscarCiudad(ciudad);
	}

	
}
