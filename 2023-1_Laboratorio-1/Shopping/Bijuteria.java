public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int capacidadeEstoque){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);

        this.metaVendas = metaVendas;
    }

    // Setters
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    // Getters
    public double getMetaVendas(){
        return metaVendas;
    }

    // Outros métodos
    public String toString(){
        return  super.toString() + 
                "Meta de vendas: " + metaVendas + " \n";
    }
}
