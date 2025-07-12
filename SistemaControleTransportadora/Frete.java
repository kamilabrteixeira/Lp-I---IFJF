package SistemaControleTransportadora;

public abstract class Frete {
    private int idFrete;
    private Cliente cliente;
    private float precoBase;

    public Frete() {
        this.idFrete = 0;
        this.precoBase = 0f;
    }

    public int getIdFrete() {
        return idFrete;
    }

    public void setIdFrete(int idFrete) {
        if (idFrete <= 0) {
            throw new IllegalArgumentException("Número do frete inválido");
        }
        this.idFrete = idFrete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        if (precoBase < 0) {
            throw new IllegalArgumentException("Valor do frete inválido");
        }
        this.precoBase = precoBase;
    }

    public abstract float calcularFrete();
}
