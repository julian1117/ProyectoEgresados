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
	 * 
	 * @param informacionAc
	 * @throws Exception
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
	 * 
	 * @param informacionAcademica
	 * @throws Exception
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
	 * 
	 * @param egre
	 * @return
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
