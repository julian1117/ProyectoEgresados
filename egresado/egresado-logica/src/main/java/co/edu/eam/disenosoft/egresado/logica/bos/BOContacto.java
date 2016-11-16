package co.edu.eam.disenosoft.egresado.logica.bos;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Contacto;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOContactoJPA;

/**
 * Clase encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos 
 * @author laura posada
 *
 */
public class BOContacto {

	/**
	 * se llama el dao del contacto
	 */
	private DAOContactoJPA daoContacto;

	/**
	 * costructor de la clase
	 */
	public BOContacto() {
		daoContacto = new DAOContactoJPA();
	}

	/**
	 * metodo que crea un contacto 
	 * @param cont objeto por el cual se va a crear el contacto 
	 * @throws Exception informando que el contanto ya haya sido creado
	 */
	public void crearContacto(Contacto cont) throws Exception {
		Contacto contac = daoContacto.buscarContacto(cont.getIdEmpresa().getId());

		if (contac == null) {
			daoContacto.crearContacto(cont);
		} else {
			throw new ExcepcionNegocio("El contacto ya existe");
		}

	}

	/**
	 * metodo que edita un contacto 
	 * @param cont objeto por el cual se va a editar un contacto
	 * @throws Exception informando que el contacto a editar no se encuentre registrado
	 */
	public void editarContacto(Contacto cont) throws Exception {
		Contacto contac = daoContacto.buscarContacto(cont.getIdEmpresa().getId());
		
		if (contac != null) {
			daoContacto.editarContacto(cont);
		} else {
			throw new ExcepcionNegocio("El contacto no existe");
		}
	}

	/**
	 * metodo que busca un contacto
	 * @param id objeto por el cual se hace la busqueda del contactp
	 * @return la busqueda del contactp
	 * @throws Exception
	 */
	public Contacto buscarContacto(int id) throws Exception {
		return daoContacto.buscarContacto(id);
	}

}
