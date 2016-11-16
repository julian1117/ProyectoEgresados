package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;

/**
 * clase donde se declaran los metodos para la facultad
 * @author laura posada
 * 16/11/2016
 */
public interface IFacultadDAO {

	/**
	 * implementacion del metodo para crear una facultad
	 * @param fac objeto que recibe para crear 
	 * @throws Exception
	 */
	public void crearFacultad (Facultad fac) throws Exception;	
	
	/**
	 * implemetacion del metodo para editar una facultaf
	 * @param fac objeto que se va a editar
	 * @throws Exception
	 */
	public void editarFacultad (Facultad fac) throws Exception;
	
	/**
	 * implementacion del metodo para buscar una facultad
	 * @param idFac objeto por el cual se va a buscar una facultad
	 * @return 
	 * @throws Exception
	 */
	public Facultad buscarFacultad (int idFac) throws Exception;
	
}
