
package com.mycompany.proyecto;

import modelos.Evento;

public class Contexto {
    
    private static Evento evento = new Evento();

    public static Evento getVariable() {
        
        return evento;
    }

    public static void setVariable(Evento event) {
        
        evento = event;
    }
    
    
}
