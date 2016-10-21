package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IEmpresaDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

public class DAOEmpresaJPA implements IEmpresaDAO{

	public void crearEmpresa(Empresa empresa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		
		em.persist(empresa);
		
		em.getTransaction().commit();
		
	}

	public void editarEmpresa(Empresa empresa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		
		em.merge(empresa);
		
		em.getTransaction().commit();
		
	}

	public Empresa buscarEmpresa(int idEmpresa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Empresa.class, idEmpresa);
	}

	

}
