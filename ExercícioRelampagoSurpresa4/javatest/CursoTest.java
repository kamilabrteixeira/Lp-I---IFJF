import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {

    @Test
    void deveAdicionarAlunoAoCurso() {
        Curso c = new Curso("Sistemas de Informação");
        Aluno a = new Aluno("Kamila");
        c.adicionarAluno(a);

        assertTrue(c.getAlunos().contains(a));
    }

    @Test
    void deveRemoverAlunoDoCurso() {
        Curso c = new Curso("Sistemas de Informação");
        Aluno a = new Aluno("Kamila");
        c.adicionarAluno(a);
        c.removerAluno(a);

        assertFalse(c.getAlunos().contains(a));
    }

    @Test
    void deveAdicionarTurmaAoCurso() {
        Curso c = new Curso("Sistemas de Informação");
        Professor p = new Professor("Marco Antonio");
        Disciplina d = new Disciplina("Linguagem de Programação I");
        Turma t = new Turma(d, p);

        t.setCurso(c);
        assertTrue(c.getTurmas().contains(t));
    }

    @Test
    void deveRemoverTurmaDoCurso() {
        Curso c = new Curso("Sistemas de Informação");
        Professor p = new Professor("Marco Antonio");
        Disciplina d = new Disciplina("Linguagem de Programação I");
        Turma t = new Turma(d, p);

        t.setCurso(c);
        c.removerTurma(t);

        assertFalse(c.getTurmas().contains(t));
    }

    @Test
    void verificaSeTurmaEstaNoCurso() {
        Curso c = new Curso("Sistemas de Informação");
        Professor p = new Professor("Marco Antonio");
        Disciplina d = new Disciplina("Linguagem de Programação I");
        Turma t = new Turma(d, p);

        assertFalse(c.getTurmas().contains(t));
        t.setCurso(c);
        assertTrue(c.getTurmas().contains(t));
    }
}