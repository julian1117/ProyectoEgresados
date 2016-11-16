package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Pais;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOPaisJPA;

/**
 * Clase encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos 
 * @author laura posada
 *
 */
public class BOPais {

	/**
	 * se llama el dao del ais
	 */
	private DAOPaisJPA daoPais;
	
	/**
	 * constructor de la clase
	 */
	public BOPais(){
		daoPais = new DAOPaisJPA();
	}
	
	/**
	 * Lista de paises
	 * @return lista de paises
	 * @throws Exception
	 */
	public List<Pais> listaPais() throws Exception {
		return daoPais.listaPais();
	}
	
	/**
	 * Buscar pais
	 */
	public Pais buscarPais(int idPais) throws Exception {
		return daoPais.buscarPais(idPais);
	}
	
	
}
