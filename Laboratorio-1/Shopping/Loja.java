import java.util.Arrays;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;  

public class Loja{
    // Atributos
    private String nome;
    private int quantidadeFuncionarios;
    private Double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    // Construtores
    public Loja(String nome, int quantidadeFuncionarios, Double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int capacidadeEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoque];
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

    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
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

    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    // Outros métodos
    public String toString(){
        return  "Loja " + nome + " \n" +
                "contém " + quantidadeFuncionarios + " \n" + 
                "funcionários com base salarial de " + salarioBaseFuncionario + ". \n" +
                "Sediada no Endereço " + endereco.toString() + ". \n" +
                "Fundada em " + dataFundacao.toString() + " \n" + 
                "Estoque de produtos: " + Arrays.toString(estoqueProdutos);
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

    // Métodos relacionados a arrays
    public void imprimeProdutos(){
        System.out.println(Arrays.toString(estoqueProdutos));
    }

    public boolean insereProduto(Produto produto){

        for(int i=0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto){
        
        for(int i=0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null){
                if(estoqueProdutos[i].getNome() == nomeProduto){
                    estoqueProdutos[i] = null;
                    return true;
                }
            }

        }
        return false;
    }
}