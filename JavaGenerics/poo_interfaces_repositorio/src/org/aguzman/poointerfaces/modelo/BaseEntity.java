package org.aguzman.poointerfaces.modelo;

public class BaseEntity {
    protected Integer id;
    private static int ultimoId;

    public BaseEntity(){
        this.id = ++ultimoId;
    }


}
