
public class ContaCorrente extends ContaBancaria {

	private int quantTransacoes;
	
	public ContaCorrente(String senha) {
		super(senha);
	}

	@Override
	public void saca(double valor) {
		setSaldo(getSaldo() - valor);
		quantTransacoes++;
	}

	@Override
	public void deposita(double valor) {
		setSaldo(getSaldo() + valor);
		quantTransacoes++;
	}

	@Override
	public void tiraExtrato() {
		System.out.println(this.toString());
		quantTransacoes++;
	}

	public int getQuantTransacoes() {
		return quantTransacoes;
	}

	public void setQuantTransacoes(int quantTransacoes) {
		this.quantTransacoes = quantTransacoes;
	}

	@Override
	public String toString() {
		return "ContaCorrente [quantTransacoes=" + quantTransacoes
				+ ", toString()=" + super.toString() + "]";
	}
}
