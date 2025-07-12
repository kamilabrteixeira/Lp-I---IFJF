package ReservaHotel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservaTriploTest {

    @Test
    void deveAceitarTaxaServicoMaiorOuIgualZero() {
        ReservaTriplo reserva = new ReservaTriplo();
        reserva.setTaxaServico(75f);
        assertEquals(75f, reserva.getTaxaServico());
    }

    @Test
    void deveLancarExcecaoParaTaxaServicoNegativa() {
        ReservaTriplo reserva = new ReservaTriplo();
        Exception excecao = assertThrows(IllegalArgumentException.class, () -> {
            reserva.setTaxaServico(-5f);
        });
        assertEquals("Taxa de serviço inválida", excecao.getMessage());
    }

    @Test
    void deveCalcularValorTotalComTaxa() {
        ReservaTriplo reserva = new ReservaTriplo();
        reserva.setQuantidadeDias(3);
        reserva.setTaxaServico(40f);
        assertEquals(400f, reserva.calcularValorReserva());
    }

    @Test
    void deveCalcularValorSemTaxa() {
        ReservaTriplo reserva = new ReservaTriplo();
        reserva.setQuantidadeDias(2);
        reserva.setTaxaServico(0f);
        assertEquals(240f, reserva.calcularValorReserva());
    }
}
