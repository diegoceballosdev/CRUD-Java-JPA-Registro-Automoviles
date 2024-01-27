package com.mycompany.concesionariaautomovil.igu;

import com.mycompany.concesionariaautomovil.logica.Automovil;
import com.mycompany.concesionariaautomovil.logica.ControladoraLogica;
import java.awt.Color;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaAutomovil extends javax.swing.JFrame {
    
    ControladoraLogica controladoraLog = null;

    public ConsultaAutomovil() {
        controladoraLog = new ControladoraLogica();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutomoviles = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Fira Code", 0, 48)); // NOI18N
        jLabel1.setText("Lista de Automoviles");

        tablaAutomoviles.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        tablaAutomoviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAutomoviles);

        jLabel2.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel2.setText("Datos de Automoviles:");

        btnAtras.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/volverAtras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //CONTROLAR QUE LA TABLA NO ESTE VACIA
        if (tablaAutomoviles != null) {
            
            //CONTROLA QUE HAYA UNA FILA SELECCIONADA
            if (tablaAutomoviles.getSelectedRow() != -1) {
                
                //OBTENER ID PARA ELIMINAR
                int idAutomovil = Integer.parseInt(String.valueOf(tablaAutomoviles.getValueAt(tablaAutomoviles.getSelectedRow(), 0)));
                
                //LLAMAR AL METODO BORRAR
                controladoraLog.eliminarAutomovil(idAutomovil);
                
                //INFORMAR AL USUARIO EL "BORRADO EXITOSO"
                mostrarMensaje("Automovil eliminado exitosamente", "Info", "Borrado de Automovil");
                
                //CARGO LA TABLA NUEVAMENTE PUES AL ELIMINAR, FUE ACTUALIZADA
                cargarTabla();
            }
            else{
                mostrarMensaje("No se selecciono ningun Automovil", "Error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("Tabla vacia: Nada para eliminar", "Error", "Error al eliminar");
        }     
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        //VERIFICAR QUE LA TABLA NO ESTE VACIA:
        if (tablaAutomoviles != null) {
            
            //VERIFICAR QUE SE HAYA SELECCIONADO UNA FILA:
            if (tablaAutomoviles.getSelectedRow() != -1) {
                
                //OBTENER ID DEL REGISTRO A EDITAR: 
                int idAutomovil = Integer.parseInt(String.valueOf(tablaAutomoviles.getValueAt(tablaAutomoviles.getSelectedRow(), 0)));
                
                //PANTALLA DE EDICION:
                EditarAutomovil ventanaEditar = new EditarAutomovil(controladoraLog, idAutomovil);
                ventanaEditar.setVisible(true);
                ventanaEditar.setLocationRelativeTo(null);
                ventanaEditar.setResizable(false);
                ventanaEditar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                //CERRAR VENTANA ACTUAL:
                this.dispose();

            }
            else{
                mostrarMensaje("No se selecciono ningun automovil", "Error", "Error al editar");
            }
        }
        else{
            mostrarMensaje("Tabla Vacia: Nada para editar","Error","Error al Editar");
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        this.dispose();

        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }//GEN-LAST:event_btnAtrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAutomoviles;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        //DEFINIR EL MODELO DE LA TABLA:
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            
            //DETERMINO QUE FILAS Y COLUMNAS NO SEAN EDITABLES:
            @Override
            public boolean isCellEditable(int row, int coluimn){
                return false;
            }   
        };
        
        //ESTABLECER NOMBRE DE COLUMNAS:
        String[] titulos = {"ID", "Modelo", "Marca", "Color", "Motor", "Patente", "N°Puertas"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //RECUPERAR LISTA DE AUTOS DE LA BD:
        List <Automovil> listaAutos = controladoraLog.consultarListaAutomoviles();
        
        //RECORRER LISTA Y AGREGAR CADA REGISTRO A LAS FILAS DEl MODELO DE TABLA: 
        if (listaAutos != null) {
            for(Automovil auto : listaAutos){
                Object[] objeto = {auto.getId(), auto.getModelo(), auto.getMarca(), auto.getColor(), auto.getMotor(), auto.getPatente(), auto.getCantPuertas()};
            
            modeloTabla.addRow(objeto);
            }
        }
        
        //ASIGNAR MODELO DE TABLA A LA "TABLA DE MASCOTAS":
        tablaAutomoviles.setModel(modeloTabla);
        
        //PERSONALIZAR TABLA:
        tablaAutomoviles.getTableHeader().setBackground(new Color(240, 233, 254));
        tablaAutomoviles.setRowHeight(25);
    }
    
    private void mostrarMensaje(String msj, String tipo, String titulo) {
        
        JOptionPane optionPane = new JOptionPane(msj);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }
}
