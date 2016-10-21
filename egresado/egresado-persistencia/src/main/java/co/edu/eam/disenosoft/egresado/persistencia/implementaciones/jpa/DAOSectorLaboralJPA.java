package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.ISectorLaboralDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

public class DAOSectorLaboralJPA implements ISectorLaboralDAO{

	public SectorLaboral buscarSectorLaboral(int idSect) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(SectorLaboral.class, idSect);
	}

	

}
