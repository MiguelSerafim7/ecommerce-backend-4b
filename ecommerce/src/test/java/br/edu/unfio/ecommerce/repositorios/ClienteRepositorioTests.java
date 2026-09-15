package br.edu.unfio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unfio.ecommerce.entidades.Cliente;
import br.edu.unfio.ecommerce.entidades.Produto;

@SpringBootTest 
public class ClienteRepositorioTests {
    @Autowired 
    private ClienteRepositorio clienteRepositorio;

        @Test 
       public void deveBuscarUmClientePorId (){
        Cliente cliente = clienteRepositorio.findById(2).orElseThrow();
        assertNotNull(cliente);
        assertEquals("Joao", cliente.getNome());

}
}


