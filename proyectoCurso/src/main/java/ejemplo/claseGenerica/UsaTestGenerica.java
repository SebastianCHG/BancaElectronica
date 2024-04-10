package ejemplo.claseGenerica;

import ejemplo.pilares.Persona;
import negocio.Cuenta;
import negocio.CuentaDeAhorro;

public class UsaTestGenerica {
    public static void main(String[] args){
        Test<String> cadenasTest = new Test<>("Hola mundo");
        System.out.println(cadenasTest);
        //cadenasTest.setDato(10);
        //cadenasTest.setDato(new Persona("Sebastian", "Calle 13", 13));
        cadenasTest.setDato("Algo");
        System.out.println(cadenasTest);


        Test<Integer> b = new Test<>(100);
        System.out.println(b);
        //b.setDato(90.000);
        b.setDato(90);


        Prueba<CuentaDeAhorro> prueba = new Prueba<>(new CuentaDeAhorro(1001, 2000.0, 0.01));
        System.out.println(prueba.getNumero());
    }


}
