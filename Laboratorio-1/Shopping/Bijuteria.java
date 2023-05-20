public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);

        this.metaVendas = metaVendas;
    }

    // Setters
    public void setMetaVenda(double metaVendas){
        this.metaVendas = metaVendas;
    }

    // Getters
    public double getMetaVenda(){
        return metaVendas;
    }

    // Outros métodos
    public String toString(){
        return  super.toString() + 
                "Meta de vendas: " + metaVendas + " \n";
    }
}
