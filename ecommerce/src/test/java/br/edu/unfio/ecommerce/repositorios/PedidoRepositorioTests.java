package br.edu.unfio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unfio.ecommerce.entidades.Pedido;
import br.edu.unfio.ecommerce.entidades.Produto;

@SpringBootTest 
public class PedidoRepositorioTests {

    @Autowired
    private  PedidoRepositorio pedidoRepositorio;

    @Test 
    public void deveBuscarUmPedidoPorId (){
        Pedido pedido = pedidoRepositorio.findById(2).orElseThrow();
        assertNotNull(pedido);
        assertEquals("Pago", pedido.getStatus());

}

}
