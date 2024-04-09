package ejemplo.Lambdas;

public class UsaCalculadoraServicio {
    public static void main(String[] args){
        CalculadoraServicio cs = (int a, int b) -> {return a + b;};
        int resultado = cs.operacion(2, 3);
        System.out.println(resultado);

        CalculadoraServicio cs2 = (int a, int b) -> a - b ;
        int resultado2 = cs2.operacion(4,3);
        System.out.println(resultado2);
    }
}
