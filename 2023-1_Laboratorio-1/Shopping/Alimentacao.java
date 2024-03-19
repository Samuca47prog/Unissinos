public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int capacidadeEstoque){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);

        this.dataAlvara = dataAlvara;
    }

    // Setters
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    // Getters
    public Data getDataAlvara(){
        return dataAlvara;
    }

    // Outros métodos
    public String toString(){
        return  super.toString() + 
                "Data alvara: " + dataAlvara + " \n";
    }
}
