package SistemaControleTransportadora;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Frete> listaFretes;

    public Cliente() {
        this.codigo = 0;
        this.nome = "";
        this.listaFretes = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        this.nome = nome;
    }

    public ArrayList<Frete> getListaFretes() {
        return listaFretes;
    }

    public void setListaFretes(ArrayList<Frete> listaFretes) {
        this.listaFretes = listaFretes;
    }

    public void adicionarFrete(Frete frete) {
        if (!listaFretes.contains(frete)) {
            listaFretes.add(frete);
        }
    }

    public void excluirFrete(Frete frete) {
        listaFretes.remove(frete);
    }

    public int obterTotalFretes() {
        return listaFretes.size();
    }

    public ArrayList<String> obterTiposFretes() {
        ArrayList<String> tipos = new ArrayList<>();
        for (Frete f : listaFretes) {
            if (f instanceof FreteNormal) {
                tipos.add("Frete normal");
            } else if (f instanceof FreteEspecial) {
                tipos.add("Frete especial");
            } else if (f instanceof FreteUrgente) {
                tipos.add("Frete urgente");
            }
        }
        return tipos;
    }

    public ArrayList<Float> obterValoresFretes() {
        ArrayList<Float> valores = new ArrayList<>();
        for (Frete f : listaFretes) {
            valores.add(f.calcularFrete());
        }
        return valores;
    }
}
