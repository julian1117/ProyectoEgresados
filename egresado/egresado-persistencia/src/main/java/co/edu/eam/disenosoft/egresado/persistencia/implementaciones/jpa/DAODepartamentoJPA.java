package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IDepartamentoDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Departamento;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

public class DAODepartamentoJPA implements IDepartamentoDAO {

	public List<Departamento> listarDepartamento() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Departamento.CONSULTA_LISTA_DEPARTAMENTO);
		List<Departamento> listarDepto = q.getResultList();
		return listarDepto;
	}

	public Departamento buscarDepartamento(int idDep) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Departamento.class, idDep);
	}

}
