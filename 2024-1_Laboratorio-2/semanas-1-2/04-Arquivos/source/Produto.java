public abstract class Produto {
    private String nome;
    private String descricao;
    private double preco;

    // ----------------------
    // Construtores

    public Produto(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // ----------------------
    // Getters e Setters

    public String getNome() {
        return nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // ----------------------
    // Outros métodos

    @Override
    public String toString() {
        return "Produto[nome: " + nome + ", descricao: " + descricao + ", preco: " + preco + "] \n";
    }
}
