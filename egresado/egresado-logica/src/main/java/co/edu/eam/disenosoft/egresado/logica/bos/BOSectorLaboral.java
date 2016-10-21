package co.edu.eam.disenosoft.egresado.logica.bos;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOSectorLaboralJPA;

public class BOSectorLaboral {
	
	private DAOSectorLaboralJPA daoSectLaboral;
	
	public BOSectorLaboral() {
		daoSectLaboral = new DAOSectorLaboralJPA();
	}

	public SectorLaboral buscarSectorLaboral(int idSect) throws Exception {
		return daoSectLaboral.buscarSectorLaboral(idSect);
	}
	
}
