package co.edu.eam.disenosoft.egresado.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.bos.BOCiudad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOContacto;
import co.edu.eam.disenosoft.egresado.logica.bos.BODepartamento;
import co.edu.eam.disenosoft.egresado.logica.bos.BOEmpresa;
import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOPais;
import co.edu.eam.disenosoft.egresado.logica.bos.BOSectorLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Contacto;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Departamento;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Pais;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;

/**
 * Controlador empresa en el cual se hace uso de los BO 
 * @author laura posada
 *
 */
public class ControladorAdministrarEmpresa {

	/**
	 * se llama los bo de cada una de las entidades
	 */
	private BOEmpresa boEmpresa;
	private BOInformacionLaboral boInfoLab;
	private BOCiudad boCiudad;
	private BODepartamento boDept;
	private BOSectorLaboral boSectorLab;
	private BOContacto boContacto;
	private BOPais boPais;

	/**
	 * constructor de la clase
	 */
	public ControladorAdministrarEmpresa() {
		boEmpresa = new BOEmpresa();
		boInfoLab = new BOInformacionLaboral();
		boCiudad = new BOCiudad();
		boDept = new BODepartamento();
		boSectorLab = new BOSectorLaboral();
		boContacto = new BOContacto();
		boPais = new  BOPais();
	}

	/**
	 * metodo que crea una empresa por medio de su bo
	 * @param empresa objeto por el cual se va a crear la empresa
	 * @throws Exception
	 */
	public void crearEmpresa(Empresa empresa) throws Exception {
		boEmpresa.crearEmpresa(empresa);
	}

	/**
	 * metodo que edita una empresa que ya haya sido creada por medio de su bo
	 * @param empresa objeto por el cual se va a editar la empresa
	 * @throws Exception
	 */
	public void editarEmpresa(Empresa empresa) throws Exception {
		boEmpresa.editarEmpresa(empresa);
	}

	/**
	 * metodo que busca una empresa
	 * @param idEmpresa objeto por el cual se va a realizar la busqueda
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public Empresa buscarEmpresa(int idEmpresa) throws Exception {
		return boEmpresa.buscarEmpresa(idEmpresa);
	}

	/**
	 * lista los sectores laborales por medio del bo
	 * @return los sectores laborados encontrados
	 * @throws Exception
	 */
	public List<SectorLaboral> listaLaboral() throws Exception {
		return boInfoLab.listaLaboral();
	}

	/**
	 * lista ciudades
	 * @return las ciudades encontradas por medio del bo
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudad() throws Exception {		
		return boCiudad.listarCiudad();
	}

	/**
	 * metodo que busca una ciudad 
	 * @param ciudad objeto por el cual se va a buscar la ciudad
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public Ciudad buscarCiudad(int ciudad) throws Exception {
		return boCiudad.buscarCiudad(ciudad);
	}
	
	/**
	 * lista loos departamentos 
	 * @return la lista de depoartamento encontrados por medio del bo
	 * @throws Exception
	 */
	public List<Departamento> listarDepartamento() throws Exception {
		return boDept.listarDepartamento();
	}

	/**
	 * metodo que busca un departamento
	 * @param idDep objeto por el cual se va a buscar el departamento
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public Departamento buscarDepartamento (int idDep) throws Exception{
		return boDept.buscarDepartamento(idDep);
	}
	
	/**
	 * metodo que busca un sector laboral
	 * @param idSect objeto por el cual se va a buscar el sector laboral
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public SectorLaboral buscarSectorLaboral(int idSect) throws Exception {
		return boSectorLab.buscarSectorLaboral(idSect);
	}
	
	/**
	 * metodo que crea un contacto por medio de su bo
	 * @param cont objeto por el cual se va a crear el contactp 
	 * @throws Exception
	 */
	public void crearContacto(Contacto cont) throws Exception {
		boContacto.crearContacto(cont);
	}
	
	/**
	 * metodo que edita un contacto ya creado por medio de su bo
	 * @param cont objeto por el cual se va editar el contacto
	 * @throws Exception
	 */
	public void editarContacto(Contacto cont) throws Exception {
		boContacto.editarContacto(cont);
	}
	
	/**
	 * metodo que busca un contacto 
	 * @param id objeto por el cual se va a buscar el contacto
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public Contacto buscarContacto(int id) throws Exception {
		return boContacto.buscarContacto(id);
	}
	/**
	 * Lista de paises
	 * @return lista de paises
	 * @throws Exception
	 */
	public List<Pais> listaPais() throws Exception {
		return boPais.listaPais();
	}
	/**
	 * Buscar pais por id
	 */
	public Pais buscarPais(int idPais) throws Exception {
		return boPais.buscarPais(idPais);
	}
	
}
