public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);

        this.taxaComercializacao = taxaComercializacao;
    }

    // Setters
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }

    // Getters
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }

    // Outros métodos
    public String toString(){
        return  super.toString() + 
                "Taxa de comercialização: " + taxaComercializacao + " \n";
    }
}
