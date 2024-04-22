package negocio;

import java.util.ArrayList;
import java.util.Optional;

public class Banco implements ServicioClientes {

    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String calle, String ciudad, String departamento, String codigoPostal, String nombre, String rfc, String telefono) {
        this.setNombre(nombre);
        this.setDomicilio(new Domicilio(calle, ciudad, departamento, codigoPostal));
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.setClientes(new ArrayList<Cliente>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + getNombre() + '\'' +
                ", domicilio=" + getDomicilio() +
                ", rfc='" + getRfc() + '\'' +
                ", telefono='" + getTelefono() + '\''+
                '}';
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        System.out.println("Cliente " + cliente.getNombre() + " agregado.");
        clientes.add(cliente);
        return true;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        /*Cliente c = consultaCliente(numero);
        if(c != null) {
            System.out.println("Cliente eliminado.");
            clientes.remove(c);
            return true;
        }
        System.out.println("No se encontró cliente a elinmar.");
        return false;*/
        int tam = clientes.size();
        setClientes((ArrayList<Cliente>) clientes.stream().filter(cliente -> cliente.getNumero() != numero).toList());
        return (tam != clientes.size())? true : false;
    }

    @Override
    public Cliente consultaCliente(int numero) {
        /*for(Cliente c : clientes){
            if(c.getNumero() == numero){
                System.out.println("Se encontró el cliente por el número "+ numero + " de nombre " + c.getNombre());
                return c;
            }else{

            }
        }
        //Pendiente manejo de excepciones
        System.out.println("No se encontró ningún cliente por el numero " + numero);
        return null;*/
        Optional <Cliente> optCliente =  clientes.stream().filter(cliente -> cliente.getNumero() == numero).findFirst();
        System.out.println((optCliente.isPresent())?"Se encontró cliente con numero " + numero :"No se encontró cliente.");
        return (optCliente.isPresent())? optCliente.get():null;

    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }

    @Override
    public Cliente buscarClientePorRFC(String rfc) {
        /*for(Cliente c : clientes){
            if(rfc.equalsIgnoreCase(c.getRfc())){
                System.out.println("Se encontró el cliente por rfc " + rfc + " de nombre " + c.getNombre());
                return c;
            }else{

            }
        }*/
        //Pendiente manejo de excepciones


        Optional <Cliente> optCliente =  clientes.stream().filter(cliente -> cliente.getRfc().equals(rfc)).findFirst();
        System.out.println((optCliente.isPresent())?"Se encontró cliente con rnf " + rfc:"No se encontró cliente.");
        return (optCliente.isPresent())? optCliente.get():null;
    }

    @Override
    public void listarClientes() {
        /*System.out.println("=".repeat(250));
        for(Cliente c : clientes){
            System.out.println(c);
        }
        System.out.println("=".repeat(250));*/

        clientes.stream().forEach(cliente -> System.out.println(cliente));
    }
}
