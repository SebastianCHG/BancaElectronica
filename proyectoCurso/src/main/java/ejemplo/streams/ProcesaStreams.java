package ejemplo.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ProcesaStreams {
    public static void main(String[] args) {
        /*se declara la lista*/
        List<Persona> lista = new ArrayList<>();
        /*se agregan objetos a la lista*/
        lista.add(new Persona("Zaira", 27, "EDOMEX", 'F'));
        lista.add(new Persona("Carolina", 18, "EDOMEX", 'F'));
        lista.add(new Persona("Victor", 30, "CDMX", 'M'));
        lista.add(new Persona("Javier", 32, "CDMX", 'M'));
        lista.add(new Persona("edgar", 28, "NL", 'M'));
        lista.add(new Persona("Daniela", 36, "SON", 'F'));
        lista.add(new Persona("Luz", 25, "PUE", 'F'));
        lista.add(new Persona("Ernesto", 13, "EDOMEX", 'M'));
        lista.add(new Persona("Alicia", 29, "QRO", 'F'));
        lista.add(new Persona("Jorge", 41, "VER", 'M'));

        /*System.out.println("Persona mayores a 30 años: ");
        lista.stream().forEach(persona -> {
                if( persona.getEdad() > 30 ){
                    System.out.println("Mayor que 30: " + persona.getNombre());
                }
            }
        );

        System.out.println("Persona que son menores de 30 años y empezan por E: ");
        lista.stream()  .filter(persona -> persona.getEdad() < 30)
                        .filter(persona -> persona.getNombre().startsWith("E"))
                        .forEach(persona -> System.out.println(persona.getNombre()));

        System.out.println("Persona que son mayores de 30 años y empezan por D: ");
        lista.stream()
                .filter(persona -> persona.getEdad() > 30 && persona.getNombre().startsWith("D"))
                .forEach(System.out::println);

        System.out.println("Persona que contienen E en el nombre: ");
        lista.stream()
                .map(persona -> persona.getNombre())
                .filter(nombre -> nombre.contains("E"))
                .forEach(System.out::println);

        System.out.println("Personas de la lista pero hacer énfasis en los que contiene una E en el nombre: ");
        lista.stream()
                .map(persona -> persona.getNombre())
                .peek(nombre -> System.out.println("Nombre -> " + nombre))
                .filter(nombre -> nombre.toLowerCase().contains("e"))
                .forEach(nombre -> System.out.println("Tiene E en el nombre: " + nombre));*/


        //Creo lista de persona que hacen parte de EDOMEX
        /*System.out.println("Creo una lista con las personas de EDOMEX ");
        List<Persona> personaEDOMEX = lista.stream().filter(persona -> persona.getCiudadOrigen().equals("EDOMEX")).peek(persona -> System.out.println(persona)).toList();
        System.out.println("Ordeno la lista: ");
        personaEDOMEX.stream().sorted().forEach(System.out::println);
        System.out.println("De la lista de personas de EDOMEX, filtro e imprimo las mujeres: ");
        personaEDOMEX.stream().filter(persona -> persona.getSexo()=='F').sorted().forEach(persona -> System.out.println(persona));

        System.out.println("Lista ordenada por nombre dentro del objeto de persona: ");
        lista.stream().sorted().forEach(System.out::println);

        System.out.println("Ordenada por un comparator personalizado, por ciudad: ");
        lista.stream().sorted((persona1, persona2) -> persona1.getCiudadOrigen().compareTo(persona2.getCiudadOrigen())).forEach(System.out::println);*/

        /*System.out.println("Ordenada por un comparator personalizado, por sexo: ");
        lista.stream().sorted((persona1, persona2) -> {
            if (persona1.getSexo() < persona2.getSexo()) {
                return -1;
            } else if (persona1.getSexo() > persona2.getSexo()) {
                return 1;
            } else return 0;
        }).forEach(System.out::println);*/

        //Usado clases Wrapper int -> Integer, double -> Double, char -> Character
        /*lista.stream().sorted(((p1,p2) -> ((Character)p1.getSexo()).compareTo((Character) p2.getSexo()))).forEach(System.out::println);
        lista.stream().sorted(((p1,p2) -> Character.compare(p1.getSexo(), p2.getSexo()))).forEach(System.out::println);
        lista.stream().sorted((Comparator.comparingInt(Persona::getSexo))).forEach(System.out::println);

        lista.stream().sorted((p1, p2) -> ((Integer)p1.getEdad()).compareTo(p2.getEdad())).forEach(System.out::println);*/

        System.out.println("Conteo de personas: " + lista.stream().count());
        System.out.println("Conteo de personas mayores de 18 años: " + lista.stream().filter(persona -> persona.getEdad() > 18).count());

        OptionalDouble resultado = lista.stream().mapToInt(persona -> persona.getEdad()).average();
        if(resultado.isPresent()){
            System.out.println("Promedio de edad de personas: " + resultado.getAsDouble());
        }

        Map<String, List<Persona>> mapa = lista.stream().collect(Collectors.groupingBy(persona -> persona.getCiudadOrigen()));

        System.out.println("Mapa de persona agrupadas por ciudad de origen: ");
        System.out.println(mapa);

        /*for(String estado : mapa.keySet()){
            System.out.println(estado);
        }*/

        Map<Boolean, List<Persona>> mapa2 = lista.stream().collect(Collectors.partitioningBy(persona -> persona.getEdad() > 18));
        System.out.println("Mapa de persona particionadas por las mayores de 18(True) y menores de 18(False): ");
        System.out.println(mapa2);


        System.out.println("Perosna que tenga más de 27, que sea hombre y que sea de CDMX: ");
        Optional<Persona> optPersona = lista.stream().filter(persona -> persona.getEdad() > 27)
                .filter(persona -> persona.getSexo() == 'M')
                .filter(persona -> persona.getCiudadOrigen().equalsIgnoreCase("CDMX"))
                .findFirst();
        System.out.println((optPersona.isPresent())?optPersona:"No hay personas con estas características");
    }
}