import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisciplinaTest {

    @Test
    void deveRetornarNomeDisciplina() {
        Disciplina d = new Disciplina("Linguagem de Programação I");
        assertEquals("Linguagem de Programação I", d.getNome());
    }
}