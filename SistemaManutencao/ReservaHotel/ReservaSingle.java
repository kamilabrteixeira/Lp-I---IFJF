package ReservaHotel;

public class ReservaSingle extends Reserva {

    @Override
    public float calcularValorReserva() {
        return this.getDiasHospedagem() * 50;
    }
}
