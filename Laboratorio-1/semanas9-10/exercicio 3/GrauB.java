public class GrauB extends Grau {
    private double notaAtividades;
    private double notaSeminario;
    private double notaParticipacao;

    // Contrutores
    public GrauB(){
        super();
        this.notaAtividades = 0;
        this.notaSeminario = 0;
        this.notaParticipacao = 0;
    }

    public GrauB(String dataInicio, String dataFim, double notaAtividades, double notaSeminario, double notaParticipacao){
        super(dataInicio, dataFim);
        this.notaAtividades = notaAtividades;
        this.notaSeminario = notaSeminario;
        this.notaParticipacao = notaParticipacao;
    }

    // Setters
    public void setNotaAtividades(double notaAtividades){
        this.notaAtividades = notaAtividades;
    }

    public void setNotaSeminario(double notaSeminario){
        this.notaSeminario = notaSeminario;
    }

    public void setNotaParticipacao(double notaParticipacao){
        this.notaParticipacao = notaParticipacao;
    }

    // Getters
    public double getNotaAtividades(){
        return notaAtividades;
    }

    public double getNotaSeminario(){
        return notaSeminario;
    }

    public double getNotaParticipacao(){
        return notaParticipacao;
    }

    // Outros métodos
    public String toString(){
        return  super.toString() + "\n" +
                "--> Grau B" + "\n" +
                "Nota das Atividades: " + notaAtividades + "\n" +
                "Nota do Seminário: " + notaSeminario  + "\n" +
                "Nota de Participação: " + notaParticipacao;
    }

    public double calculaNotaFinalGrau(){
        return (notaAtividades * 0.3) + (notaSeminario * 0.6) + (notaParticipacao * 0.1);
    }
}
