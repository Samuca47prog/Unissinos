public class ContaCorrente extends ContaBancaria{
    private int quantidadeTransacoes;

    // --------------------------------------
    // Construtores

    public ContaCorrente(String senha){
        super(senha);
    }

    public ContaCorrente(String senha, int numero, double saldo, int quantidadeTransacoes){
        super(senha, numero, saldo);
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    // --------------------------------------
    // Getters e Setters

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
    public void setQuantidadeTransacoes(int quantidadeTransacoes) {
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    // --------------------------------------
    // Outros métodos

    @Override
    public void saca(double valor) {
        double saldoRestante = getSaldo() - valor;

        if(saldoRestante > 0){
            setSaldo( saldoRestante );
            System.out.println("Seu saldo agora é de R$ " + saldoRestante);
        }
        else {
            System.out.println("Saldo insuficiente! R$ " + getSaldo());
        }

        quantidadeTransacoes++;
        
    }

    @Override
    public void deposita(double valor) {
        setSaldo(getSaldo() + valor);
        quantidadeTransacoes++;
    }

    @Override
	public void tiraExtrato() {
		System.out.println(this.toString());
		quantidadeTransacoes++;
	}

    @Override
	public String toString() {
		return "ContaCorrente [quantTransacoes=" + quantidadeTransacoes
				+ ", toString()=" + super.toString() + "]";
	}

}
