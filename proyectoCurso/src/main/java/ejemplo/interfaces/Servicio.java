package ejemplo.interfaces;

public interface Servicio {
    int dato = 100;
    void metodo1();
    double metodo1(int a);

    private void secreto(){
        System.out.println("Este es el código secreto");
    }

    default void metodo2(){
        secreto();
        System.out.println("Este método lleva código");
        secreto();
        utileria();
        Servicio.utileria();
    }

    static void utileria(){
        System.out.println("Este es el metodo utilitario estático");
    }

}
