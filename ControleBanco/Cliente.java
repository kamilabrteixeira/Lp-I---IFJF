package ControleBanco;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<ContaBancaria> contas;

    public Cliente() {
        this.codigo = 0;
        this.nome = "";
        this.contas = new ArrayList<ContaBancaria>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Codigo invalido");
        } else {
            this.codigo = codigo;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio");
        } else {
            this.nome = nome;
        }
    }

    public ArrayList<ContaBancaria> getContas() {
        return this.contas;
    }

    public void setContas(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }

    public void alocarConta(ContaBancaria conta) {
        this.contas.add(conta);
    }

    public int numeroDeContas() {
        return this.contas.size();
    }

    public String contasPorCliente() {
        int normal = 0, especial = 0, poupanca = 0;

        for (ContaBancaria conta : this.contas) {
            if (conta.getClass().equals(ContaCorrenteNormal.class)) {
                normal++;
            } else if (conta.getClass().equals(ContaCorrenteEspecial.class)) {
                especial++;
            } else if (conta.getClass().equals(ContaPoupanca.class)) {
                poupanca++;
            }
        }

        String texto1 = "Contas Corrente Normal: " + normal;
        String texto2 = ", Contas Corrente Especial: " + especial;
        String texto3 = ", Contas Poupança: " + poupanca;

        return texto1 + texto2 + texto3;
    }

    public ArrayList<Float> listaSaldos() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (ContaBancaria conta : contas) {
            resultado.add(conta.calcularSaldoDisponivel());
        }
        return resultado;
    }
}
