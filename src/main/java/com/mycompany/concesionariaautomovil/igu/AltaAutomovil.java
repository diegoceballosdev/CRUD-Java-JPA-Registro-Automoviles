package com.mycompany.concesionariaautomovil.igu;

import com.mycompany.concesionariaautomovil.logica.ControladoraLogica;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AltaAutomovil extends javax.swing.JFrame {
    
    private ControladoraLogica controladoraLog = null;

    public AltaAutomovil() {
        controladoraLog = new ControladoraLogica();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtMotor = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        txtCantPuertas = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        jTextField5.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Fira Code", 0, 48)); // NOI18N
        jLabel1.setText("Alta de Automoviles");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(160, 30, 551, 64);

        jLabel3.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel3.setText("Modelo:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(64, 140, 58, 25);

        jLabel4.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel4.setText("Color:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(64, 226, 58, 25);

        jLabel5.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel5.setText("Cant. Puertas:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(64, 355, 122, 25);

        jLabel6.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel6.setText("Motor:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(64, 269, 58, 25);

        jLabel7.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel7.setText("Patente:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(64, 315, 72, 19);

        jLabel8.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel8.setText("Marca:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(64, 183, 58, 25);

        txtMarca.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jPanel2.add(txtMarca);
        txtMarca.setBounds(128, 183, 390, 25);

        txtModelo.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jPanel2.add(txtModelo);
        txtModelo.setBounds(128, 140, 390, 25);

        txtColor.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jPanel2.add(txtColor);
        txtColor.setBounds(128, 226, 390, 25);

        txtMotor.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jPanel2.add(txtMotor);
        txtMotor.setBounds(128, 269, 390, 25);

        txtPatente.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jPanel2.add(txtPatente);
        txtPatente.setBounds(142, 312, 376, 25);

        txtCantPuertas.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jPanel2.add(txtCantPuertas);
        txtCantPuertas.setBounds(192, 355, 326, 25);

        btnGuardar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);
        btnGuardar.setBounds(630, 420, 177, 44);

        btnLimpiar.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar);
        btnLimpiar.setBounds(430, 420, 177, 44);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(520, 100, 300, 300);

        btnAtras.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/volverAtras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtras);
        btnAtras.setBounds(60, 420, 50, 44);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        //ALMACENAR LOS DATOS DE CADA TEXT FIELD EN UNA VARIABLE:
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String color = txtColor.getText();
        String motor = txtMotor.getText();
        String patente = txtPatente.getText();
        String cantPuertas = txtCantPuertas.getText();
        
        //SE ENVIAN LOS DATOS A LA CONTROLADORA LOGICA:
        controladoraLog.cargarAutomovil(modelo, marca, color, motor, patente, cantPuertas);
        
        //MENSAJE DE GUARDADO EXITOSO:
        JOptionPane optPane = new JOptionPane("El automvil se cargo exitosamente");
        optPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optPane.createDialog("Guardado Exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
             
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        //SE SETEAN TODOS LOS CAMPOS A VACIO:
        txtModelo.setText("");
        txtMarca.setText("");
        txtColor.setText("");
        txtMotor.setText("");
        txtPatente.setText("");
        txtCantPuertas.setText("");
                
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        
        this.dispose();
        
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }//GEN-LAST:event_btnAtrasActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtCantPuertas;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
