package br.edu.unfio.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unfio.ecommerce.entidades.ItemPedido;

public interface ItemPedidoRepositorio extends JpaRepository <ItemPedido, Integer>{

}
