package com.mycompany.concesionariaautomovil.persistencia;

import com.mycompany.concesionariaautomovil.logica.Automovil;
import com.mycompany.concesionariaautomovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    // ---------------------------- CREATE ----------------------------
    
    public void cargarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    // ---------------------------- READ ----------------------------

    public Automovil consultarAutomovil(int idAutomovil) {
        return autoJpa.findAutomovil(idAutomovil);
    }
    
    public List<Automovil> consultarListaAutomoviles() {
        return autoJpa.findAutomovilEntities();
    }

    // ---------------------------- UPDATE ----------------------------
    
    public void editarAutomovil(Automovil automovil) {
        try {
            autoJpa.edit(automovil);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    // ---------------------------- DELETE ----------------------------
    
    public void eliminarAutomovil(int idAutomovil) {

        try {
            autoJpa.destroy(idAutomovil);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }





}
