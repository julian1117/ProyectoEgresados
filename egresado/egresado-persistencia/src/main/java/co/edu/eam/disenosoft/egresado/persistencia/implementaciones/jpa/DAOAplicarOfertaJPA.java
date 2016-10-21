package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IAplicarOfertaDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaAplicadaEgresado;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

public class DAOAplicarOfertaJPA implements IAplicarOfertaDAO{

	public void aplicarOferta(OfertaAplicadaEgresado aplicarOfer) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		
		em.persist(aplicarOfer);
		
		em.getTransaction().commit();
		
	}

//	public OfertaAplicadaEgresado buscarOfertaAplicada(int id) throws Exception {
//		EntityManager em = AdministradorEntityManager.getEntityManager();
//		return em.find(OfertaAplicadaEgresado.class, id);
//	}

	

}
