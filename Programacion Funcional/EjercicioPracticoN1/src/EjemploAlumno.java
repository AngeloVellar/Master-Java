import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploAlumno {

    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("2124","juannnnnnnnnnn","Velar",100,22,1,"POO"));
        alumnos.add(new Alumno("4435","gonzalo","Gimenez",67,18,2,"Microservicios"));
        alumnos.add(new Alumno("3443","Julian","Rodriguez",65,42,4,"Elementos de Investigacion Operativa"));
        alumnos.add(new Alumno("4524","Lucas","Samenof",100,27,1,"Contabilidad basica"));
        alumnos.add(new Alumno("2143","Nicoooooooooooooo","Ukzak",88,32,1,"Programación Funcional"));

        alumnos.forEach(System.out::println);
        System.out.println("------------NOMBRES FILTRADOS -------------");
        List<Alumno> nombreFilt = alumnos.stream()
                .filter(f -> f.getNombre().toUpperCase().startsWith("L") || f.getNombre().toUpperCase().startsWith("G"))
                .collect(Collectors.toList());
        System.out.println("Nombres filtrados: " + nombreFilt);

        System.out.println("---------IMPRIMIR EL NÚMEROS DE ALUMNOS-----------");

        System.out.println("El número de alumnos total es de : " + alumnos.size());

        System.out.println("---------IMPRIMIR EL ALUMNO MENOR DE EDAD-----------");

        Optional<Alumno> numeroMenor = alumnos.stream()
                .min(Comparator.comparing(Alumno::getEdad));
        System.out.println("El alumno menor de edad es: " + numeroMenor);
        System.out.println("---------IMPRIMIR EL ALUMNO MAYOR DE EDAD-----------");

        Optional<Alumno> numeroMayor = alumnos.stream()
                .max(Comparator.comparing(Alumno::getEdad));
        System.out.println("El alumno menor de edad es: " + numeroMayor);

        System.out.println("---------ENCONTRAR EL PRIMER ALUMNO-----------");

       Alumno primerAlumno = alumnos.getFirst();
        System.out.println(primerAlumno);

        System.out.println("--------");
//        alumnos.stream()
//                .filter()

//
        System.out.println("----------------- Fitrar curso por letra-----------------");
        alumnos.stream().filter(cur -> cur.getCurso().startsWith("P")).forEach(System.out::println);
/*                 Método o forma explicita, larga de programación funcional(No tan recomendada)
        List<Alumno> cursosLetra = alumnos.stream()
                 .filter(cur -> cur.getCurso().startsWith("P"))
                 .toList();
        System.out.println("Alumnos que su curso termina con la letra (P): " + cursosLetra);
*/
        System.out.println("-------------Nombres que superen el largo de 10 caracteres-----------------");
        alumnos.stream().filter(fil -> fil.getNombre().length() > 10).forEach(System.out::println);

//        List<Alumno> tamanioMayor = alumnos.stream()
//                .filter(fil -> fil.getNombre() > String(("10")))
//                .toList();
//        System.out.println("Nombres de alumnos con mas de 10 caracteres: " + tamanioMayor);
    }
}


