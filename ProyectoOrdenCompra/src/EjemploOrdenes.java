public class EjemploOrdenes {
    public static void main(String[] args) {

                        //Primer Orden
        OrdenCompra orden1 = new OrdenCompra("Compras para finde semana");
        orden1.setCliente((new Cliente("Pedro","Muñoz")));

        Producto product2 = new Producto("Andes","Cerveza Andes",1680); //Segunda forma creando el objeto aparte
        orden1.addProducto(product2); //Y despues pasandole por argumento el objeto creado
        orden1.addProducto(new Producto("Malboro","MalbConvertible",2400)); //Primer forma de crear y pasar argumento
        orden1.addProducto(new Producto("Smirnoff","Vodka Frutilla",8000));
        orden1.addProducto(new Producto("Branca","Fernet Branca",8000));

                            //Segunda Orden

        Cliente cliente2 = new Cliente("Fausto","Sosa");
        OrdenCompra orden2 = new OrdenCompra("Compras de limpieza");

        orden2.addProducto(new Producto("Laviz","Lavandina",1000));
        orden2.addProducto(new Producto("Vanish","Perfume Para Piso",800));
        orden2.addProducto(new Producto("Zorro","Detergente",1200));
        orden2.addProducto(new Producto("Zorro","Jabón Liquido Para Ropa",2500));

                        //Tercer Orden

        Cliente cliente3 = new Cliente("Nicolas","Nepsa");
        OrdenCompra orden3 = new OrdenCompra("Compras del dia para Comer");

        orden3.addProducto(new Producto("Molto","Fideos",1000));
        orden3.addProducto(new Producto("Knor","Bareniques",2500));
        orden3.addProducto(new Producto("Arcor","Salsa de tomate",800));
        orden3.addProducto(new Producto("Serenisima","Leche Entera",1200));

        OrdenCompra[] ordernes = {orden1,orden2,orden3};

        for(OrdenCompra orden: ordernes){
            System.out.println("Nombre del cliente: " + orden.getCliente());
            System.out.println("Descripcion de orden: " + orden.getDescripcion());
            System.out.println ("Fecha de la orden" + orden.getFecha());

                for(Producto p: orden.getProductos()) {
                    System.out.println("Nombre del producto: " + p.getNombre() + "Fabricante: " + p.getFabricante() +
                            "Precio: " + p.getPrecio());

                }
        }


    }
}
