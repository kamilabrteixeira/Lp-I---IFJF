package SistemaIptu;

public class Apartamento extends Imovel {
    private float areaTotal;
    private int numeroAndar;

    public Apartamento() {
        super();
        this.areaTotal = 0;
        this.numeroAndar = 0;
    }

    public float getAreaTotal() {
        return this.areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        if (areaTotal <= 0) {
            throw new IllegalArgumentException("Área inválida");
        }
        this.areaTotal = areaTotal;
    }

    public int getNumeroAndar() {
        return this.numeroAndar;
    }

    public void setNumeroAndar(int numeroAndar) {
        if (numeroAndar <= 0) {
            throw new IllegalArgumentException("Andar inválido");
        }
        this.numeroAndar = numeroAndar;
    }

    public float getValorImovel() {
        float precoBase = this.areaTotal * 40;
        if (this.numeroAndar > 1 && this.numeroAndar <= 10) {
            precoBase -= precoBase * (this.numeroAndar - 1) * 0.1f;
        } else if (this.numeroAndar > 10) {
            precoBase -= precoBase * 0.9f;
        }
        return precoBase;
    }
}
