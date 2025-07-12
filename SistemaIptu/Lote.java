package SistemaIptu;

public class Lote extends Imovel {
    private float areaTerreno;

    public Lote() {
        this.areaTerreno = 0;
    }

    public float getAreaTerreno() {
        return this.areaTerreno;
    }

    public void setAreaTerreno(float areaTerreno) {
        if (areaTerreno <= 0) {
            throw new IllegalArgumentException("Área inválida");
        }
        this.areaTerreno = areaTerreno;
    }

    public float getValorImovel() {
        return this.areaTerreno * 30;
    }
}
