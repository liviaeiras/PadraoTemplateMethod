public class AlunoEnsinoMedio extends Aluno {

    public AlunoEnsinoMedio(String nome, double nota) {
        super(nome, nota);
    }

    @Override
    public double getNotaCorte() {
        return 5.0;
    }
}
