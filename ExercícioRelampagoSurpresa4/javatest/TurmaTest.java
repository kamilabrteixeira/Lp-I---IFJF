import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class TurmaTest {

    @Test
    public void testCriarTurma() {
        Professor professor = new Professor("Marco Antonio");
        Disciplina disciplina = new Disciplina("LP I");
        Turma turma = new Turma(disciplina, professor);

        assertEquals(professor, turma.getProfessor());
        assertEquals(disciplina, turma.getDisciplina());
    }

    @Test
    public void testSetCurso() {
        Professor professor = new Professor("Sandro");
        Disciplina disciplina = new Disciplina("Modelagem de Sistemas");
        Turma turma = new Turma(disciplina, professor);
        Curso curso = new Curso("Sistemas de Informação");

        turma.setCurso(curso);

        assertEquals(curso, turma.getCurso());
    }

    @Test
    public void testAdicionarERemoverAluno() {
        Professor professor = new Professor("Átila");
        Disciplina disciplina = new Disciplina("Matemática Financeira");
        Turma turma = new Turma(disciplina, professor);
        Aluno aluno = new Aluno("Kamila");

        turma.adicionarAluno(aluno);
        assertTrue(turma.getAlunos().contains(aluno));

        turma.removerAluno(aluno);
        assertFalse(turma.getAlunos().contains(aluno));
    }
}
