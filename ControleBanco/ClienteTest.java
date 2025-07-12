package ControleBanco;

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
    void deveLancarExcecaoSeCodigoInvalido() {
        Cliente cliente = new Cliente();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cliente.setCodigo(0);
        });
        assertEquals("Codigo invalido", exception.getMessage());
    }

    @Test
    void deveAceitarNomeValido() {
        Cliente cliente = new Cliente();
        cliente.setNome("João Silva");
        assertEquals("João Silva", cliente.getNome());
    }

    @Test
    void deveLancarExcecaoSeNomeVazio() {
        Cliente cliente = new Cliente();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cliente.setNome("   ");
        });
        assertEquals("Nome vazio", exception.getMessage());
    }

    @Test
    void deveRetornarZeroContasInicialmente() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.numeroDeContas());
    }

    @Test
    void deveAdicionarUmaConta() {
        Cliente cliente = new Cliente();
        ContaCorrenteNormal conta = new ContaCorrenteNormal();
        cliente.alocarConta(conta);
        assertEquals(1, cliente.numeroDeContas());
    }

    @Test
    void deveAdicionarVariasContas() {
        Cliente cliente = new Cliente();
        cliente.alocarConta(new ContaCorrenteNormal());
        cliente.alocarConta(new ContaCorrenteEspecial());
        cliente.alocarConta(new ContaPoupanca());
        assertEquals(3, cliente.numeroDeContas());
    }

    @Test
    void deveRetornarResumoComQuantidadeDeContasPorTipo() {
        Cliente cliente = new Cliente();
        cliente.alocarConta(new ContaCorrenteNormal());
        cliente.alocarConta(new ContaCorrenteNormal());
        cliente.alocarConta(new ContaCorrenteEspecial());
        cliente.alocarConta(new ContaPoupanca());
        cliente.alocarConta(new ContaPoupanca());

        String esperado = "Contas Corrente Normal: 2, Contas Corrente Especial: 1, Contas Poupança: 2";
        assertEquals(esperado, cliente.contasPorCliente());
    }

    @Test
    void deveRetornarListaDeSaldosDasContas() {
        Cliente cliente = new Cliente();

        ContaCorrenteNormal contaNormal = new ContaCorrenteNormal();
        contaNormal.setSaldo(150f);

        ContaCorrenteEspecial contaEspecial = new ContaCorrenteEspecial();
        contaEspecial.setSaldo(70f);
        contaEspecial.definirValorLimiteCredito(30f);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(200f);

        cliente.alocarConta(contaNormal);
        cliente.alocarConta(contaEspecial);
        cliente.alocarConta(contaPoupanca);

        ArrayList<Float> esperado = new ArrayList<>();
        esperado.add(150f);
        esperado.add(100f);
        esperado.add(200f);

        assertEquals(esperado, cliente.listaSaldos());
    }
}
