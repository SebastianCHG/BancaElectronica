package ejemplo.lambdas.suppliers;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PruebaSupplier {
        public static void main (String[] args){

            Supplier<StringBuilder> build = () -> new StringBuilder();
            System.out.println(build.get().append("hola").append(" ").append("mundo"));

            UnaryOperator<String> cadena = s -> s.toUpperCase() + " como está";
            System.out.println(cadena.apply("Sebastian"));

        }
}
