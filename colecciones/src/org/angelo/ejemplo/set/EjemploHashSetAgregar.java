package org.angelo.ejemplo.set;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar  {
    public static void main(String[] args) {

        // El HANSHSET NO es ordenado y NO admite elementos duplicados
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

//        Collections.sort(hs);
        hs.add("tres");
        boolean b = hs.add("tres");
        System.out.println("Permite elementos diplicados? = " + b);
        System.out.println(hs);
    }
}
