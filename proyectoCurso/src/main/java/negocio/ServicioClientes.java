package negocio;

import java.util.ArrayList;

public interface ServicioClientes {

    boolean agregarCliente(Cliente cliente);
    boolean eliminarCliente(int numero);

    Cliente consultaCliente(int numero);

    ArrayList<Cliente> obtenerClientes();

    Cliente buscarClientePorRFC(String rfc);

    void listarClientes();
}
