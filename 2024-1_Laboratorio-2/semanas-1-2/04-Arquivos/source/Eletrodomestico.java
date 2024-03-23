public class Eletrodomestico extends Produto {
    private double AdicionalDeIPI;

    // ----------------------
    // Construtores

    public Eletrodomestico(String nome, String descricao, double preco, double AdicionalDeIPI) {
        super(nome, descricao, preco);
        this.AdicionalDeIPI = AdicionalDeIPI;
    }

    // ----------------------
    // Getters e Setters

    public double getAdicionalDeIPI() {
        return AdicionalDeIPI;
    }

    public void setAdicionalDeIPI(double AdicionalDeIPI) {
        this.AdicionalDeIPI = AdicionalDeIPI;
    }

    @Override
    public double getPreco() {
        return super.getPreco() + getAdicionalDeIPI();
    }

    // ----------------------
    // Outros métodos

    @Override
    public String toString() {
        return super.toString() + " --> Eletrodomestico[adicional de IPI: " + AdicionalDeIPI + "]";
    }
}
