public class Aluno extends Pessoa{
    private Double nota;

    public Aluno(String nome, int idade){
        super(nome, idade);

        this.nota = 0.0;
    }

    public void setNota(Double nota){
        this.nota = nota;
    }

    public Double getNota(){
        return nota;
    }

    public void imprimeDados(){
        System.out.println("Aluno " + super.getNome() + "(" + super.getIdade() + ") tirou a nota " + nota);
    }
}
