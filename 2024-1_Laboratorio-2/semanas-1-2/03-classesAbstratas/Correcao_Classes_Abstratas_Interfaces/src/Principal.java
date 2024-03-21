import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int quantContas = 0;
		
		while(quantContas <= 0){
			System.out.println("Quantas contas serão criadas?");
			quantContas = Integer.parseInt(s.nextLine());
		}
		
		ContaBancaria[] contas = new ContaBancaria[quantContas];
		
		for(int i=0; i<contas.length; i++){
			System.out.println("Digite 1 para Conta Corrente ou outro valor para Conta Poupança:");
			contas[i] = Integer.parseInt(s.nextLine()) == 1 ? new ContaCorrente("123456") : new ContaPoupanca("123456");
			//OU
			/*if(Integer.parseInt(s.nextLine()) == 1)
				contas[i] = new ContaCorrente("123456", 0);
			else
				contas[i] = new ContaPoupanca("123456", 0.5);*/
		}
		
		for(ContaBancaria cb: contas)
			cb.setNumero((int)(Math.random()*10000+1));
		
		//for(int i=0; i<contas.length; i++) --> contas[i]
		for(ContaBancaria cb: contas)
			if(cb instanceof ContaPoupanca)
				((ContaPoupanca) cb).setTaxaRendimento(Math.random());
		
		for(ContaBancaria cb: contas){
			cb.deposita(Math.random()*500);
			cb.saca(Math.random()*100);
			cb.tiraExtrato();
		}
		
		for(ContaBancaria cb: contas)
			if(cb instanceof ContaPoupanca)
				System.out.println("Taxa de rendimento da poupança "+cb.getNumero()+": "+((ContaPoupanca) cb).getTaxaRendimento());
			else if(cb instanceof ContaCorrente)
				System.out.println("Quantidade de transações da conta corrente "+cb.getNumero()+": "+((ContaCorrente)cb).getQuantTransacoes());
	
		Rentavel[] rentaveis = new Rentavel[(int)(Math.random()*10+1)];
		for(int i=0; i<rentaveis.length; i++)
			rentaveis[i] = Math.random() < 0.5 ? new ContaPoupanca("123456") : new TesouroDireto(0);
			//OU
			/*if(Math.random() < 0.5)
				rentaveis[i] = new ContaPoupanca("123456");
			else
				rentaveis[i] = new TesouroDireto(0);*/
			
		for(Rentavel r: rentaveis)
			System.out.println(r.calculaRendimento());
	}
}
