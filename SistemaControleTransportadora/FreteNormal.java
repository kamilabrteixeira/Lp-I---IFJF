package SistemaControleTransportadora;

public class FreteNormal extends Frete {

    public FreteNormal() {
        super();
    }

    public float calcularFrete() {
        return getPrecoBase();
    }
}
