package base;

import negocio.Banco;
import negocio.Cliente;

public class Principal {
    public static void main(String[] args){

        Banco bancolombia = new Banco("Calle 51", "Medellin", "Antioquia", "051051",
                "Bancolombia", "100000001", "604 1231231");
        System.out.println(bancolombia);

        Cliente c1 = new Cliente(10001, "Sebastian", "1020334334", "300 7659772",
                "01/03/1997", "Calle 13", "Bello", "Antioquia", "051052");
        Cliente c2 = new Cliente(10002, "Pedro", "142312345", "312 1231233",
                "04/04/1989", "Calle 98", "Bogotá", "Cundinamarca", "051023");
        Cliente c3 = new Cliente(10003, "Mariana", "234523455", "300 7121241",
                "12/12/2001", "Calle 27", "Popayán", "Cauca", "051043");

        bancolombia.agregarCliente(c1);
        bancolombia.agregarCliente(c2);
        bancolombia.agregarCliente(c3);

        bancolombia.buscarClientePorRFC("123123123");
        bancolombia.buscarClientePorRFC("1020334334");

        bancolombia.consultaCliente(10004);
        bancolombia.consultaCliente(10002);

        bancolombia.eliminarCliente(10004);
        bancolombia.eliminarCliente(10002);

        bancolombia.listarClientes();

        System.out.println("lista de clientes " + bancolombia.obtenerClientes());



    }
}
