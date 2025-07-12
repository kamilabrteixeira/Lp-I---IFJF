package ReservaHotel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservaSingleTest {

    @Test
    void deveCalcularValorCorretamente() {
        ReservaSingle reserva = new ReservaSingle();
        reserva.definirDiasHospedagem(3);
        assertEquals(150, reserva.calcularValorReserva());
    }

    @Test
    void deveAceitarHospedeEQuantidadeDiasValidos() {
        ReservaSingle reserva = new ReservaSingle();
        Hospede hospede = new Hospede();
        hospede.setNomeCompleto("Ana Clara");
        hospede.setIdentificador(1);

        reserva.definirHospede(hospede);
        reserva.definirDiasHospedagem(2);

        assertEquals(hospede, reserva.obterHospede());
        assertEquals(2, reserva.obterDiasHospedagem());
    }

    @Test
    void deveLancarExcecaoParaDiasInvalidos() {
        ReservaSingle reserva = new ReservaSingle();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            reserva.definirDiasHospedagem(0);
        });

        assertEquals("Dias invalidos", exception.getMessage());
    }
}
