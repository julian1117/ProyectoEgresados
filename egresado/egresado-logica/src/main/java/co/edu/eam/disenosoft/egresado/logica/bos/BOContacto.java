package co.edu.eam.disenosoft.egresado.logica.bos;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Contacto;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOContactoJPA;

public class BOContacto {

	private DAOContactoJPA daoContacto;

	public BOContacto() {
		daoContacto = new DAOContactoJPA();
	}

	public void crearContacto(Contacto cont) throws Exception {
		Contacto contac = daoContacto.buscarContacto(cont.getIdEmpresa().getId());

		if (contac == null) {
			daoContacto.crearContacto(cont);
		} else {
			throw new ExcepcionNegocio("El contacto ya existe");
		}

	}

	public void editarContacto(Contacto cont) throws Exception {
		Contacto contac = daoContacto.buscarContacto(cont.getIdEmpresa().getId());
		
		if (contac != null) {
			daoContacto.editarContacto(cont);
		} else {
			throw new ExcepcionNegocio("El contacto no existe");
		}
	}

	public Contacto buscarContacto(int id) throws Exception {
		return daoContacto.buscarContacto(id);
	}

}
