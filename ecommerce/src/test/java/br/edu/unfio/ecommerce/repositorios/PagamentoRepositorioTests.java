package br.edu.unfio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest 
public class PagamentoRepositorioTests {
    @Autowired 

    private PagamentoRepositorio pagamentoRepositorio;

    @Test 
    public void deveBuscarUmPagamentoPorId (){
        var pagamento = pagamentoRepositorio.findById(1).orElseThrow();
        assertNotNull(pagamento);
        assertEquals("ativo", pagamento.getStatus());
    }

    
}
