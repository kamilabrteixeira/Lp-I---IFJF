package SistemaManutencao;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<istemaManutencao.Manutencao> manutencoes;

    public Cliente() {
        this.codigo = 0;
        this.nome = "";
        this.manutencoes = new ArrayList<istemaManutencao.Manutencao>();
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

    public ArrayList<istemaManutencao.Manutencao> getManutencoes() {
        return this.manutencoes;
    }

    public void setManutencoes(ArrayList<istemaManutencao.Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }

    public void alocarManutencao(istemaManutencao.Manutencao manutencao) {
        if (!this.manutencoes.contains(manutencao)) {
            this.manutencoes.add((manutencao));
        }
    }

    public void removerManutencao(istemaManutencao.Manutencao manutencao) {
        this.manutencoes.remove(manutencao);
    }

    public int numeroManutencoes() {
        return (this.manutencoes.size());
    }

    public ArrayList<String> listaManutencaoCliente() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (istemaManutencao.Manutencao manutencao : manutencoes) {
            if (manutencao.getClass().equals(ManutencaoCPU.class)) {
                resultado.add("Manutenção de CPU");
            } else if (manutencao.getClass().equals(ManutencaoMonitor.class)) {
                resultado.add("Manutençãoo de Monitor");
            } else if (manutencao.getClass().equals(ManutencaoImpressora.class)) {
                resultado.add("Manutençãoo de Impressora");
            }
        }
        return resultado;
    }

    public ArrayList<Float> listaValoresManutencaoCliente() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (istemaManutencao.Manutencao manutencao : manutencoes) {
            resultado.add(manutencao.calcularValorManutencao());
        }
        return resultado;
    }
}