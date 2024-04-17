package ejemplo.lambdas.funciones;

import negocio.Banco;
import negocio.Cliente;

import java.util.function.Function;

public class PruebaFunction {
    public static void main (String[] args){

        Function<Banco, Cliente> buscarCliente = banco -> banco.consultaCliente(10003);
        Banco bancolombia = new Banco("Calle 51", "Medellin", "Antioquia", "051051", "Bancolombia", "100000001", "604 1231231");

        Cliente c1 = new Cliente(10001, "Sebastian", "1020334334", "300 7659772", "01/03/1997", "Calle 13", "Bello", "Antioquia", "051052");
        Cliente c2 = new Cliente(10002, "Pedro", "142312345", "312 1231233", "04/04/1989", "Calle 98", "Bogotá", "Cundinamarca", "051023");
        Cliente c3 = new Cliente(10003, "Mariana", "234523455", "300 7121241", "12/12/2001", "Calle 27", "Popayán", "Cauca", "051043");

        bancolombia.agregarCliente(c1);
        bancolombia.agregarCliente(c2);
        bancolombia.agregarCliente(c3);

        System.out.println(buscarCliente.apply(bancolombia));

        Function<String, Double> convertir = s -> Double.parseDouble(s);
        System.out.println(convertir.apply("2.0"));



    }
}
