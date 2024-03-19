public class Programador extends Pessoa{
    private String linguagem;

    public Programador(String nome, int idade, String linguagem){
        super(nome, idade);

        this.linguagem = "Python";
    }

    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }

    public String getLinguagem(){
        return linguagem;
    }

    public void imprimeDados(){
        System.out.println("Programador " + super.getNome() + "(" + super.getIdade() + ") usa " + linguagem);
    }
}
