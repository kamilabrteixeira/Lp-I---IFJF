package SistemaControleTransportadora;

public class FreteEspecial extends Frete {
    private float valorTaxa;

    public FreteEspecial() {
        super();
        this.valorTaxa = 0f;
    }

    public float getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(float valorTaxa) {
        if (valorTaxa < 0) {
            throw new IllegalArgumentException("Taxa de entrega inválida");
        }
        this.valorTaxa = valorTaxa;
    }

    @Override
    public float calcularFrete() {
        return getPrecoBase() + valorTaxa;
    }
}
