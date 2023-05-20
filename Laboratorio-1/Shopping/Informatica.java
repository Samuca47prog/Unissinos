public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);

        this.seguroEletronicos = seguroEletronicos;
    }

    // Setters
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    // Getters
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    // Outros métodos
    public String toString(){
        return  super.toString() + 
                "Seguros eletrônicos: " + seguroEletronicos + " \n";
    }
}
