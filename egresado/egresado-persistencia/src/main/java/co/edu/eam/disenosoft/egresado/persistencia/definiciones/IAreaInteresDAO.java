package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;

public interface IAreaInteresDAO {

	/**
	 * Crea una area de interes
	 * 
	 * @param area
	 *            area de interes que recibe el metodo
	 * @throws Exception
	 */
	public void crearAreaInteres(AreaInteres area) throws Exception;

	/**
	 * edita un area de interes
	 * 
	 * @param area
	 *            area de interes que recibe el metodo
	 * @throws Exception
	 */
	public void editarAreaInteres(AreaInteres area) throws Exception;

	/**
	 * Busca un area de interes
	 * 
	 * @param id
	 *            identificacion del area de interes a buscar
	 * @return area de interes buscada, null si no encuentra un area de interes
	 * @throws Exception
	 */
	public AreaInteres buscarAreaInteres(int id) throws Exception;

	/**
	 * implementacion del metodo para consultar la lista de las areas de interes
	 * creadas
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<AreaInteres> listarAreas() throws Exception;

}
