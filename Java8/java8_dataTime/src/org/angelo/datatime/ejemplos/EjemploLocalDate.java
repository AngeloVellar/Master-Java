package org.angelo.datatime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        //Fecha del dia actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        System.out.println("Día = " + fechaActual.getDayOfMonth());
        Month mes = fechaActual.getMonth();
        System.out.println("Mes = " + mes);
        System.out.println("Numero del mes:" + mes.getValue());
        //Mes en Español
        System.out.println("Mes en español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es","ES")));

        //Dia semana en español
        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Número del dia: " + diaSemana.getValue());
        System.out.println("Nombre del dia: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es","ES")));


        System.out.println("Año = " + fechaActual.getYear());
        System.out.println("Día del año = " + fechaActual.getDayOfYear());
        System.out.println("Era = " + fechaActual.getEra());

        fechaActual = LocalDate.of(2020, 6,18);
        System.out.println(fechaActual);

        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManiana = " + diaDeManiana);

        LocalDate mesAnterioMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnterioMismoDia = " + mesAnterioMismoDia);

        //Obtener el dia de la semana
        DayOfWeek martes = LocalDate.parse("2024-06-18").getDayOfWeek();
        System.out.println("Martes = " + martes);

        int once = LocalDate.of(2024,06,18).getDayOfMonth();
        System.out.println("once = " + once);

        //Saber si es Bisiesto
        boolean esBisiesto  = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);


    }
}
