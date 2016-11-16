package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;

/**
 * clase donde se declara los metodos para la empresa
 * @author laura posada
 * 16/11/2016
 */
public interface IEmpresaDAO {

	/**
	 * Inicializa el metodo para crear un registro de tipo empresa
	 * @param empresa
	 * @throws Exception
	 */
	public void crearEmpresa (Empresa empresa) throws Exception;
	
	/**
	 * Inicializa el metodo para editar un registro existente de una empresa
	 * @param egresado Objeto de tipo egresado que recibe el metodo
	 * @throws Exception
	 */
	public void editarEmpresa (Empresa empresa) throws Exception;
	
	/**
	 * Inicializa el metodo para busca un registro de una empresa a partir de su idempresa
	 * @param idEgresado Id por el que va a buscar el registro del egresado
	 * @return un egresado si esta registrado, null si no hay un registro
	 */
	public Empresa buscarEmpresa (int idEmpresa) throws Exception;
	
}
