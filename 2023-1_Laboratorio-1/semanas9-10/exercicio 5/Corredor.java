public class Corredor extends Atleta{
    private double peso;
    private Competicao competicao;

    // Contrutores
    public Corredor(String nome, int idade, double peso, Competicao competicao){
        super(nome, idade);

        this.peso = peso;
        this.competicao = competicao;
    }

    // Setters
    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setCompeticao(Competicao competicao){
        this.competicao = competicao;
    }

    // Getters
    public double getPeso(){
        return peso;
    }

    public Competicao getCompeticao(){
        return competicao;
    }

    // Outros métodos
    public void imprimeCompeticao(){
        System.out.println(
            "Competição: " + competicao.getNome() + "\n" +
            "Data: " + competicao.getData().toString() + "\n"
        );
    }

    public void imprimeInfo(){
        System.out.println(
            "--- Corredor ---"
       );
        super.imprimeInfo();
        System.out.println(
            "Peso: " + peso
        );
        imprimeCompeticao();
    }
}
