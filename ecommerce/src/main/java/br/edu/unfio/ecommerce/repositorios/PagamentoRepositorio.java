package br.edu.unfio.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unfio.ecommerce.entidades.Pagamento;

public interface PagamentoRepositorio extends JpaRepository <Pagamento, Integer>{

}
