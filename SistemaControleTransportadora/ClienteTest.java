package SistemaControleTransportadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ClienteTest {

    @Test
    public void testClienteComFretes() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(10);
        cliente.setNome("Lucas Andrade");

        FreteNormal freteNormal = new FreteNormal();
        freteNormal.setIdFrete(1);
        freteNormal.setPrecoBase(100);
        freteNormal.setCliente(cliente);

        FreteEspecial freteEspecial = new FreteEspecial();
        freteEspecial.setIdFrete(2);
        freteEspecial.setPrecoBase(150);
        freteEspecial.setValorTaxa(30);
        freteEspecial.setCliente(cliente);

        FreteUrgente freteUrgente = new FreteUrgente();
        freteUrgente.setIdFrete(3);
        freteUrgente.setPrecoBase(200);
        freteUrgente.setAdicionalEntrega(50);
        freteUrgente.setTotalItens(2);
        freteUrgente.setCliente(cliente);

        cliente.adicionarFrete(freteNormal);
        cliente.adicionarFrete(freteEspecial);
        cliente.adicionarFrete(freteUrgente);

        assertEquals(3, cliente.obterTotalFretes());
        assertEquals(Arrays.asList("Frete normal", "Frete especial", "Frete urgente"), cliente.obterTiposFretes());

        float valor1 = freteNormal.calcularFrete();
        float valor2 = freteEspecial.calcularFrete();
        float valor3 = freteUrgente.calcularFrete();

        assertEquals(Arrays.asList(valor1, valor2, valor3), cliente.obterValoresFretes());
    }
}
