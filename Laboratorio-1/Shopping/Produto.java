public class Produto {
    // Atributos
    private String nome;
    private Double preco;
    private Data dataValidade;

    // Construtores
    public Produto(String nome, Double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    public Data getDataValidade(){
        return dataValidade;
    }

    // Outros métodos
    public String toString(){
        return  "Produto " + nome + " \n" + 
                "Custa " + preco + " \n" + 
                "Data de validade: " + dataValidade.toString();
    }

    // HÁ PROBLEMAS AQUI
    public boolean estaVencido(Data dataReferencia){
        
        if(dataValidade.comparaData(dataReferencia) == -1){
            return true;
        }
        else {
            return false;
        }

    }
}
