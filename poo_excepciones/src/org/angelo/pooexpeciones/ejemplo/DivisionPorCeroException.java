package org.angelo.pooexpeciones.ejemplo;

public class DivisionPorCeroException extends Exception {
    public DivisionPorCeroException(String mensaje){
        super(mensaje);
    }
}
