package SistemaIptu;

public abstract class Imovel {
    private Contribuinte dono;

    public Imovel() {
        this.dono = getDono();
    }

    public Contribuinte getDono() {
        return this.dono;
    }

    public void setDono(Contribuinte dono) {
        this.dono = dono;
    }

    public abstract float getValorImovel();
}
