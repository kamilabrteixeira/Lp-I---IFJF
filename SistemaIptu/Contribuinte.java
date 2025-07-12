package SistemaIptu;

import java.util.ArrayList;

public class Contribuinte {
    private int id;
    private String nomeCompleto;
    private ArrayList<Imovel> listaImoveis;

    public Contribuinte() {
        this.id = 0;
        this.nomeCompleto = "";
        this.listaImoveis = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        this.id = id;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        if (nomeCompleto.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nomeCompleto = nomeCompleto;
    }

    public ArrayList<Imovel> getListaImoveis() {
        return this.listaImoveis;
    }

    public void setListaImoveis(ArrayList<Imovel> listaImoveis) {
        this.listaImoveis = listaImoveis;
    }

    public void adicionarImovel(Imovel imovel) {
        this.listaImoveis.add(imovel);
    }

    public int quantidadeDeImoveis() {
        return this.listaImoveis.size();
    }

    public ArrayList<String> tiposDeImoveis() {
        ArrayList<String> tipos = new ArrayList<>();
        for (Imovel imovel : this.listaImoveis) {
            if (imovel instanceof Lote) {
                tipos.add("Lote");
            } else if (imovel instanceof Casa) {
                tipos.add("Casa");
            } else if (imovel instanceof Apartamento) {
                tipos.add("Apartamento");
            }
        }
        return tipos;
    }

    public ArrayList<Float> valoresDosImoveis() {
        ArrayList<Float> valores = new ArrayList<>();
        for (Imovel imovel : this.listaImoveis) {
            valores.add(imovel.getValorImovel());
        }
        return valores;
    }
}

