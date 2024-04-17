package ejemplo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ManejoStreams {
    public static void main(String[] args){
        String[] nombres = {"Angel", "Jose","Maria" , "Angie"};

        // CÓDIGO ITERATIVO, PROCESA CADA UNO DE LOS ELEMENTOS
        /*for(String nombre : nombres){
            if(nombre.toLowerCase().contains("a")){
                System.out.println(nombre);
            }
        }*/

        // 1. GENERAR UN STREAM
        // 2. APLICAR CERO, UNA, DOS O MUCHAS OPERACIONES
        // 3. TERMINAR EL STREAM


        //System.out.println(Arrays.stream(nombres).getClass().getName());
        Stream<String> nombresStream = Arrays.stream(nombres);
        //nombresStream.filter(nombre -> nombre.contains("M")).forEach(nombre -> System.out.println(nombre));
        //nombresStream.filter(nombre -> nombre.toLowerCase().contains("g")).forEach(nombre -> System.out.println(nombre));

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(7);
        numeros.add(19);

        numeros.stream().forEach(n -> System.out.println(n));
    }

}
