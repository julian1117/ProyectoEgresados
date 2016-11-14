package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOInformacionLaboralJPA;

public class BOInformacionLaboral {

	private DAOInformacionLaboralJPA daoInfoLab;

	public BOInformacionLaboral() {
		daoInfoLab = new DAOInformacionLaboralJPA();
	}

	/**
	 * 
	 * @param infoLab
	 * @throws Exception
	 */
	public void crearInformacionLaboral(InformacionLaboral infoLab) throws Exception {
		InformacionLaboral infoLa = daoInfoLab.buscarInformacionLaboral(infoLab.getEgresado().getId());

		if (infoLa == null) {
			daoInfoLab.crearInformacionLaboral(infoLab);
		} else {
			throw new ExcepcionNegocio("La informacion laboral ya existe");
		}
	}

	/**
	 * 
	 * @param infoLab
	 * @throws Exception
	 */
	public void editarInformacionLaboral(InformacionLaboral infoLab) throws Exception {
		InformacionLaboral infoLa = daoInfoLab.buscarInformacionLaboral(infoLab.getEgresado().getId());

		if (infoLa != null) {
			daoInfoLab.editarInformacionLaboral(infoLab);
		} else {
			throw new ExcepcionNegocio("La informacion laboral no existe");
		}
	}

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public InformacionLaboral buscarInformacionLaboral(int id) throws Exception {
		return daoInfoLab.buscarInformacionLaboral(id);
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<SectorLaboral> listaLaboral() throws Exception {
		return daoInfoLab.listaLaboral();
	}
	
	/**
	 * Lista de informacion laboral
	 * @return lista con informaicon laboral
	 * @throws Exception
	 */
	public List<InformacionLaboral> listaInfomracionLaboral() throws Exception {
		return daoInfoLab.listaInfomracionLaboral();
	}

}
