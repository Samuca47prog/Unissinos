import java.util.Scanner;

public abstract class ContaBancaria {
	private String senha;
	private int numero;
	private double saldo;
	
	public ContaBancaria(String senha) {
		this.senha = senha;
	}
	
	public ContaBancaria(String senha, int numero) {
		this.senha = senha;
		this.numero = numero;
	}

	public ContaBancaria(String senha, int numero, double saldo) {
		this.senha = senha;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void saca(double valor);
	public abstract void deposita(double valor);
	public abstract void tiraExtrato();

	@Override
	public String toString() {
		return "ContaBancaria [senha=" + senha + ", numero=" + numero
				+ ", saldo=" + saldo + "]";
	}
	
	public boolean alteraSenha(String senha){
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a senha anterior:");
		if(s.nextLine().equals(this.senha)){
			this.senha = senha;
			return true;
		}
		return false;
	}
}
