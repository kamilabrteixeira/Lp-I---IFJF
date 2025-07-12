package ControleBanco;

public class ContaCorrenteEspecial extends ContaBancaria {
    private float valorLimiteCredito;

    public ContaCorrenteEspecial() {
        super();
        this.valorLimiteCredito = 0f;
    }

    public float obterValorLimiteCredito() {
        return this.valorLimiteCredito;
    }

    public void definirValorLimiteCredito(float valorLimiteCredito) {
        if (valorLimiteCredito < 0) {
            throw new IllegalArgumentException("Limite inválido");
        }
        this.valorLimiteCredito = valorLimiteCredito;
    }

    public float calcularSaldoDisponivel() {
        return this.obterSaldo() + this.valorLimiteCredito;
    }
}
