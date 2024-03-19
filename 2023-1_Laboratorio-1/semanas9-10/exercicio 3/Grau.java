public class Grau {
    private String dataInicio;
    private String dataFim;

    // Construtores
    public Grau(){
        this.dataInicio = null;
        this.dataFim = null;
    }

    public Grau(String dataInicio, String dataFim){
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Setters
    public void setDataInicio(String dataInicio){
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim){
        this.dataFim = dataFim;
    }

    // Getters
    public String getDataInicio(){
        return dataInicio;
    }

    public String getDataFim(){
        return dataFim;
    }

    // Outros métodos
    public String toString(){
        return  "--- Grau ---" +
                "Data de início: " + dataInicio + "\n" +
                "Data de fim: " + dataFim;
    }
}
