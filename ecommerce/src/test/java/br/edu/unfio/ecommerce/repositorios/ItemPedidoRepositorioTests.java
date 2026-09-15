package br.edu.unfio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unfio.ecommerce.entidades.ItemPedido;

@SpringBootTest
public class ItemPedidoRepositorioTests {

    @Autowired
    private ItemPedidoRepositorio itemPedidorepositorio;

    @Test
    public void deveBuscarUmItemPedidoPorId() {
        ItemPedido itemPedido = itemPedidorepositorio.findById(2).orElseThrow();

        assertNotNull(itemPedido);
        assertEquals(3500, itemPedido.getValorUnitario());
    }
}