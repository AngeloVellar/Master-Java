public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero [] mamiferos = new Mamifero[6];
        Mamifero leon = new Leon("Selvatico",3.50f,5.66f,200f,"Panthera leo",
                10.6f,74,40,11.4f);

        Mamifero guepardoAfricano = new Guepardo("Savana Africana",3.20f,4.55f,150f,"Acinonyx jubatus",
                130f,130);
        Mamifero borderCollie = new Perro("Variado",80f,50f,30f,"Canis lupus familiaris","Blanco y negro",
                8f);

        Mamifero tigreBengala = new Tigre("Selva", 3.00f, 3.80f, 200f, "Panthera tigris"
                , 110f, 100);

        Lobo loboPardo = new Lobo("Bosque", 1.2f, 1.8f, 40f,
                "Canis lupus", "Gris", 8.5f);
        Lobo loboGris = new Lobo("Montaña", 1.3f, 2.0f, 45f,
                "Canis lupus", "Marrón", 9.0f);


        mamiferos [0] = leon;
        mamiferos [1] = guepardoAfricano;
        mamiferos [2] = borderCollie;
        mamiferos [3] = tigreBengala;
        mamiferos [4] = loboGris;
        mamiferos [5] = loboPardo;

        for (Mamifero animal: mamiferos){
            if(animal instanceof Leon ){
                System.out.println("---Leon---\n Sus caracteristicas son: " + ((Leon) animal). );
            }
        }


    }
}
