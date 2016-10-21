package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;

public interface IEgresadoDAO {

	/**
	 * Inicializa el metodo para crear un registro de tipo egresado
	 * @param egresado Objeto de tipo egresado que recibe el metodo
	 * @throws Exception
	 */
	public void crearEgresado (Egresado egresado) throws Exception;
	
	/**
	 * Inicializa el metodo para editar un registro existente de un egresado
	 * @param egresado Objeto de tipo egresado que recibe el metodo
	 * @throws Exception
	 */
	public void editarEgresado (Egresado egresado) throws Exception;
	
	/**
	 * Inicializa el metodo para busca un registro de egresado a partir de su id 
	 * @param idEgresado Id por el que va a buscar el registro del egresado
	 * @return un egresado si esta registrado, null si no hay un registro
	 */
	public Egresado buscarEgresado (int idEgresado);
	
}
