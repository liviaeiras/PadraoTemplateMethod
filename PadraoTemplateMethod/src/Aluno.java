/**
 * Classe abstrata que define o MÉTODO TEMPLATE verificarAprovacao().
 * O algoritmo é fixo aqui; as subclasses só informam a nota de corte.
 */
public abstract class Aluno {

    protected String nome;
    protected double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Método template: final para que as subclasses não alterem o algoritmo
    public final boolean verificarAprovacao() {
        double notaCorte = getNotaCorte();          // passo variável (gancho)
        boolean aprovado = nota >= notaCorte;       // passo fixo
        System.out.printf("%s (%s) - nota %.1f | corte %.1f -> %s%n",
                nome, getClass().getSimpleName(), nota, notaCorte,
                aprovado ? "APROVADO" : "REPROVADO");
        return aprovado;
    }

    // Passo que cada subclasse implementa
    public abstract double getNotaCorte();

    public String getNome() { return nome; }
    public double getNota() { return nota; }
}
