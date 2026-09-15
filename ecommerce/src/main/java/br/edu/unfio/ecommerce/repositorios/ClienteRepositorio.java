package br.edu.unfio.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unfio.ecommerce.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository <Cliente, Integer>{

}
