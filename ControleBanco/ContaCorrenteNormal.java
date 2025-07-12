package ControleBanco;

public class ContaCorrenteNormal extends ContaBancaria {

    public ContaCorrenteNormal() {
        super();
    }

    public float calcularSaldoDisponivel() {
        return this.obterSaldo();
    }
}
