package ejemplo.pilares;

public class Robot implements Comunicarse{
    String marca;
    int automonia;

    @Override
    public void hablar() {
        System.out.println("Qué deseas?");
    }
}
