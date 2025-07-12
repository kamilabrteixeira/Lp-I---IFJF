package ControleBanco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveRetornarSaldoDisponivelIgualAoSaldo() {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(100.0f);
        assertEquals(100.0f, contaPoupanca.calcularSaldoDisponivel());
    }

    @Test
    void deveAceitarSaldoZero() {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(0.0f);
        assertEquals(0.0f, contaPoupanca.calcularSaldoDisponivel());
    }

    @Test
    void deveLancarExcecaoSeSaldoForNegativo() {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            contaPoupanca.setSaldo(100f);
        });
        assertEquals("Saldo inválido", exception.getMessage());
    }
}
