package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Contacto;

public interface IContactoDAO {

	public void crearContacto (Contacto cont) throws Exception ;
	
	public void editarContacto (Contacto cont) throws Exception ;
	
	public Contacto buscarContacto (int id) throws Exception ;
	
}
