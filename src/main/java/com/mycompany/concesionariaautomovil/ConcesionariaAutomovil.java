package com.mycompany.concesionariaautomovil;

import com.mycompany.concesionariaautomovil.igu.Principal;
import javax.swing.JFrame;

public class ConcesionariaAutomovil {

    public static void main(String[] args) {
        
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
