package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Departamento;

/**
 * clase que declara los metodos para el departamento
 * @author laura posada
 * 16/11/2016
 */
public interface IDepartamentoDAO {
	/**
	 * implementacion del metodo para consultar la lista
	 * de los departamentos 
	 * @return 
	 * @throws Exception
	 */
	public List<Departamento> listarDepartamento() throws Exception;
	
	/**
	 * Implementacion de metodo para realizar una busqueda de un departamento
	 * @param idDep
	 * @return
	 * @throws Exception
	 */
	public Departamento buscarDepartamento (int idDep) throws Exception;

}
