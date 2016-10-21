package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;

public interface ICiudadDAO {
	
	/**
	 * implementacion del metodo para consultar la lista
	 * de las ciudades 
	 * @return 
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudad() throws Exception;

	/**
	 * implementacion del metodo para buscar una ciudad craeda
	 * @param ciudad objeto por el cual va a ser buscada la cuidad
	 * @return
	 * @throws Exception que se pueda efectuar
	 */
	public Ciudad buscarCiudad(int ciudad) throws Exception;
}
