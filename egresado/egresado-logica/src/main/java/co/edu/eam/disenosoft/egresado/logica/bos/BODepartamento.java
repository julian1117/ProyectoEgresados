package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Departamento;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAODepartamentoJPA;

/**
 * Clase encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos 
 * @author laura posada
 *
 */
public class BODepartamento {

	/**
	 * se llama el dao del departamento
	 */
	private DAODepartamentoJPA daoDepartamento;
	
	/**
	 * constructor de la clase
	 */
	public BODepartamento() {
		daoDepartamento = new DAODepartamentoJPA();
	}

	/**
	 * Lista de departamentos
	 * @return la lista de departamentos
	 * @throws Exception
	 */
	public List<Departamento> listarDepartamento() throws Exception {
		return daoDepartamento.listarDepartamento();
	}
	
	/**
	 * metodo que busca un departamento
	 * @param idDep objeto por el cual se va a buscar el departamento 
	 * @return la busqueda del departamento
	 * @throws Exception
	 */
	public Departamento buscarDepartamento (int idDep) throws Exception{
		return daoDepartamento.buscarDepartamento(idDep);
	}
}
