package org.aguzman.patrones.factory;

import org.aguzman.patrones.factory.producto.PizzaCaliforniaQueso;
import org.aguzman.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "Queso":
                producto = new PizzaCaliforniaQueso();
                break;

            case "Vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}
