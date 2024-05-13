public class ProyectoCatalogo {
    public static void main(String[] args) {
        Producto producs[] = new Producto[6];
        producs[0] = new Libro(8000,21/7/2005,"John Green","Buscando a Alaska","Mestra");
        producs[1] = new Iphone("Iphone 15 Pro Max","Aluminium");
        producs[2] = new TcLcd(35000,"Samsung",55);
        producs[3] = new Comics(4000,4/6/1986,"George Lucas","StarWars: El Imperio Contraataca",
                "Lucas Films","Mundo StarWars");
        producs[4] = new Iphone("Iphone 12","Negro Metalico");
        producs[5] = new TcLcd(20000,"Sonic",32);

        for(Producto pr: producs){
            System.out.println();
        }

    }
}
