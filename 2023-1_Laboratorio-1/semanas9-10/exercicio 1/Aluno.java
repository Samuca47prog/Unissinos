public class Aluno{
	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public String toString(){
		return "Aluno: " + nome + " (" + idade + " anos)";
	}
}
