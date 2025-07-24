import java.util.ArrayList;

public class Professor extends Pessoa {
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Professor(String nome) {
        super(nome);
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}
