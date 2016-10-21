package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IInformacionAcademicaDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionAcademica;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;
/**
 * DAOInformacionAcademicaJPA, permite gestionar todo lo relacionado con la entidad InformacionAcademica
 * @author CAMILO
 *
 */
public class DAOInformacionAcademicaJPA implements IInformacionAcademicaDAO {
	
	//Crea un registro de informacion academica
	public void crearInformacionAcademica(InformacionAcademica informacionAc) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.persist(informacionAc);

		em.getTransaction().commit();

	}

	//Edita un registro de informacion academica
	public void editarInformacionAcademica(InformacionAcademica informacionAcademica) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.merge(informacionAcademica);

		em.getTransaction().commit();
	}

	//Busca un registro de informacion academica
	public InformacionAcademica buscarInformacionAcademica(int egre) {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(InformacionAcademica.class, egre);
	}

	//Lista de las facultades registradas
	public List<Facultad> listaFacultades() throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Facultad.LISTA_DE_FACULTADES);
		List<Facultad> ListaFac = q.getResultList();
		
		return ListaFac;
	}
	
	//Lista de programas registrados
	public List<Programa> listaProgramas() throws Exception{
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Programa.LISTA_DE_PROGRAMAS);
		List<Programa> ListaFac = q.getResultList();
		
		return ListaFac;
	}


}
