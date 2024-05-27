public class Eletrodomestico {
    // Atributos da classe
    private String marca;
    private int voltagem;
    private double preco;

    // Construtor padrão
    public Eletrodomestico() {
    }

    // Construtor com parâmetros
    public Eletrodomestico(String marca, int voltagem, double preco) {
        this.marca = marca;
        this.voltagem = voltagem;
        this.preco = preco;
    }

    // Métodos de acesso (getters e setters)

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir informações do eletrodoméstico
    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "marca='" + marca + '\'' +
                ", voltagem=" + voltagem +
                ", preco=" + preco +
                '}';
    }
}
