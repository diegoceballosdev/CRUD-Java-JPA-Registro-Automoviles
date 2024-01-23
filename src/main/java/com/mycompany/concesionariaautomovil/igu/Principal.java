package com.mycompany.concesionariaautomovil.igu;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Fira Code", 0, 48)); // NOI18N
        jLabel1.setText("Registro de Automoviles");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 40, 670, 64);

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(labelLogo);
        labelLogo.setBounds(450, 142, 300, 288);

        btnConsulta.setFont(new java.awt.Font("Fira Code", 0, 18)); // NOI18N
        btnConsulta.setText("Consulta, Edicion y Baja");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsulta);
        btnConsulta.setBounds(100, 250, 324, 72);

        btnSalir.setFont(new java.awt.Font("Fira Code", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(100, 350, 324, 72);

        btnAlta.setFont(new java.awt.Font("Fira Code", 0, 18)); // NOI18N
        btnAlta.setText("Alta de Automoviles");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlta);
        btnAlta.setBounds(100, 150, 324, 72);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        
        ConsultaAutomovil ventanaConsulta = new ConsultaAutomovil();
        ventanaConsulta.setVisible(true);
        ventanaConsulta.setLocationRelativeTo(null);
        ventanaConsulta.setResizable(false);
        ventanaConsulta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.dispose();

    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        
        AltaAutomovil ventanaAlta = new AltaAutomovil();
        ventanaAlta.setVisible(true);
        ventanaAlta.setLocationRelativeTo(null);
        ventanaAlta.setResizable(false);
        ventanaAlta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.dispose();
        
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogo;
    // End of variables declaration//GEN-END:variables
}
