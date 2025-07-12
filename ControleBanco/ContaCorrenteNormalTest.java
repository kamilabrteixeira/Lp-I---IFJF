package ControleBanco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteNormalTest {

    @Test
    void deveRetornarSaldoDisponivelIgualAoSaldo() {
        ContaCorrenteNormal contaNormal = new ContaCorrenteNormal();
        contaNormal.setSaldo(500f);
        assertEquals(500f, contaNormal.calcularSaldoDisponivel());
    }

    @Test
    void deveAceitarSaldoZero() {
        ContaCorrenteNormal contaNormal = new ContaCorrenteNormal();
        contaNormal.setSaldo(0f);
        assertEquals(0f, contaNormal.calcularSaldoDisponivel());
    }

    @Test
    void deveLancarExcecaoParaSaldoNegativo() {
        ContaCorrenteNormal contaNormal = new ContaCorrenteNormal();
        try {
            contaNormal.setSaldo(-10f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo invalido", e.getMessage());
        }
    }
}
