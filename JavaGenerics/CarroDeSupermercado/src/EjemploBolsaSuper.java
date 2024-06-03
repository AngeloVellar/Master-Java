public class EjemploBolsaSuper {
    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaDeFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaDeLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaDeLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaDeNoPerecibles = new BolsaSupermercado<>();

//        System.out.print("--------------------BOLSA DE FRUTAS----------------------");
        bolsaDeFrutas.addProduct(new Fruta("mandarina",640.50,"Naranja",542));
        bolsaDeFrutas.addProduct(new Fruta("Banana",820.50,"Amarillo",600));
        bolsaDeFrutas.addProduct(new Fruta("Manzana",730.60,"Rojo",800));
        bolsaDeFrutas.addProduct(new Fruta("Pera",367.40,"Verde/Amarillo",500));
        bolsaDeFrutas.addProduct(new Fruta("Frutilla",1.200,"Rojo",1000));
//        System.out.print("--------------------BOLSA DE LACTEOS----------------------");
        bolsaDeLacteos.addProduct(new Lacteo("Helado",4.000,2,500));
        bolsaDeLacteos.addProduct(new Lacteo("Leche Chocolatada",1.350,3,250));
        bolsaDeLacteos.addProduct(new Lacteo("Queso crema",2.200,4,530));
        bolsaDeLacteos.addProduct(new Lacteo("Dulce de leche",2.500,1,600));
        bolsaDeLacteos.addProduct(new Lacteo("Leche descremada",867.60,2,150));
//        System.out.print("--------------------BOLSA DE LIMPIEZA----------------------");
        bolsaDeLimpieza.addProduct(new Limpieza("Jabón Líquido", 150.00, "Glicerina", 1));
        bolsaDeLimpieza.addProduct(new Limpieza("Detergente", 200.00, "Sulfato de sodio", 2));
        bolsaDeLimpieza.addProduct(new Limpieza("Desinfectante", 250.00, "Cloro", 1));
        bolsaDeLimpieza.addProduct(new Limpieza("Limpiador Multiuso", 180.00, "Amoníaco", 1));
        bolsaDeLimpieza.addProduct(new Limpieza("Quitagrasa", 220.00, "Sodium hydroxide", 1));
//        System.out.print("--------------------BOLSA DE NOPERECIBLES----------------------");

        bolsaDeNoPerecibles.addProduct(new NoPerecible("Arroz", 50.00, 1000, 3500));
        bolsaDeNoPerecibles.addProduct(new NoPerecible("Fideos", 30.00, 500, 2000));
        bolsaDeNoPerecibles.addProduct(new NoPerecible("Lentejas", 40.00, 750, 2500));
        bolsaDeNoPerecibles.addProduct(new NoPerecible("Harina", 25.00, 1000, 3000));
        bolsaDeNoPerecibles.addProduct(new NoPerecible("Azúcar", 35.00, 1000, 4000));

        System.out.println("-------------FRUTAS-------------");
        for(Fruta fruta: bolsaDeFrutas.getProductos()){
            System.out.println("----" + fruta.getNombre());
        }
        System.out.println("-------------------------------- Limpieza ---------------------------------");
        for (Limpieza prod : bolsaDeLimpieza.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitros());
        }
        System.out.println("-------------------------------- Lacteo ---------------------------------");
        for (Lacteo prod : bolsaDeLacteos.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Cantidad (gr/cc): " + prod.getCantidad());
            System.out.println("Proteinas (gr): " + prod.getProteinas());
        }
        System.out.println("-------------------------------- NoPerecible ---------------------------------");
        for (NoPerecible prod : bolsaDeNoPerecibles.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Calorias (kCal): " + prod.getCalorias());
            System.out.println("Contenido neto (gr): " + prod.getContenido());
        }
    }
}
