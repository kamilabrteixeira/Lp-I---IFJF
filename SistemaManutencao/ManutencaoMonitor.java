package SistemaManutencao;

public class ManutencaoMonitor extends istemaManutencao.Manutencao {

    public ManutencaoMonitor() {
        super();
    }
    public float calcularValorManutencao() {
        return this.getValorMaoDeObra();
    }

    public void setHorasTrabalho(int i) {
    }
}