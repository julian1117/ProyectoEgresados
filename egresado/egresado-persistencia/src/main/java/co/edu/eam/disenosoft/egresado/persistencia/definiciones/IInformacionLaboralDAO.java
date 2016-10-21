package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;

public interface IInformacionLaboralDAO {

	public void crearInformacionLaboral (InformacionLaboral infoLab) throws Exception;
	
	public void editarInformacionLaboral (InformacionLaboral infoLab) throws Exception;
	
	public InformacionLaboral buscarInformacionLaboral (int id) throws Exception;
	
	List<SectorLaboral> listaLaboral() throws Exception;
	
}
