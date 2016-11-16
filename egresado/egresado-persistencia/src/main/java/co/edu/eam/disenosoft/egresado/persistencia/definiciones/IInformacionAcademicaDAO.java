package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import java.util.List;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionAcademica;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;

/**
 * clase que declaran los metodos para una informacion academica 
 * @author CAMILO
 * 16/11/2016
 */
public interface IInformacionAcademicaDAO {

	/**
	 * Inicializa el metodo para crear un registro de informacion academica
	 * @param informacionAc Objetoto que recibe para crear
	 * @throws Exception
	 */
	public void crearInformacionAcademica (InformacionAcademica informacionAc) throws Exception;
	
	/**
	 * Inicializa el metodo para editar un registro de informacion academica
	 * @param informacionAcademica Objeto que recibe ha editar
	 * @throws Exception
	 */
	public void editarInformacionAcademica (InformacionAcademica informacionAcademica) throws Exception;
	
	/**
	 * Inicializa el metodo para buscar un registro de informacion academica a partir del id egresado que es su llave primaria
	 * @param egre
	 * @return
	 */
	public InformacionAcademica buscarInformacionAcademica (int egre);
	
	
	/**
	 * Lista de facultades regsitradas
	 * @return
	 * @throws Exception
	 */
	public List<Facultad> listaFacultades() throws Exception;
	
	/**
	 * Lista de programas registrados
	 * @return
	 * @throws Exception
	 */
	public List<Programa> listaProgramas() throws Exception;
	
}
