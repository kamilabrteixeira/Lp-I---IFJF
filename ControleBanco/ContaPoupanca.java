package ControleBanco;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca() {
        super();
    }

    public float calcularSaldoDisponivel() {
        return this.obterSaldo();
    }
}
