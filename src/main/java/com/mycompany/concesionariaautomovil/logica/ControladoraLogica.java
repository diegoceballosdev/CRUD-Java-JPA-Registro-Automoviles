package com.mycompany.concesionariaautomovil.logica;

import com.mycompany.concesionariaautomovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPers = new ControladoraPersistencia();

    // ---------------------------- CREATE ----------------------------
    
    public void cargarAutomovil(String modelo, String marca, String color, String motor, String patente, String cantPuertas) {
        
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controladoraPers.cargarAutomovil(auto);                 
    }

    // ---------------------------- READ ----------------------------
   
    public Automovil consultarAutomovil(int idAutomovil) {     
        return controladoraPers.consultarAutomovil(idAutomovil);      
    }
    
    public List<Automovil> consultarListaAutomoviles() {     
        return controladoraPers.consultarListaAutomoviles();      
    }
    
    // ---------------------------- UPDATE ----------------------------
    
    public void editarAutomovil(Automovil automovil, String modelo, String marca, String color, String motor, String patente, String cantPuertas) {
        
        //ACTUALIZAR LOS DATOS DEL AUTOMOVIL
        automovil.setMarca(marca);
        automovil.setModelo(modelo);
        automovil.setColor(color);
        automovil.setMotor(motor);
        automovil.setPatente(patente);
        automovil.setCantPuertas(cantPuertas);
        
        //ENVIAR REGISTRO DE AUTOMOVIL A LA BD:
        controladoraPers.editarAutomovil(automovil);       
    }
        
    // ---------------------------- DELETE ----------------------------
    
    public void eliminarAutomovil(int idAutomovil) {   
        controladoraPers.eliminarAutomovil(idAutomovil);       
    }



    
}
