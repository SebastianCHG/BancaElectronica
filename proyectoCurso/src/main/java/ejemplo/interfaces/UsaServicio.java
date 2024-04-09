package ejemplo.interfaces;

public class UsaServicio {

    public static void main(String[] args){
        Servicio s= new ServicioImpl();
        s.metodo1();
        s.metodo1(10);
        s.metodo2();
    }
}
