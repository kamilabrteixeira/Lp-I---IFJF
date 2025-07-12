package SistemaIptu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoteTest {

    @Test
    void deveAceitarAreaTerrenoValida() {
        Lote lote = new Lote();
        lote.setAreaTerreno(0.01f);
        assertEquals(0.01f, lote.getAreaTerreno());
    }

    @Test
    void deveLancarErroSeAreaTerrenoInvalida() {
        try {
            Lote lote = new Lote();
            lote.setAreaTerreno(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Área inválida", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorCorretoDoLote() {
        Lote lote = new Lote();
        lote.setAreaTerreno(10);
        assertEquals(300, lote.getValorImovel());
    }
}
