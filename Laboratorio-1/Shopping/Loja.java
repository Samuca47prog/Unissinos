public class Loja{
    // Atributos
    private String nome;
    private int quantidadeFuncionarios;
    private Double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    // Construtores
    public Loja(String nome, int quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(Double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public Double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public Data getDataFundacao(){
        return dataFundacao;
    }

    // Outros métodos
    public String toString(){
        return "Loja " + nome + " contém " + quantidadeFuncionarios + " funcionários com base salarial de " + salarioBaseFuncionario;
    }

    public Double gastosComSalario(){

        if(salarioBaseFuncionario == -1){
            return -1.0;
        }

        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja(){
        if(quantidadeFuncionarios < 10){
            return 'P';
        }
        else if(quantidadeFuncionarios <= 30){
            return 'M';
        }
        else {
            return 'G';
        }
    }
}