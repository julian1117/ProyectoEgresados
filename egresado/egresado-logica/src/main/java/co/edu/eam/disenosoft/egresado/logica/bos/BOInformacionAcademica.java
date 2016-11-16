package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionAcademica;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOInformacionAcademicaJPA;

/**
 * Clase BOInformacionAcademica, se encarga de hacer las validaciones necesarias
 * para el correcto funcionamiento de la aplicacion durante la ejecucion de los
 * metodos para crear, editar y bucar un registro de informacion academica
 * 
 * @author CAMILO
 *
 */
public class BOInformacionAcademica {

	private DAOInformacionAcademicaJPA daoInfoAc;

	public BOInformacionAcademica() {
		daoInfoAc = new DAOInformacionAcademicaJPA();
	}

	/**
	 * crea una informacion academica
	 * @param informacionAc objeto por el cual se va a crear la inf academica
	 * @throws Exception informando que la informacion academica a crear 
	 * ya se encuentra registrada
	 */
	public void crearInformacionAcademica(InformacionAcademica informacionAc) throws Exception {
		InformacionAcademica info = daoInfoAc.buscarInformacionAcademica(informacionAc.getEgresado().getId());

		if (info == null) {
			daoInfoAc.crearInformacionAcademica(informacionAc);
		} else {
			throw new ExcepcionNegocio("Ya exite un registro de la informacio academica del egresado");
		}
	}

	/**
	 * edita una inf academica ya registrada
	 * @param informacionAcademica objeto por el cual se va a editar la inf academica
	 * @throws Exception que la inf academica a editar no se encuentre registrada
	 */
	public void editarInformacionAcademica(InformacionAcademica informacionAcademica) throws Exception {
		InformacionAcademica info = daoInfoAc.buscarInformacionAcademica(informacionAcademica.getEgresado().getId());

		if (info != null) {
			daoInfoAc.editarInformacionAcademica(informacionAcademica);
		} else {
			throw new ExcepcionNegocio("No exite un registro de la informacion de este egresado");
		}
	}
	

	/**
	 * busca una inf academica
	 * @param egre objetoo por el cual se va a  buscar la inf academica 
	 * @return la busqueda de la informacion academica 
	 */
	public InformacionAcademica buscarInformacionAcademica(int egre) {
		return daoInfoAc.buscarInformacionAcademica(egre);
	}

	/**
	 * Trae la lsita de faculatades registradas desde el dao
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Facultad> listaFacultades() throws Exception {
		return daoInfoAc.listaFacultades();
	}

	/**
	 * Trae la lista de programas regsitrados desde el dao
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Programa> listaProgramas() throws Exception {
		return daoInfoAc.listaProgramas();
	}

}
