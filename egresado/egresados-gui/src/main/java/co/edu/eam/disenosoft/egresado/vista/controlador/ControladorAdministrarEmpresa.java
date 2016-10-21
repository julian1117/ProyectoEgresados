package co.edu.eam.disenosoft.egresado.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.bos.BOCiudad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOContacto;
import co.edu.eam.disenosoft.egresado.logica.bos.BODepartamento;
import co.edu.eam.disenosoft.egresado.logica.bos.BOEmpresa;
import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOSectorLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Contacto;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Departamento;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;

public class ControladorAdministrarEmpresa {

	private BOEmpresa boEmpresa;
	private BOInformacionLaboral boInfoLab;
	private BOCiudad boCiudad;
	private BODepartamento boDept;
	private BOSectorLaboral boSectorLab;
	private BOContacto boContacto;


	public ControladorAdministrarEmpresa() {
		boEmpresa = new BOEmpresa();
		boInfoLab = new BOInformacionLaboral();
		boCiudad = new BOCiudad();
		boDept = new BODepartamento();
		boSectorLab = new BOSectorLaboral();
		boContacto = new BOContacto();
	}

	/**
	 * 
	 * @param empresa
	 * @throws Exception
	 */
	public void crearEmpresa(Empresa empresa) throws Exception {
		boEmpresa.crearEmpresa(empresa);
	}

	/**
	 * 
	 * @param empresa
	 * @throws Exception
	 */
	public void editarEmpresa(Empresa empresa) throws Exception {
		boEmpresa.editarEmpresa(empresa);
	}

	/**
	 * 
	 * @param idEmpresa
	 * @return
	 * @throws Exception
	 */
	public Empresa buscarEmpresa(int idEmpresa) throws Exception {
		return boEmpresa.buscarEmpresa(idEmpresa);
	}

	public List<SectorLaboral> listaLaboral() throws Exception {
		return boInfoLab.listaLaboral();
	}

	/**
	 * 
	 * @param idOf
	 * @return
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudad() throws Exception {		
		return boCiudad.listarCiudad();
	}

	/**
	 * 
	 * @param ciudad
	 * @return
	 * @throws Exception
	 */
	public Ciudad buscarCiudad(int ciudad) throws Exception {
		return boCiudad.buscarCiudad(ciudad);
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Departamento> listarDepartamento() throws Exception {
		return boDept.listarDepartamento();
	}

	public Departamento buscarDepartamento (int idDep) throws Exception{
		return boDept.buscarDepartamento(idDep);
	}
	
	public SectorLaboral buscarSectorLaboral(int idSect) throws Exception {
		return boSectorLab.buscarSectorLaboral(idSect);
	}
	
	public void crearContacto(Contacto cont) throws Exception {
		boContacto.crearContacto(cont);
	}
	
	public void editarContacto(Contacto cont) throws Exception {
		boContacto.editarContacto(cont);
	}
	
	public Contacto buscarContacto(int id) throws Exception {
		return boContacto.buscarContacto(id);
	}
	
}
