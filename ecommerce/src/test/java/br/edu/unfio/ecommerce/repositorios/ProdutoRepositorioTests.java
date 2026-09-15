package br.edu.unfio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unfio.ecommerce.entidades.Categoria;
import br.edu.unfio.ecommerce.entidades.Produto;

@SpringBootTest 
public class ProdutoRepositorioTests {
    @Autowired 
    private ProdutoRepositorio produtoRepositorio;


     @Test 
    public void deveBuscarUmProdutoPorId (){
        Produto produto = produtoRepositorio.findById(2).orElseThrow();
        assertNotNull(produto);
        assertEquals("Notebook Lenovo", produto.getNome());

}
}
