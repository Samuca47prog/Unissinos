public class Universidade {
    private String nome;
    private int numeroDeAlunos;

    // Construtores
    public Universidade(String nome, int numeroDeAlunos){
        this.nome = nome;
        this.numeroDeAlunos = numeroDeAlunos;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumeroDeAlunos(int numeroDeAlunos){
        this.numeroDeAlunos = numeroDeAlunos;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public int getNumeroDeAlunos(){
        return numeroDeAlunos;
    }

    // Outros métodos
    public void imprimeInformacoes(){
        System.out.println("Universidade " + nome + " possui " + numeroDeAlunos + " alunos");
    }
}
