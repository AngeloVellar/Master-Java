package org.aguzman.patrones.factory;

import org.aguzman.patrones.factory.producto.PizzaNewYorkPeperoni;
import org.aguzman.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
          return switch (tipo) {
                case "Vegetariana" -> new PizzaNewYorkVegetariana();
                case "Peperoni" -> new PizzaNewYorkPeperoni();
                default -> null;
            };
        }

    }

