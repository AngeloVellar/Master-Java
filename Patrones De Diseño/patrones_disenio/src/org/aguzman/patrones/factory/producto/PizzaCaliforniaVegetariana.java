package org.aguzman.patrones.factory.producto;

import org.aguzman.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana(){
        super();
        nombre = "Pizza California Vegetariana";
        masa = "Masa delgada Light";
        salsa = "Salsa BBQ Light";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");

    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min. a 180°");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en cuadrados");
    }
}
