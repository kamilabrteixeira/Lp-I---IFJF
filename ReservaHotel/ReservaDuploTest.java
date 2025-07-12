package ReservaHotel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservaDuploTest {

    @Test
    void deveAceitarQuantidadeDeRefeicoesMaiorOuIgualZero() {
        ReservaDuplo reserva = new ReservaDuplo();
        reserva.setNumeroRefeicoes(3);
        assertEquals(3, reserva.getQuantidadeRefeicoes());
    }

    @Test
    void deveLancarExcecaoParaQuantidadeDeRefeicoesNegativa() {
        ReservaDuplo reserva = new ReservaDuplo();
        Exception excecao = assertThrows(IllegalArgumentException.class, () -> {
            reserva.setQuantidadeRefeicoes(-1);
        });
        assertEquals("Quantidade de refeições inválida", excecao.getMessage());
    }

    @Test
    void deveCalcularValorTotalDaReservaComRefeicoes() {
        ReservaDuplo reserva = new ReservaDuplo();
        reserva.setQuantidadeDias(4);
        reserva.setQuantidadeRefeicoes(5);
        assertEquals(370f, reserva.calcularValorReserva());
    }

    @Test
    void deveCalcularValorTotalDaReservaSemRefeicoes() {
        ReservaDuplo reserva = new ReservaDuplo();
        reserva.setQuantidadeDias(2);
        reserva.setQuantidadeRefeicoes(0);
        assertEquals(160f, reserva.calcularValorReserva());
    }
}
