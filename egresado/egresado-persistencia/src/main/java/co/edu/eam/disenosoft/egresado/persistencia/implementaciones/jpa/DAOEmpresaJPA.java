package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IEmpresaDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;
/**
 * Clase que permite gestionar todos los metodos declarados en la interface
 * @author laura posada
 * 16/11/2016
 */
public class DAOEmpresaJPA implements IEmpresaDAO{

	/**
	 * crea una empresa 
	 */
	public void crearEmpresa(Empresa empresa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		
		em.persist(empresa);
		
		em.getTransaction().commit();
		
	}

	/**
	 * edita una empresa
	 */
	public void editarEmpresa(Empresa empresa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		
		em.merge(empresa);
		
		em.getTransaction().commit();
		
	}

	/**
	 * busca una empresa
	 */
	public Empresa buscarEmpresa(int idEmpresa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Empresa.class, idEmpresa);
	}

	

}
