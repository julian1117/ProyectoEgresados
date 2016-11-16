package co.edu.eam.disenosoft.egresado.logica.bos;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOSectorLaboralJPA;

/**
 * Clase encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos 
 * @author laura posada
 *
 */
public class BOSectorLaboral {
	
	/**
	 * se llama el dao del sector laboral
	 */
	private DAOSectorLaboralJPA daoSectLaboral;
	
	/**
	 * constructor de la clase 
	 */
	public BOSectorLaboral() {
		daoSectLaboral = new DAOSectorLaboralJPA();
	}

	/**
	 * busca un sector laboral 
	 * @param idSect objeto por el cual se va a buscar el sector laboral 
	 * @return la busqueda del sector laboral
	 * @throws Exception
	 */
	public SectorLaboral buscarSectorLaboral(int idSect) throws Exception {
		return daoSectLaboral.buscarSectorLaboral(idSect);
	}
	
}
