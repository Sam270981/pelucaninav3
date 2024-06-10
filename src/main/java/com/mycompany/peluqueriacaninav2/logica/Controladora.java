
package com.mycompany.peluqueriacaninav2.logica;

import com.mycompany.peluqueriacaninav2.persistencia.Controladorapersistencia;
import java.util.List;


public class Controladora {
   Controladorapersistencia ControllerPersis = new  Controladorapersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenesp, String nombre_dueño, String cel_dueño) {
        Dueño dueño = new Dueño();
        dueño.setNombre(nombre_dueño);
        dueño.setCelDueño(cel_dueño);
        
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenesp);
        masco.setObservaciones(observaciones);
        masco.setUn_Dueño(dueño);
        
        ControllerPersis.guardar(dueño,masco);
        
        
        
    }

    public List<Mascota> traermascotas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
