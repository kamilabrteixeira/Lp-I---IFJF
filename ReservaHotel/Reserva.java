package ReservaHotel;

public abstract class Reserva {
    private Hospede hospede;
    private int diasHospedagem;

    public Hospede getHospede() {
        return this.hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public int getDiasHospedagem() {
        return this.diasHospedagem;
    }

    public void setDiasHospedagem(int diasHospedagem) {
        if (diasHospedagem <= 0) {
            throw new IllegalArgumentException("Dias invalidos");
        }
        this.diasHospedagem = diasHospedagem;
    }

    public abstract float calcularValorReserva();
}
