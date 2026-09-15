package br.edu.unfio.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unfio.ecommerce.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository <Produto, Integer> {

}
