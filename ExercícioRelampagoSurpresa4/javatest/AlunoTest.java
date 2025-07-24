import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    void deveAdicionarAlunoNaTurma() {
        Aluno a = new Aluno("Kamila");
        Professor p = new Professor("Marco Antonio");
        Disciplina d = new Disciplina("LP I");
        Turma t = new Turma(d, p);

        a.adicionarTurma(t);

        assertTrue(t.getAlunos().contains(a));
        assertTrue(a.getTurmas().contains(t));
    }

    @Test
    void deveRemoverAlunoDaTurma() {
        Aluno a = new Aluno("Kamila");
        Professor p = new Professor("Marco Antonio");
        Disciplina d = new Disciplina("LP I");
        Turma t = new Turma(d, p);

        a.adicionarTurma(t);
        a.removerTurma(t);

        assertFalse(t.getAlunos().contains(a));
        assertFalse(a.getTurmas().contains(t));
    }

    @Test
    void verificaSeAlunoEstaEmTurma() {
        Aluno a = new Aluno("Kamila");
        Professor p = new Professor("Marco Antonio");
        Disciplina d = new Disciplina("LP I");
        Turma t = new Turma(d, p);

        assertFalse(a.getTurmas().contains(t));
        a.adicionarTurma(t);
        assertTrue(a.getTurmas().contains(t));
    }

    @Test
    void verificaSeAlunoEstaEmCurso() {
        Aluno a = new Aluno("Kamila");
        Curso c = new Curso("Sistemas de Informação");
        assertNull(a.getCurso());

        a.setCurso(c);
        assertEquals(c, a.getCurso());
    }
}