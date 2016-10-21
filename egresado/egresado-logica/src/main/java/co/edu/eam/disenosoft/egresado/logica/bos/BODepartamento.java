package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Departamento;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAODepartamentoJPA;

public class BODepartamento {

	private DAODepartamentoJPA daoDepartamento;
	
	public BODepartamento() {
		daoDepartamento = new DAODepartamentoJPA();
	}

	/**
	 * Lista de departamentos
	 * @return
	 * @throws Exception
	 */
	public List<Departamento> listarDepartamento() throws Exception {
		return daoDepartamento.listarDepartamento();
	}
	
	
	public Departamento buscarDepartamento (int idDep) throws Exception{
		return daoDepartamento.buscarDepartamento(idDep);
	}
}
