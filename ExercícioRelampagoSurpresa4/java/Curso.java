import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void removerTurma(Turma turma) {
        turmas.remove(turma);
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }
}