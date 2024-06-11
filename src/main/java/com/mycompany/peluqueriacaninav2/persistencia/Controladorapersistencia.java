
package com.mycompany.peluqueriacaninav2.persistencia;

import com.mycompany.peluqueriacaninav2.logica.Dueño;
import com.mycompany.peluqueriacaninav2.logica.Mascota;
import java.util.List;


public class Controladorapersistencia {
DueñoJpaController DueñoJpa = new DueñoJpaController();
   MascotaJpaController MascotaJpa = new MascotaJpaController();

    public void guardar(Dueño dueño, Mascota masco) {
        DueñoJpa.create(dueño);
        
        MascotaJpa.create(masco);
        
        
    }

    public List<Mascota> traermascotas() {
        return MascotaJpa.findMascotaEntities();
    }
    }
   

