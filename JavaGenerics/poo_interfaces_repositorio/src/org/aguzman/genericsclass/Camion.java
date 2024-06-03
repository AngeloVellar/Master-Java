package org.aguzman.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> {

    private List<T> objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList();

    }

    public void add(T objecto){
        if(this.objetos.size() <= max){
            this.objetos.add(objecto);
        }
        else {
            throw new RuntimeException("no hay mas espacio.");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
