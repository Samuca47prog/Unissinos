public class Churro{
    private String sabor;
    private double preco;

    // Construtores
    public Churro(){
        this.sabor = "Doce de leite";
        this.preco = 5.0;
    }

    public Churro(String sabor){
        this.sabor = sabor;
        this.preco = 5.0;
    }

    public Churro(String sabor, double preco){
        this.sabor = sabor;
        this.preco = preco;
    }

    // Setters
    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    // Getters
    public String getSabor(){
        return sabor;
    }

    public double getPreco(){
        return preco;
    }

    // Outros métodos
    public String toString(){
        return "Churros de " + sabor + " custa " + preco;
    }
}
