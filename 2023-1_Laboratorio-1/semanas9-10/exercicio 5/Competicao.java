public class Competicao {
    private String nome;
    private Data data;

    // Construtores
    public Competicao(String nome, Data data){
        this.nome = nome;
        this.data = data;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setData(Data data){
        this.data = data;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public Data getData(){
        return data;
    }

    // Outros métodos
    public void imprimeInfo(){
        System.out.println(
            "Competição: " + nome + "\n" +
            "Data: " + data.toString() + "\n"
        );
    }
}
