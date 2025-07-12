package SistemaControleTransportadora;

public class FreteUrgente extends Frete {
    private float adicionalEntrega;
    private int totalItens;

    public FreteUrgente() {
        super();
        this.adicionalEntrega = 0f;
        this.totalItens = 0;
    }

    public float getAdicionalEntrega() {
        return adicionalEntrega;
    }

    public void setAdicionalEntrega(float adicionalEntrega) {
        if (adicionalEntrega < 0) {
            throw new IllegalArgumentException("Valor da taxa inválido");
        }
        this.adicionalEntrega = adicionalEntrega;
    }

    public int getTotalItens() {
        return totalItens;
    }

    public void setTotalItens(int totalItens) {
        if (totalItens <= 0) {
            throw new IllegalArgumentException("Quantidade de itens inválida");
        }
        this.totalItens = totalItens;
    }

    @Override
    public float calcularFrete() {
        return getPrecoBase() + adicionalEntrega + (totalItens * 10);
    }
}
