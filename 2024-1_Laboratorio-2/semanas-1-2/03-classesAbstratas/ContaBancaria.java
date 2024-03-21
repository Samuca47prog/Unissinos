import java.util.Scanner;

public abstract class ContaBancaria {
    private String senha;
    private int numero;
    private Double saldo;

    // --------------------------------------
    // Construtores

    public ContaBancaria(String senha){
        this.senha = senha;
        this.saldo = 0.0;
    }

    public ContaBancaria(String senha, int numero) {
		this.senha = senha;
		this.numero = numero;
        this.saldo = 0.0;
	}

	public ContaBancaria(String senha, int numero, double saldo) {
		this.senha = senha;
		this.numero = numero;
		this.saldo = saldo;
	}

    // --------------------------------------
    // Getters e Setters

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

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // --------------------------------------
    // Métodos abstratos

    public abstract void saca(double valor);
	public abstract void deposita(double valor);
	public abstract void tiraExtrato();

    // --------------------------------------
    // Outros métodos

    public void alteraSenha(String novaSenha){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a senha atual");
        String senhaDigitada = s.next();

        if(senhaDigitada.equals(this.senha)){
            setSenha(novaSenha);
            System.out.println("Sua senha foi alterada!");
        }
        else {
            System.out.println("Senha incorreta!");
        }

    }

    @Override
	public String toString() {
		return "ContaBancaria [senha=" + senha + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
}