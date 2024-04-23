package ejemplo.fechas;

import java.time.*;
import java.util.Date;
import java.util.Locale;

public class FechasYTiempo {
    public static void main(String[] args){
        /*Date fecha = new Date();
        System.out.println(fecha);
        fecha.setDate(31);
        System.out.println(fecha);*/

        // Todo el API de fechas y Tiempo son INMUTABLES
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);
        LocalDate fechaNueva = fecha.plusDays(10);
        System.out.println(fechaNueva);
        LocalTime tiempo = LocalTime.now();
        System.out.println(tiempo);
        LocalDateTime tiempoFecha = LocalDateTime.now();
        System.out.println(tiempoFecha);
        LocalDate finAnio = LocalDate.of(2024,12,31);
        System.out.println(finAnio);
        System.out.println(finAnio.getDayOfWeek());
        System.out.println(finAnio.isLeapYear());
        LocalDate hoy = LocalDate.now();
        LocalDate antigua = LocalDate.parse("2023-03-02");
        Period periodo = Period.between(hoy, antigua);
        System.out.println(periodo);
    }

}
