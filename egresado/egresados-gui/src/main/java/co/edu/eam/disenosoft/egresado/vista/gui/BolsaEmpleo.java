/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.disenosoft.egresado.vista.gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import co.edu.eam.disenosoft.egresado.vista.controlador.ControladorBolsa;



public class BolsaEmpleo extends javax.swing.JFrame{

	private ControladorBolsa conBolsa;

	/**
	 * Creates new form BolsaEmpleo
	 */
	public BolsaEmpleo() {
		conBolsa = new ControladorBolsa();	
		initComponents();	
		this.setLocationRelativeTo(this);
		llenarComboArea();
		llenarComboCiudad();
		listarEmpresa();
		jBCerrarOferta.setEnabled(false);
		llenarComboPrograma();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSSalario = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCalendarOferta = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAResumen = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTADescripcionOferta = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTARequerimientosOferta = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jBRegistro = new javax.swing.JButton();
        jCBAreaConocimiento = new javax.swing.JComboBox();
        jCBCiudadOferta = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTFIdOferta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jBCerrarOferta = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jCBIdEmpresa = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jCalendarCerrar = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jCBPrograma = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventana Bolsa de empleo");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Area de conocimiento");

        jLabel3.setText("Cargo a ofrecer");

        jLabel4.setText("Salario Opcional");

        jSSalario.setModel(new javax.swing.SpinnerNumberModel(689454.0d, 689454.0d, null, 1.0d));
        jSSalario.setRequestFocusEnabled(false);

        jLabel6.setText("Cuidad de la oferta");

        jLabel8.setText("Fecha de la oferta");

        jCalendarOferta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Resumen");

        jTAResumen.setColumns(20);
        jTAResumen.setRows(5);
        jScrollPane2.setViewportView(jTAResumen);

        jTADescripcionOferta.setColumns(20);
        jTADescripcionOferta.setRows(5);
        jScrollPane3.setViewportView(jTADescripcionOferta);

        jLabel5.setText("Descripcion de la oferta");

        jTARequerimientosOferta.setColumns(20);
        jTARequerimientosOferta.setRows(5);
        jScrollPane1.setViewportView(jTARequerimientosOferta);

        jLabel7.setText("Requerimientos de la oferta");

        jBRegistro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jBRegistro.setText("REGISTRO");
        jBRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistroActionPerformed(evt);
            }
        });

        jLabel10.setText("Id Oferta");

        jTFIdOferta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFIdOfertaKeyTyped(evt);
            }
        });

        jLabel11.setText("Empresa");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("si");

        jLabel12.setText("Cerrar oferta");

        jBCerrarOferta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBCerrarOferta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarOferta.png"))); // NOI18N
        jBCerrarOferta.setText("CERRAR OFERTA");
        jBCerrarOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarOfertaActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search-24.png"))); // NOI18N
        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jCBIdEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Fecha de cierre");

        jLabel14.setText("Programa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBRegistro)
                        .addGap(30, 30, 30)
                        .addComponent(jBBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jBCerrarOferta))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFCargo)
                                    .addComponent(jCBAreaConocimiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCBCiudadOferta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFIdOferta)
                                    .addComponent(jCBIdEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCalendarOferta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCalendarCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jCBPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1))
                                .addGap(78, 78, 78)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel1))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTFIdOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCBAreaConocimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBIdEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFCargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jCBCiudadOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCalendarOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCalendarCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jSSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jCheckBox1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jCBPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegistro)
                    .addComponent(jBCerrarOferta)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18))
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eam.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBBuscarActionPerformed

		try {

			int idoferta = Integer.parseInt(jTFIdOferta.getText());
			OfertaLaboral oferta = conBolsa.buscarOferta(idoferta);

			if (oferta != null) {

				listarAreaOf(oferta);
				listarCiudadOf(oferta);
				jTFCargo.setText(oferta.getCargoOfrecer());
				jSSalario.setValue(oferta.getSalario());
				jCalendarOferta.setDate(oferta.getFechaoferta());
				jCalendarCerrar.setDate(oferta.getFechaofertaCierre());
				jTAResumen.setText(oferta.getResumen());	
				Empresa empresa = conBolsa.buscarEmpresa(oferta.getIdempresa().getId());
				jCBIdEmpresa.setSelectedItem(empresa);
				jTARequerimientosOferta.setText(oferta.getRequisitoOferta());
				jTADescripcionOferta.setText(oferta.getDescripcionOferta());
				jCBPrograma.setSelectedItem(oferta.getPrograma());
				
				
				boolean ch = oferta.isCerrarOferta();
				//
				if (ch == true) {
					jCheckBox1.setSelected(true);
				}

			} else {
				JOptionPane.showMessageDialog(null, "No existe oferta laboral registrada");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		jBCerrarOferta.setEnabled(true);
		jBRegistro.setEnabled(false);
		inhabilitar();
		
		
	}// GEN-LAST:event_jBBuscarActionPerformed

	private void jCBIdEmpresaKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jCBIdEmpresaKeyTyped
		key(evt);
	}// GEN-LAST:event_jCBIdEmpresaKeyTyped

	private void jBRegistroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBRegistroActionPerformed
		try {
			OfertaLaboral ofertaLa = new OfertaLaboral();
			String area = (String) jCBAreaConocimiento.getSelectedItem();
			String[] datos = area.split("-");
			AreaInteres idArea = conBolsa.buscarIdArea(Integer.parseInt(datos[0]));

			ofertaLa.setIdArea(idArea);
			ofertaLa.setCargoOfrecer(jTFCargo.getText());
			ofertaLa.setSalario((Double) jSSalario.getValue());

			String ciudad = (String) jCBCiudadOferta.getSelectedItem();
			String[] datosC = ciudad.split("-");
			Ciudad idCiudad = conBolsa.buscarCiudad(Integer.parseInt(datosC[0]));
			ofertaLa.setIdCiudad(idCiudad);
			Programa programa = (Programa) jCBPrograma.getSelectedItem();
			ofertaLa.setPrograma(programa);
			ofertaLa.setFechaoferta(jCalendarOferta.getDate());
			ofertaLa.setFechaofertaCierre(jCalendarCerrar.getDate());
			ofertaLa.setResumen(jTAResumen.getText());
			ofertaLa.setIdOferta(Integer.parseInt(jTFIdOferta.getText()));

			Empresa emp = (Empresa) jCBIdEmpresa.getSelectedItem();
			
			//int idE = (Integer) jCBIdEmpresa.getSelectedItem();
			Empresa empre = conBolsa.buscarEmpresa(emp.getId());

			ofertaLa.setIdempresa(empre);
			ofertaLa.setRequisitoOferta(jTARequerimientosOferta.getText());
			ofertaLa.setDescripcionOferta(jTADescripcionOferta.getText());

			boolean cerrado;
			// valida que el checkPostgrado este true o false
			if (jCheckBox1.isSelected() == true) {
				cerrado = true;
			} else {
				cerrado = false;
			}

			ofertaLa.setCerrarOferta(cerrado);

			conBolsa.crearOfertaLaboral(ofertaLa);
			JOptionPane.showMessageDialog(null, "La oferta laboral ha sido creada!!");
			limpiarCampos();

		} catch (ExcepcionNegocio exN) {
			JOptionPane.showMessageDialog(null, exN.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// GEN-LAST:event_jBRegistroActionPerformed

	private void jBCerrarOfertaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBCerrarOfertaActionPerformed

		try {
			OfertaLaboral ofertaLa = new OfertaLaboral();
			String area = (String) jCBAreaConocimiento.getSelectedItem();
			String[] datos = area.split("-");
			AreaInteres idArea = conBolsa.buscarIdArea(Integer.parseInt(datos[0]));

			ofertaLa.setIdArea(idArea);
			ofertaLa.setCargoOfrecer(jTFCargo.getText());
			ofertaLa.setSalario((Double) jSSalario.getValue());

			String ciudad = (String) jCBCiudadOferta.getSelectedItem();
			String[] datosC = ciudad.split("-");
			Ciudad idCiudad = conBolsa.buscarCiudad(Integer.parseInt(datosC[0]));
			ofertaLa.setIdCiudad(idCiudad);
			Programa programa = (Programa) jCBPrograma.getSelectedItem();
			ofertaLa.setPrograma(programa);
			ofertaLa.setFechaoferta(jCalendarOferta.getDate());
			ofertaLa.setFechaofertaCierre(jCalendarCerrar.getDate());
			ofertaLa.setResumen(jTAResumen.getText());
			ofertaLa.setIdOferta(Integer.parseInt(jTFIdOferta.getText()));

			Empresa emp = (Empresa) jCBIdEmpresa.getSelectedItem();
			Empresa empre = conBolsa.buscarEmpresa(emp.getId());

			ofertaLa.setIdempresa(empre);
			ofertaLa.setRequisitoOferta(jTARequerimientosOferta.getText());
			ofertaLa.setDescripcionOferta(jTADescripcionOferta.getText());

			boolean ch = ofertaLa.isCerrarOferta();	
			if (ch == true) {
				jCheckBox1.setSelected(true);
			}			
			boolean cerrado;
			// valida que el checkPostgrado este true o false
			if (jCheckBox1.isSelected() == true) {
				cerrado = true;
			} else {
				cerrado = false;
			}
			if(ch == cerrado){
				
			}else{
				ofertaLa.setCerrarOferta(cerrado);
				conBolsa.editarOferta(ofertaLa);
				JOptionPane.showMessageDialog(null, "La oferta laboral ha sido cerrada!!");
				limpiarCampos();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		jBBuscar.setEnabled(true);
		jBCerrarOferta.setEnabled(false);
		jBRegistro.setEnabled(true);
		limpiarCampos();
		habilitar();
	}// GEN-LAST:event_jBCerrarOfertaActionPerformed

	private void jTFIdOfertaKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTFIdOfertaKeyTyped
		key(evt);
	}// GEN-LAST:event_jTFIdOfertaKeyTyped

	/**
	 * llena el combo que le pertenece a la area de interes creadas
	 */
	public void llenarComboArea() {
		try {
			jCBAreaConocimiento.removeAllItems();
			jCBAreaConocimiento.addItem("Seleccione una area..,");
			List<AreaInteres> lista = conBolsa.listarAreas();

			for (int i = 0; i < lista.size(); i++) {

				jCBAreaConocimiento.addItem(lista.get(i).getIdArea() + "-" + lista.get(i).getNombre().toString());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * llena el combo que le pertenece la ciudad que ya han sido creadas
	 */
	public void llenarComboCiudad() {
		try {
			jCBCiudadOferta.removeAllItems();
			jCBCiudadOferta.addItem("Seleccione una ciudad");
			List<Ciudad> lista = conBolsa.listarCiudad();

			for (int i = 0; i < lista.size(); i++) {

				jCBCiudadOferta.addItem(lista.get(i).getIdCiudad() + "-" + lista.get(i).getNombre());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo para la validacion de los campos que solo permiten el ingreso de
	 * numeros
	 * 
	 * @param evt
	 */
	public void key(java.awt.event.KeyEvent evt) {
		char c = evt.getKeyChar();
		if (c < '0' || c > '9') {
			if (c != evt.VK_BACK_SPACE) {
				evt.consume();
				JOptionPane.showMessageDialog(null, "Ingresa Solo Numeros");
			}
			// getToolkit().beep();

		}
	}

	/**
	 * metodo que llena el combo del area de interes cuando se hace la busqueda
	 * de una oferta
	 * 
	 * @param ofertaL
	 *            la ofreta que recibe para corresponder la area buscada
	 */
	public void listarAreaOf(OfertaLaboral ofertaL) {

		jCBAreaConocimiento.removeAllItems();

		try {
			List<AreaInteres> areas = conBolsa.listtarAreasIn(ofertaL);
			for (int i = 0; i < areas.size(); i++) {
				jCBAreaConocimiento.addItem(areas.get(i).getIdArea() + "-" + areas.get(i).getNombre());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * metodo que llena el combo de ciudad cuando se hace la busqueda de la
	 * oferta
	 * 
	 * @param ofertaL
	 *            la ofreta que recibe para corresponder la area buscada
	 */
	public void listarCiudadOf(OfertaLaboral ofertaL) {
		jCBCiudadOferta.removeAllItems();
		try {
			List<Ciudad> ciu = conBolsa.listarCiudadOf(ofertaL);
			for (int i = 0; i < ciu.size(); i++) {
				jCBCiudadOferta.addItem(ciu.get(i).getIdCiudad() + "-" + ciu.get(i).getNombre());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * llena el combo con los programas por medio de la lista
	 */
	public void llenarComboPrograma(){
		try {
			List<Programa> listaPrograma = conBolsa.listaPrograma();
			jCBPrograma.removeAllItems();
			for(Programa programa: listaPrograma){
				jCBPrograma.addItem(programa);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * lista una empresa que ha sido buscada 
	 * @param oferta la oferta buscada a la cual se le busca la 
	 * empresa 
	 */
	public void listarEmpresa() {
		try {
			jCBIdEmpresa.removeAllItems();
			//jCBIdEmpresa.addItem("Seleccione una empresa");
			List<Empresa> listaEmpresa = conBolsa.listaEmpresa();
			for (int i = 0; i < listaEmpresa.size(); i++) {
				jCBIdEmpresa.addItem(listaEmpresa.get(i));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * limpia los campos de la ventana
	 */
	public void limpiarCampos() {
		jTFIdOferta.setText(null);
		jCBAreaConocimiento.setSelectedIndex(0);
		jCBCiudadOferta.setSelectedIndex(0);
		jTFCargo.setText(null);
		jSSalario.setValue(689.454);;
		jCalendarOferta.setDate(null);
		jTAResumen.setText(null);
		jCalendarCerrar.setDate(null);
		jCBPrograma.setSelectedIndex(0);
		jCBIdEmpresa.setSelectedIndex(0);
		jTARequerimientosOferta.setText(null);
		jTADescripcionOferta.setText(null);
		jCheckBox1.setSelected(false);
			
	}
	
	/**
	 * inhabilita los campos en la busqueda
	 */
	public void inhabilitar(){
		jTFIdOferta.setEnabled(false);
		jCBAreaConocimiento.setEnabled(false);;
		jCBCiudadOferta.setEnabled(false);
		jTFCargo.setEnabled(false);
		jSSalario.setEnabled(false);
		jCalendarOferta.setEnabled(false);
		jTAResumen.setEnabled(false);
		jCBIdEmpresa.setEnabled(false);
		jTARequerimientosOferta.setEnabled(false);
		jTADescripcionOferta.setEnabled(false);
		jCBPrograma.setEnabled(false);
		jCalendarCerrar.setEnabled(false);
	}
	
	/**
	 * habilita los campos 
	 */
	public void habilitar(){
		jTFIdOferta.setEnabled(true);
		jCBAreaConocimiento.setEnabled(true);;
		jCBCiudadOferta.setEnabled(true);
		jTFCargo.setEnabled(true);
		jSSalario.setEnabled(true);
		jCalendarOferta.setEnabled(true);
		jTAResumen.setEnabled(true);
		jCBIdEmpresa.setEnabled(false);
		jTARequerimientosOferta.setEnabled(true);
		jTADescripcionOferta.setEnabled(true);
		jCBPrograma.setEnabled(true);
		jCalendarCerrar.setEnabled(true);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCerrarOferta;
    private javax.swing.JButton jBRegistro;
    private javax.swing.JComboBox<String> jCBAreaConocimiento;
    private javax.swing.JComboBox<String> jCBCiudadOferta;
    private javax.swing.JComboBox jCBIdEmpresa;
    private javax.swing.JComboBox jCBPrograma;
    private com.toedter.calendar.JDateChooser jCalendarCerrar;
    private com.toedter.calendar.JDateChooser jCalendarOferta;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSSalario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTADescripcionOferta;
    private javax.swing.JTextArea jTARequerimientosOferta;
    private javax.swing.JTextArea jTAResumen;
    private javax.swing.JTextField jTFCargo;
    private javax.swing.JTextField jTFIdOferta;
    // End of variables declaration//GEN-END:variables

}
