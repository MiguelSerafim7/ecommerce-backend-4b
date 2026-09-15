package br.edu.unfio.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unfio.ecommerce.entidades.Pedido;

public interface PedidoRepositorio extends JpaRepository <Pedido, Integer>{

}
