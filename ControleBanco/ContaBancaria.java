package ControleBanco;

public abstract class ContaBancaria {
    private Cliente cliente;
    private int numeroConta;
    private float saldo;

    public ContaBancaria() {
        this.numeroConta = 0;
        this.saldo = 0;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta <= 0) {
            throw new IllegalArgumentException("Conta invalida");
        }
        this.numeroConta = numeroConta;
    }

    public float obterSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo invalido");
        }
        this.saldo = saldo;
    }

    public abstract float calcularSaldoDisponivel();
}
