public class Antigo extends Livro {
    private int numeroDeEdicao;

    // Construtores
    public Antigo(String titulo, String autor, double preco, int ano, int numeroDeEdicao){
        super(titulo, autor, preco, ano);

        this.numeroDeEdicao = numeroDeEdicao;
    }

    // Setters
    public void setNumeroDeEdicao(int numeroDeEdicao){
        this.numeroDeEdicao = numeroDeEdicao;
    }

    // getters
    public int getNumeroDeEdicao(){
        return numeroDeEdicao;
    }

    // Outros métodos
    public String toString(){
        return super.toString() + ", edição de número " + numeroDeEdicao;
    }
}
