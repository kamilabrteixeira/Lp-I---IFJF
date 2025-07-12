package SistemaManutencao;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveAceitarCodigoValido() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(10);
        assertEquals(10, cliente.getCodigo());
    }

    @Test
    void deveLancarExcecaoParaCodigoInvalido() {
        Cliente cliente = new Cliente();
        Exception e = assertThrows(IllegalArgumentException.class, () -> cliente.setCodigo(0));
        assertEquals("Codigo invalido", e.getMessage());
    }

    @Test
    void deveAceitarNomeValido() {
        Cliente cliente = new Cliente();
        cliente.setNome("Kamila");
        assertEquals("Kamila", cliente.getNome());
    }

    @Test
    void deveLancarExcecaoParaNomeVazio() {
        Cliente cliente = new Cliente();
        Exception e = assertThrows(IllegalArgumentException.class, () -> cliente.setNome("   "));
        assertEquals("Nome vazio", e.getMessage());
    }

    @Test
    void deveCadastrarUmaManutencao() {
        Cliente cliente = new Cliente();
        ManutencaoCPU m = new ManutencaoCPU();
        cliente.alocarManutencao(m);
        assertEquals(1, cliente.numeroManutencoes());
    }

    @Test
    void naoDeveDuplicarManutencao() {
        Cliente cliente = new Cliente();
        ManutencaoCPU m = new ManutencaoCPU();
        cliente.alocarManutencao(m);
        cliente.alocarManutencao(m);
        assertEquals(1, cliente.numeroManutencoes());
    }

    @Test
    void deveRemoverManutencao() {
        Cliente cliente = new Cliente();
        ManutencaoCPU m = new ManutencaoCPU();
        cliente.alocarManutencao(m);
        cliente.removerManutencao(m);
        assertEquals(0, cliente.numeroManutencoes());
    }

    @Test
    void deveListarTiposDeManutencao() {
        Cliente cliente = new Cliente();
        cliente.alocarManutencao(new ManutencaoCPU());
        cliente.alocarManutencao(new ManutencaoMonitor());
        cliente.alocarManutencao(new ManutencaoImpressora());

        ArrayList<String> esperado = new ArrayList<>();
        esperado.add("Manutenção de CPU");
        esperado.add("Manutençãoo de Monitor");
        esperado.add("Manutençãoo de Impressora");

        assertEquals(esperado, cliente.listaManutencaoCliente());
    }

    @Test
    void deveListarValoresDasManutencoes() {
        Cliente cliente = new Cliente();

        ManutencaoCPU cpu = new ManutencaoCPU();
        cpu.setCustoPecas(100f);

        ManutencaoMonitor monitor = new ManutencaoMonitor();
        monitor.setHorasTrabalho(2);

        ManutencaoImpressora impressora = new ManutencaoImpressora();
        impressora.setQtdFolhasTestadas(20);

        cliente.alocarManutencao(cpu);
        cliente.alocarManutencao(monitor);
        cliente.alocarManutencao(impressora);

        ArrayList<Float> esperado = new ArrayList<>();
        esperado.add(100f);
        esperado.add(100f);
        esperado.add(40f);

        assertEquals(esperado, cliente.listaValoresManutencaoCliente());
    }
}
