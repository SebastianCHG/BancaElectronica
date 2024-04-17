package ejemplo.lambdas.predicados;

import java.util.function.Predicate;

public class PruebaPredicado {
    public static void main(String[] args){

        Predicate <String> comparar = s1 -> s1.length() > 5;
        System.out.println(comparar.test("Hola"));
        System.out.println(comparar.test("Hola Mundo"));

    }
}
