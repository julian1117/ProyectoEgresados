package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IPais;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Pais;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

public class DAOPaisJPA implements IPais{

	/**
	 * Lista de paises
	 */
	public List<Pais> listaPais() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Pais.LISTRA_PAIS);
		List<Pais> listaPais = q.getResultList();
		return listaPais;
	}

	/**
	 * Buscar pais
	 */
	public Pais buscarPais(int idPais) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Pais.class, idPais);
	}

}
