public class AlunoEnsinoSuperior extends Aluno {

    public AlunoEnsinoSuperior(String nome, double nota) {
        super(nome, nota);
    }

    @Override
    public double getNotaCorte() {
        return 6.0;
    }
}
