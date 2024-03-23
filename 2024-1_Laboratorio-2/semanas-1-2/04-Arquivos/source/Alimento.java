public class Alimento extends Produto {
    private String validade;

    // ----------------------
    // Construtores

    public Alimento(String nome, String descricao, double preco, String validade){
        super(nome, descricao, preco);
        this.validade = validade;
    }

    // ----------------------
    // Getters e Setters

    public String getValidade() {
        return validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }

    // ----------------------
    // Outros métodos

    @Override
    public String toString() {
        return super.toString() + " --> Alimento[validade: " + validade + "]";
    }
}
