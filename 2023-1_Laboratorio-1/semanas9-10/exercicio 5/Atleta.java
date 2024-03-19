public class Atleta {
    private String nome;
    private int idade;

    // Construtores
    public Atleta(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    // Outros Métodos
    public void imprimeInfo(){
        System.out.println(
            "Nome: " + nome + "\n" +
            "Idade: " + idade
        );
    }
}