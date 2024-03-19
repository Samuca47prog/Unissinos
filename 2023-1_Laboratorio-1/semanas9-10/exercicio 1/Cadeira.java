public class Cadeira{
	private Cor cor;
	private Aluno aluno;
	
	public Cadeira(Cor cor){
		this.cor = cor;
	}
	
	public void setAluno(Aluno aluno){
		this.aluno = aluno;
	}
	
	public Aluno getAluno(){
		return this.aluno;
	}
	
	public Cor getCor(){
		return this.cor;
	}
	
	public String toString(){
		if(this.aluno != null){
			return "Cadeira " + this.cor.toString() + " - " + this.aluno.toString();
		} 
		else{
			return "Cadeira (" + this.getClass().getName() + ") " + this.cor.toString() + " - vazia";
		} 
	}
}
