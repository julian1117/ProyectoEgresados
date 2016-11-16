package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;
/**
 * 
 * @author laura posada
 * 16/11/2016
 *Clase donde se declaran los metodos del sector laboral
 */
public interface ISectorLaboralDAO {

	/**
	 * metodo que busca un sector laboral
	 * @param idSect objeto que recibe para hacer la busqueda
	 * @return los datos de el sector a buscar 
	 * @throws Exception 
	 */
	public SectorLaboral buscarSectorLaboral (int idSect) throws Exception;
	
}
