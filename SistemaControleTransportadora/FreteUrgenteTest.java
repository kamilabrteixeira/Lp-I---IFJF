package SistemaControleTransportadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FreteUrgenteTest {

    @Test
    public void testCalcularValorFreteUrgente() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(3);
        cliente.setNome("Carlos Lima");

        FreteUrgente frete = new FreteUrgente();
        frete.setIdFrete(303);
        frete.setPrecoBase(200f);
        frete.setAdicionalEntrega(40f);
        frete.setTotalItens(3);
        frete.setCliente(cliente);

        assertEquals(270f, frete.calcularFrete());
        assertEquals(200f, frete.getPrecoBase());
        assertEquals(40f, frete.getAdicionalEntrega());
        assertEquals(3, frete.getTotalItens());
        assertEquals(303, frete.getIdFrete());
        assertEquals(cliente, frete.getCliente());
    }
}
