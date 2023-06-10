
package com.mycompany.proyecto;

import modelos.Cliente;


public class DtCliente {
      private static Cliente cl = new Cliente();

    public static Cliente getVariable() {
        
        return cl;
    }

    public static void setVariable(Cliente event) {
        
        cl = event;
    }
}
