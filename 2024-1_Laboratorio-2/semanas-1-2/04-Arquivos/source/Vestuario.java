public class Vestuario extends Produto {
    private int QuantidadeEmEstoque;

    // ----------------------
    // Construtores

    public Vestuario(String nome, String descricao, double preco, int QuantidadeEmEstoque) {
        super(nome, descricao, preco);
        this.QuantidadeEmEstoque = QuantidadeEmEstoque;
    }

    // ----------------------
    // Getters e Setters

    public int getQuantidadeEmEstoque() {
        return QuantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int QuantidadeEmEstoque) {
        this.QuantidadeEmEstoque = QuantidadeEmEstoque;
    }

    // ----------------------
    // Outros métodos

    @Override
    public String toString() {
        return super.toString() + " --> Vesturario[quantidade em estoque: " + QuantidadeEmEstoque + "]";
    }
}
