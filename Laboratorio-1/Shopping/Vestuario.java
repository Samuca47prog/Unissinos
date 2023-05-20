public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int capacidadeEstoque){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);

        this.produtosImportados = produtosImportados;
    }

    // Setters
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    // Getters
    public boolean getProdutosImportados(){
        return produtosImportados;
    }

    // Outros métodos
    public String toString(){
        return  super.toString() + 
                "Possui produtos importados? " + produtosImportados + " \n";
    }
}
