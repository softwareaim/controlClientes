package test;

import datos.ClienteDaoJDBC;
import dominio.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        
    
    List<Cliente> clientes = new ArrayList<>();
    ClienteDaoJDBC clienteDao = new ClienteDaoJDBC();
    
    clientes.add((Cliente) clienteDao.listar());
    
    clientes.forEach(cliente -> {
        cliente.toString();
        });
    
       
}
}
