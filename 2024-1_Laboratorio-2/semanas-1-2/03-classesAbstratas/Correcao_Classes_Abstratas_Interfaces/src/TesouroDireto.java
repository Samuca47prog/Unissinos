
public class TesouroDireto implements Rentavel{

	public double saldo;

	public TesouroDireto(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "TesouroDireto [saldo=" + saldo + "]";
	}

	@Override
	public double calculaRendimento() {
		return saldo * 10.5;
	}
}
