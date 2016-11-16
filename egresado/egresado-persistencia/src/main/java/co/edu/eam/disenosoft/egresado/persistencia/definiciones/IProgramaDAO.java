package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
/**
 * Interface de registro de programa
 * @author CAMILO
 *
 */
public interface IProgramaDAO {

	/**
	 * Crea un programa academico
	 * @param prog programa academico que recibe
	 * @throws Exception
	 */
	public void crearPrograma (Programa prog) throws Exception;
	
	/**
	 * Edita un programa academico que este ya registrado
	 * @param prog programa academico que recibe
	 * @throws Exception
	 */
	public void editarPrograma (Programa prog) throws Exception;
	
	/**
	 * Busca un programa academico que este ya registrado
	 * @param id identificacion del programa que recibe
	 * @return el progrma si esta registraado, de lo contrario null
	 * @throws Exception
	 */
	public Programa buscarPrograma (int id) throws Exception;
	
	/**
	 * Lista de programas academicos
	 * @return lista de programas
	 * @throws Exception
	 */
	public List<Programa> listaPrograma () throws Exception;
}
