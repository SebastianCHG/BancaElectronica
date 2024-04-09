package ejemplo.Lambdas;

@FunctionalInterface
public interface CalculadoraServicio {
    //public abstract  void operacion();
    //int operacion(int a, int b);
    int operacion(int ... a);

}
