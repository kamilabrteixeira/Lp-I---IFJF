package SistemaIptu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasaTest {

    @Test
    void devePermitirAreaTerrenoPositiva() {
        Casa casa = new Casa();
        casa.setAreaTerreno(0.01f);
        assertEquals(0.01f, casa.getAreaTerreno());
    }

    @Test
    void deveRecusarAreaTerrenoInvalida() {
        try {
            Casa casa = new Casa();
            casa.setAreaTerreno(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Área do terreno inválida", e.getMessage());
        }
    }

    @Test
    void devePermitirAreaConstruidaPositiva() {
        Casa casa = new Casa();
        casa.setAreaConstruida(0.01f);
        assertEquals(0.01f, casa.getAreaConstruida());
    }

    @Test
    void deveRecusarAreaConstruidaInvalida() {
        try {
            Casa casa = new Casa();
            casa.setAreaConstruida(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Área construída inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarValorTotalImovel() {
        Casa casa = new Casa();
        casa.setAreaTerreno(10);
        casa.setAreaConstruida(2);
        assertEquals(400, casa.getValorImovel());
    }
}
