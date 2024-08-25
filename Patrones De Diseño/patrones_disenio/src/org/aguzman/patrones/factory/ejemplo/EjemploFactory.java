package org.aguzman.patrones.factory.ejemplo;

import org.aguzman.patrones.factory.PizzaProducto;
import org.aguzman.patrones.factory.PizzeriaCaliforniaFactory;
import org.aguzman.patrones.factory.PizzeriaNewYorkFactory;
import org.aguzman.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory cl = new PizzeriaCaliforniaFactory();

        PizzaProducto pizzaCl = cl.ordenarPizza("Queso");
        System.out.println("Juanma ordena la pizza = " + pizzaCl.getNombre() );
    }
}
