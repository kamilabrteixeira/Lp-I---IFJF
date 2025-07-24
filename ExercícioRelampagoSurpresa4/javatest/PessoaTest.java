import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void deveRetornarNomePessoa() {
        Pessoa p = new Pessoa("Kamila");
        assertEquals("Kamila", p.getNome());
    }
}