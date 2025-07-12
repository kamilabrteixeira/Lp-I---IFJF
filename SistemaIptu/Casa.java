package SistemaIptu;

public class Casa extends Imovel {
    private float areaTerreno;
    private float areaConstruida;

    public Casa() {
        this.areaTerreno = 0;
        this.areaConstruida = 0;
    }

    public float getAreaTerreno() {
        return this.areaTerreno;
    }

    public void setAreaTerreno(float areaTerreno) {
        if (areaTerreno <= 0) {
            throw new IllegalArgumentException("Área do terreno inválida");
        }
        this.areaTerreno = areaTerreno;
    }

    public float getAreaConstruida() {
        return this.areaConstruida;
    }

    public void setAreaConstruida(float areaConstruida) {
        if (areaConstruida <= 0) {
            throw new IllegalArgumentException("Área construída inválida");
        }
        this.areaConstruida = areaConstruida;
    }

    public float getValorImovel() {
        return (this.areaTerreno * 30) + (this.areaConstruida * 50);
    }
}

