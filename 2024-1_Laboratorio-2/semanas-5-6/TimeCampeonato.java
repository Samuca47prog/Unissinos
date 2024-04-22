public class TimeCampeonato{

    private String nome;
    private int saldoGols;

    public TimeCampeonato(String nome, int saldoGols){
        this.nome = nome;
        this.saldoGols = saldoGols;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldoGols() {
        return saldoGols;
    }
    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    @Override
	public String toString() {
		return "TimeCampeonato [nome=" + nome + ", saldoGols=" + saldoGols
				+ "]";
	}
}