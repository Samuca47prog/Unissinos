public class Programador extends Pessoa{
    private String linguagemProgramacao;
    
    public Programador(String nome, int idade, String linguagemProgramacao){
        super(nome, idade);
        this.linguagemProgramacao = linguagemProgramacao;
    }
    
    public void setLinguagemProgramacao(String linguagemProgramacao){
        this.linguagemProgramacao = linguagemProgramacao;
    }
    
    public String getLinguagemProgramacao(){
        return linguagemProgramacao;
    }
    
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Linguagem de programação: "+linguagemProgramacao);
    }
}