package org.aguzman.patrones.factory.producto;

import org.aguzman.patrones.factory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {

    public PizzaNewYorkPeperoni() {
        super();
        nombre = "Pizza New York Peperoni";
        masa = "Masa de Harina de Trigo";
        salsa = "Salsa de tomáte";
        ingredientes.add("Tomáte");
        ingredientes.add("Queso muzzarella");
        ingredientes.add("Peperoni");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 150°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando Pizza en triángulos ");
    }
}
