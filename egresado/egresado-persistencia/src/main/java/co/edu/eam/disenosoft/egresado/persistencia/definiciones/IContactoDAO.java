package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Contacto;

/**
 * clase donde se declaran los metodos para el contacto
 * @author laura posada
 * 16/11/2016
 */
public interface IContactoDAO {

	/**
	 * implementacion del etodo para crear un contacto
	 * @param cont objeto por el cual se va a crear el contacto
	 * @throws Exception
	 */
	public void crearContacto (Contacto cont) throws Exception ;
	
	/**
	 * implememntacion del metodo para edirtar un contacto 
	 * @param cont objeto por el cual se edita el contacto
	 * @throws Exception
	 */
	public void editarContacto (Contacto cont) throws Exception ;
	
	/**
	 * implememntacion del metodo para buscar un contacto
	 * @param id objeto por le cual se va a  buscar el contacto 
	 * @return los datos del contacto buscado 
	 * @throws Exception
	 */
	public Contacto buscarContacto (int id) throws Exception ;
	
}
