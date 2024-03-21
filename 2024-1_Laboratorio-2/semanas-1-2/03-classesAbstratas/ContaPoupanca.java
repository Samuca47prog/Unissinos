public class ContaPoupanca extends ContaBancaria implements Rentavel{
    private double taxaDeRendimento;

    // --------------------------------------
    // Construtores

    public ContaPoupanca(String senha){
        super(senha);
    }

    public ContaPoupanca(String senha, int numero, double saldo, double taxaDeRendimento){
        super(senha, numero, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    // --------------------------------------
    // Getters e Setters

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }
    
    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
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
        
    }

    @Override
    public void deposita(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
	public void tiraExtrato() {
		System.out.println(this.toString());
	}

    @Override
	public String toString() {
		return "ContaPoupanca [taxa de rendimento=" + taxaDeRendimento
				+ ", toString()=" + super.toString() + "]";
	}

    @Override
    public double calculaRendimento() {
        return getSaldo() * getTaxaDeRendimento();
    }
}