package SistemaIptu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartamentoTest {

    @Test
    void deveAceitarAreaValida() {
        Apartamento ap = new Apartamento();
        ap.setAreaTotal(0.01f);
        assertEquals(0.01f, ap.getAreaTotal());
    }

    @Test
    void deveLancarErroSeAreaForZeroOuNegativa() {
        try {
            Apartamento ap = new Apartamento();
            ap.setAreaTotal(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Área inválida", e.getMessage());
        }
    }

    @Test
    void deveAceitarNumeroAndarValido() {
        Apartamento ap = new Apartamento();
        ap.setNumeroAndar(1);
        assertEquals(1, ap.getNumeroAndar());
    }

    @Test
    void deveLancarErroSeNumeroAndarForInvalido() {
        try {
            Apartamento ap = new Apartamento();
            ap.setNumeroAndar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Andar inválido", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorParaAndarPrimeiro() {
        Apartamento ap = new Apartamento();
        ap.setNumeroAndar(1);
        ap.setAreaTotal(10);
        assertEquals(400, ap.getValorImovel());
    }

    @Test
    void deveCalcularValorParaAndarIntermediario() {
        Apartamento ap = new Apartamento();
        ap.setNumeroAndar(2);
        ap.setAreaTotal(10);
        assertEquals(360, ap.getValorImovel());
    }

    @Test
    void deveCalcularValorParaAndarElevado() {
        Apartamento ap = new Apartamento();
        ap.setNumeroAndar(11);
        ap.setAreaTotal(10);
        assertEquals(40, ap.getValorImovel());
    }
}
