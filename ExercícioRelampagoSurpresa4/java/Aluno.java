import java.util.ArrayList;

public class Aluno extends Pessoa {
    private Curso curso;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Aluno(String nome) {
        super(nome);
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
        curso.adicionarAluno(this);
    }

    public Curso getCurso() {
        return curso;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
        turma.adicionarAluno(this);
    }

    public void removerTurma(Turma turma) {
        turmas.remove(turma);
        turma.removerAluno(this);
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}
