import java.util.ArrayList;

public class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Curso curso;

    public Turma(Disciplina disciplina, Professor professor) {
        this.disciplina = disciplina;
        this.professor = professor;
        professor.adicionarTurma(this);
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
        curso.adicionarTurma(this);
    }

    public Curso getCurso() {
        return curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
