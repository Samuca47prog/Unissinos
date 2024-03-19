public class GrauA extends Grau{
    private double notaTrabalho;
    private double notaProva;

    // Contrutores
    public GrauA(){
        super();
        this.notaProva = 0;
        this.notaTrabalho = 0;
    }

    public GrauA(String dataInicio, String dataFim, double notaProva, double notaTrabalho){
        super(dataInicio, dataFim);
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
    }

    // Setters
    public void setNotaTrabalho(double notaTrabalho){
        this.notaTrabalho = notaTrabalho;
    }

    public void setNotaProva(double notaProva){
        this.notaProva = notaProva;
    }

    // Getters
    public double getNotaTrabalho(){
        return notaTrabalho;
    }

    public double getNotaProva(){
        return notaProva;
    }

    // Outros métodos
    public String toString(){
        return  super.toString() + "\n" +
                "--> Grau A" + "\n" +
                "Nota do Trabalho: " + notaTrabalho + "\n" +
                "Nota do Prova: " + notaProva;
    }

    public double calculaNotaFinalGrau(){
        return (notaTrabalho * 0.3) + (notaProva * 0.7);
    }
}
