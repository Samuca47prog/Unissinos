
public class ContaPoupanca extends ContaBancaria implements Rentavel{
	private double taxaRendimento;
	
	public ContaPoupanca(String senha) {
		super(senha);
	}

	@Override
	public void saca(double valor) {
		setSaldo(getSaldo() - valor);
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
		return "ContaPoupanca [taxaRendimento=" + taxaRendimento
				+ ", toString()=" + super.toString() + "]";
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public double calculaRendimento() {
		return super.getSaldo() * this.taxaRendimento;
	}
}
