public class Novo extends Livro{
    private double desconto;

    // Construtores
    public Novo(String titulo, String autor, double preco, int ano, double desconto){
        super(titulo, autor, preco, ano);

        this.desconto = desconto;
    }

    // Setters
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    // getters
    public double getDesconto(){
        return desconto;
    }

    // Outros métodos
    public String toString(){
        return super.toString() + ", desconto de " + desconto;
    }
}
