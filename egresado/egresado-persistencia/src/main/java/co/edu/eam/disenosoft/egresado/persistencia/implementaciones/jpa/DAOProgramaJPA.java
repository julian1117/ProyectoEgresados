package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IProgramaDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;
/**
 * DAO del programa acadmeico que se encarga de registrar, editar y buscar
 * un programa academico
 * @author CAMILO
 *
 */
public class DAOProgramaJPA implements IProgramaDAO{

	/**
	 * Crea un programa academico
	 */
	public void crearPrograma(Programa prog) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();		
		em.getTransaction().begin();
		em.persist(prog);
		em.getTransaction().commit();		
	}

	/**
	 * Edita un programa academico
	 */
	public void editarPrograma(Programa prog) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(prog);
		em.getTransaction().commit();		
	}

	/**
	 * Busca un programa academico
	 */
	public Programa buscarPrograma(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Programa.class, id);
	}

}
