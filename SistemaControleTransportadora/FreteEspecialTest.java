package SistemaControleTransportadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FreteEspecialTest {

    @Test
    public void testCalcularValorFreteEspecial() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(2);
        cliente.setNome("Bruna Costa");

        FreteEspecial frete = new FreteEspecial();
        frete.setIdFrete(202);
        frete.setPrecoBase(150f);
        frete.setValorTaxa(25f);
        frete.setCliente(cliente);

        assertEquals(175f, frete.calcularFrete());
        assertEquals(150f, frete.getPrecoBase());
        assertEquals(25f, frete.getValorTaxa());
        assertEquals(202, frete.getIdFrete());
        assertEquals(cliente, frete.getCliente());
    }
}
