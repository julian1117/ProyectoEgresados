package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Pais;

public interface IPais {

	/**
	 * Lista de paises
	 * @return lista de paises
	 * @throws Exception
	 */
	public List<Pais> listaPais() throws Exception;
	
	/**
	 * Buscar un pais por su id
	 * @param idPais
	 * @return un objeto pais
	 * @throws Exception
	 */
	public  Pais buscarPais ( int idPais) throws Exception;
}
