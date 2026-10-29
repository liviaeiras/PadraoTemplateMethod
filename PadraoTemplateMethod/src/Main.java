public class Main {
    public static void main(String[] args) {
        System.out.println("=== Padrão Template Method ===");

        Aluno a1 = new AlunoEnsinoMedio("Ana", 5.5);
        Aluno a2 = new AlunoEnsinoSuperior("Bruno", 5.5);
        Aluno a3 = new AlunoEnsinoSuperior("Carla", 8.0);

        a1.verificarAprovacao();
        a2.verificarAprovacao();
        a3.verificarAprovacao();
    }
}
