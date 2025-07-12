package SistemaControleTransportadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FreteNormalTest {

    @Test
    public void testCalcularValorFreteNormal() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        cliente.setNome("Ana Paula");

        FreteNormal frete = new FreteNormal();
        frete.setIdFrete(101);
        frete.setPrecoBase(120f);
        frete.setCliente(cliente);

        assertEquals(120f, frete.calcularFrete());
        assertEquals(120f, frete.getPrecoBase());
        assertEquals(101, frete.getIdFrete());
        assertEquals(cliente, frete.getCliente());
    }
}
