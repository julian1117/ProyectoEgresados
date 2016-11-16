package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Pais;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOPaisJPA;

public class BOPais {

	private DAOPaisJPA daoPais;
	
	
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
