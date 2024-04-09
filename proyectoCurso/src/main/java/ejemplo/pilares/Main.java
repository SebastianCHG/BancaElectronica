package ejemplo.pilares;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Empleado("Sebastian", "Calle 58", 27, 1001, null, 3000);
        System.out.println(p1);

        Empleado e1 = new Empleado("Sebastian", "Calle 1", 20, 1213, "Ing de Sofware", 3000);
        System.out.println(e1);

        //Polimorfismo:
        Persona p2 = new Empleado("Juan", "Bello", 30, 1001, "PO", 2000);
        System.out.println(p2);



    }
}