package ejemplo.interfaces;

public class ServicioImpl implements Servicio{


    @Override
    public void metodo1() {
        System.out.println("implementación metodo abstracto 1");
    }

    @Override
    public double metodo1(int a) {
        System.out.println("Implementación del metodo abstracto 1. Valor= " + a);
        return 0;
    }

    @Override
    public void metodo2() {
        Servicio.super.metodo2();
        System.out.println("o mejor sobreescribo el método 2");
    }

    public static void utileria(){
        System.out.println("Metodo uteliria de ServiceImple");
    }

    private void secreto(){
        System.out.println("Método secreto de la implementación");}

    public void copia(){
        System.out.println("método de copia");
    }
}
