package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOInformacionLaboralJPA;

/**
 * Clase encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos
 * @author laura posada
 *
 */
public class BOInformacionLaboral {

	/**
	 * se llama el dao de la informacion laboral 
	 */
	private DAOInformacionLaboralJPA daoInfoLab;

	/**
	 * constructor de la clase
	 */
	public BOInformacionLaboral() {
		daoInfoLab = new DAOInformacionLaboralJPA();
	}

	/**
	 * crea una informacion laboral 
	 * @param infoLab objeto por el cual va a ser creada la oferta
	 * @throws Exception oferta laboral ya sido creada
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
	 * edita una oferta laboral creada 
	 * @param infoLab objeto por el cual se va a editar la oferta
	 * @throws Exception la informacion laboral a editra no este creada
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
	 * busca una informacion laboral 
	 * @param id objeto por el cual se va a buscar la informacion laboral
	 * @return la busqueda de la informacion 
	 * @throws Exception
	 */
	public InformacionLaboral buscarInformacionLaboral(int id) throws Exception {
		return daoInfoLab.buscarInformacionLaboral(id);
	}

	/**
	 * lista sectores laborales
	 * @return la lista de los sectores laborales 
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
