package org.angelo.ejemplo.set;

import org.angelo.ejemplo.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploArrayList {
    public static void main(String[] args) {
                     //ArrayList
//        List<Alumno> al = new ArrayList<>();
//        System.out.println(al + ", size = " + al.size());
//        System.out.println("está vacia = " + al.isEmpty());
//        al.add(new Alumno("Pato", 5));
//        al.add(new Alumno("Cata",6));
//        al.add(new Alumno("Luci",4));
//        al.add(new Alumno("Jano",7));
//        al.add(new Alumno("Andres",3));
//
//        System.out.println(al + ", size = " + al.size());
//
//        al.remove(new Alumno("Jano", 7 )); //Metodo remove para remover objetos de la lista
//        System.out.println(al + ", size = " + al.size());

            //--------------LinkedList-------------------//

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("está vacia = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata",6));
        enlazada.add(new Alumno("Luci",4));
        enlazada.add(new Alumno("Jano",7));
        enlazada.add(new Alumno("Andres",3));


        System.out.println(enlazada + ", size = " + enlazada.size());
        enlazada.addFirst(new Alumno("Zeus",6)); //Nos permite agregar elementos en la primera posición
        enlazada.addLast(new Alumno("Atenea",5)); //Nos permite agregar elementos en la ultima posición
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero = " + enlazada.getFirst());
        System.out.println("Último = " + enlazada.getLast());
        System.out.println("Indice 2 = " + enlazada.get(2)); //Con get y el número del indice nos muestra el objeto que tiene

        enlazada.removeFirst(); //Para eliminar el primer elemento
        enlazada.removeLast(); //Para eliminar el ultimo elemento
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(new Alumno("Jano",7));//Para remover un objeto en especifico de la list
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas",8);
        enlazada.addLast(a); //Agrega un elemento al final de la lista
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));
      //972.971.4535
        enlazada.remove(2);
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));


        enlazada.set(3, new Alumno("Lalo",7)); //O}Para cambiarlo
        System.out.println(enlazada + ", size = " + enlazada.size());

        ListIterator<Alumno> li = enlazada.listIterator();

        while(li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("================== Previous");
        while(li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }

    }


}
