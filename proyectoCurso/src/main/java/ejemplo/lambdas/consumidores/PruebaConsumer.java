package ejemplo.lambdas.consumidores;

import java.util.function.Consumer;

public class PruebaConsumer {
    public static void main(String[] args){

        Consumer<String> consumidor = cadena -> System.out.println("Consumi " + cadena);
        consumidor.accept("Chocolate");


    }
}
