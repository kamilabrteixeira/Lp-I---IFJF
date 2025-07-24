import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {

    @Test
    void deveAtribuirTurmaAoProfessor() {
        Professor p = new Professor("Sandro");
        Disciplina d = new Disciplina("Modelagem");
        Turma t = new Turma(d, p);

        assertTrue(p.getTurmas().contains(t));
    }

    @Test
    void deveRetornarNomeDoProfessorDaTurma() {
        Professor p = new Professor("Sandro");
        Disciplina d = new Disciplina("Modelagem");
        Turma t = new Turma(d, p);

        assertEquals("Sandro", t.getProfessor().getNome());
    }

    @Test
    void adicionarTurma() {
    }

    @Test
    void getTurmas() {
    }
}