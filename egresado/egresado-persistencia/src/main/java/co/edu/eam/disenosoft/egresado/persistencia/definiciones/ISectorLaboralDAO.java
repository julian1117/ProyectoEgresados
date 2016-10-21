package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;

public interface ISectorLaboralDAO {

	public SectorLaboral buscarSectorLaboral (int idSect) throws Exception;
	
}
