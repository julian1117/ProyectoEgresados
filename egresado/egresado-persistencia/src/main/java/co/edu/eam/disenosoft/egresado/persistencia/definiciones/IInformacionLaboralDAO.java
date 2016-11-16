package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;

/**
 * clase donde se declaran los metodos para una imformacion laboral
 * @author laura posada
 * 16/11/2016
 */
public interface IInformacionLaboralDAO {

	/**
	 * implementacion del metodo para crear una informacion laboral 
	 * @param infoLab objeto con el cual se va a crear la informacion laboral
	 * @throws Exception
	 */
	public void crearInformacionLaboral (InformacionLaboral infoLab) throws Exception;
	
	/**
	 * implemnetacion del metodo para editar una informacio laborla 
	 * @param infoLab objeto que se va a editar de la informacion laboral
	 * @throws Exception
	 */
	public void editarInformacionLaboral (InformacionLaboral infoLab) throws Exception;
	
	/**
	 * implemengtacion del metodo para buscar la informacion laboral 
	 * @param id objeto por el cual se va a  buscar la informacion laborla deseada
	 * @return retorna los datos de la infotmacion laboral
	 * @throws Exception
	 */
	public InformacionLaboral buscarInformacionLaboral (int id) throws Exception;
	
	/**
	 * implementacion del metodo para listar los sectores laborales
	 * @return los sectores laborales creados 
	 * @throws Exception
	 */
	List<SectorLaboral> listaLaboral() throws Exception;
	
	/**
	 * implementacion del metodo para listar informacion laboral 
	 * @return las informaciones laborales encontradas
	 * @throws Exception
	 */
	List<InformacionLaboral> listaInfomracionLaboral() throws Exception;
	
	/**
	 * Implementacion del metodo para listar informacion laboral por tipo de programa
	 * @return lista de informacion laboral por programa
	 * @throws Exception
	 */
	List<InformacionLaboral> listaInfomracionLaboralPrograma(Programa programa) throws Exception;
}
