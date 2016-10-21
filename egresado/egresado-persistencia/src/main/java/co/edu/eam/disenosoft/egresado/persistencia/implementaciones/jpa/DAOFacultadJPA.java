package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IFacultadDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;


public class DAOFacultadJPA implements IFacultadDAO{

	public void crearFacultad(Facultad fac) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(fac);
		
		em.getTransaction().commit();	
		
	}

	public void editarFacultad(Facultad fac) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(fac);
		
		em.getTransaction().commit();
		
	}

	public Facultad buscarFacultad(int idFac) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Facultad.class, idFac);
	}
	
	
	

}
