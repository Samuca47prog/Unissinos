public class Aluno {
    private String nome;
    private GrauA ga;
    private GrauB gb;

    // Construtores
    public Aluno(String nome, GrauA ga, GrauB gb){
        this.nome = nome;
        this.ga = ga;
        this.gb = gb;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setGa(GrauA ga){
        this.ga = ga;
    }

    public void setGb(GrauB gb){
        this.gb = gb;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public GrauA getGa(){
        return ga;
    }

    public GrauB getGb(){
        return gb;
    }

    // Outros métodos
    public String toString(){
        return  ga.toString() + "\n" + 
                gb.toString();
    }

    public double calculaNotaFinal(){
        double notaPonderadaGa = ga.calculaNotaFinalGrau() * 0.33;
        double notaPonderadaGb = gb.calculaNotaFinalGrau() * 0.67;

        return notaPonderadaGa + notaPonderadaGb;
    }
}
