package SistemaIptu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {

    @Test
    void deveAceitarIdValido() {
        Contribuinte c = new Contribuinte();
        c.setId(1);
        assertEquals(1, c.getId());
    }

    @Test
    void deveLancarErroSeIdInvalido() {
        Contribuinte c = new Contribuinte();
        assertThrows(IllegalArgumentException.class, () -> c.setId(0));
    }

    @Test
    void deveAceitarNomeValido() {
        Contribuinte c = new Contribuinte();
        c.setNomeCompleto("Kamila");
        assertEquals("Kamila", c.getNomeCompleto());
    }

    @Test
    void deveLancarErroSeNomeVazio() {
        Contribuinte c = new Contribuinte();
        assertThrows(IllegalArgumentException.class, () -> c.setNomeCompleto(" "));
    }

    @Test
    void deveAdicionarImovelEContarCorretamente() {
        Contribuinte c = new Contribuinte();
        c.adicionarImovel(new Casa());
        assertEquals(1, c.quantidadeDeImoveis());
    }

    @Test
    void deveRetornarTipoDoImovelAdicionado() {
        Contribuinte c = new Contribuinte();
        c.adicionarImovel(new Lote());
        assertEquals("Lote", c.tiposDeImoveis().get(0));
    }
}
