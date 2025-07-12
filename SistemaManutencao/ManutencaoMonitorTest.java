package SistemaManutencao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ManutencaoMonitorTest {

    @Test
    void deveRetornarValorDaMaoDeObraComoValorDaManutencao() {
        ManutencaoMonitor monitor = new ManutencaoMonitor();
        monitor.setValorMaoDeObra(150f);
        assertEquals(150f, monitor.calcularValorManutencao());
    }

    @Test
    void deveAceitarValorDeMaoDeObraMaiorOuIgualZero() {
        ManutencaoMonitor monitor = new ManutencaoMonitor();
        monitor.setValorMaoDeObra(0f);
        assertEquals(0f, monitor.getValorMaoDeObra());

        monitor.setValorMaoDeObra(99.9f);
        assertEquals(99.9f, monitor.getValorMaoDeObra());
    }

    @Test
    void deveLancarExcecaoParaValorNegativoDeMaoDeObra() {
        ManutencaoMonitor monitor = new ManutencaoMonitor();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            monitor.setValorMaoDeObra(-10f);
        });
        assertEquals("Valor inválido", exception.getMessage());
    }
}
