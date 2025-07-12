package ControleBanco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteEspecialTest {

    @Test
    void deveAceitarLimiteCreditoZeroOuMaior() {
        ContaCorrenteEspecial conta = new ContaCorrenteEspecial();
        conta.definirValorLimiteCredito(0f);
        assertEquals(0f, conta.obterValorLimiteCredito());

        conta.definirValorLimiteCredito(500f);
        assertEquals(500f, conta.obterValorLimiteCredito());
    }

    @Test
    void deveLancarExcecaoParaLimiteCreditoNegativo() {
        ContaCorrenteEspecial conta = new ContaCorrenteEspecial();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.definirValorLimiteCredito(-0.01f);
        });
        assertEquals("Limite inválido", exception.getMessage());
    }

    @Test
    void deveCalcularSaldoDisponivelCorretamente() {
        ContaCorrenteEspecial conta = new ContaCorrenteEspecial();
        conta.setSaldo(100f);
        conta.definirValorLimiteCredito(50f);
        assertEquals(150f, conta.calcularSaldoDisponivel());
    }
}
