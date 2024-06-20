package org.angelo.datatime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploZonedDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/23 12:45"
                ,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal,newYork);

        System.out.println("Horario de partida en New York = " + zonaNy);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("Horario de llegada en Madrid = " + zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalles del viaje a españa");
        System.out.println("Partida NY: " + f.format(zonaNy));
        System.out.println("Llegada Madrid: " + f.format(zonaMadrid));

    }
}
