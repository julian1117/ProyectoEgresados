package co.edu.eam.disenosoft.egresado.logica.bos;

import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOEmpresaJPA;

public class BOEmpresa {

	private DAOEmpresaJPA daoEmpresa;

	public BOEmpresa() {
		daoEmpresa = new DAOEmpresaJPA();
	}

	public void crearEmpresa (Empresa empresa) throws Exception{
		Empresa emp = daoEmpresa.buscarEmpresa(empresa.getId());
		if(emp == null){
			daoEmpresa.crearEmpresa(empresa);
		}else{
			throw new ExcepcionNegocio("La empresa ya esta registrada");
		}
	}

	public void editarEmpresa (Empresa empresa) throws Exception{
		Empresa emp = daoEmpresa.buscarEmpresa(empresa.getId());
		
		if(emp != null){
			daoEmpresa.editarEmpresa(empresa);
		}else{
			throw new ExcepcionNegocio("No hay empresa registrada con este ID");
		}
	}
	
	public Empresa buscarEmpresa (int idEmpresa) throws Exception{
		return daoEmpresa.buscarEmpresa(idEmpresa);
	}
	
}
