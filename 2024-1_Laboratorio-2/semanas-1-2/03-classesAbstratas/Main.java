import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ------------------------------
        // Pergunta ao usuário quantas contas serão criadas

        Scanner s = new Scanner(System.in);
		
		int quantContas = 0;
		
		while(quantContas <= 0){
			System.out.print("Quantas contas serão criadas? ");
			quantContas = Integer.parseInt(s.nextLine());
		}
		
        ContaBancaria[] contas = new ContaBancaria[quantContas];
        
        // ------------------------------
        // Criação das contas

        for(int i=0; i<contas.length; i++){
			System.out.print("Digite 1 para Conta Corrente ou outro valor para Conta Poupança: ");

            if(Integer.parseInt(s.nextLine()) == 1){
                contas[i] =  new ContaCorrente("123");
                System.out.println("Conta Corrente Criada!");
            }
            else{
                contas[i] =  new ContaPoupanca("123");
                System.out.println("Conta Poupanca Criada!");
            }
		}
		
        // Preenche seus atributos

		for(ContaBancaria cb: contas)
			cb.setNumero((int)(Math.random()*10000+1));
		
		for(ContaBancaria cb: contas)
			if(cb instanceof ContaPoupanca)
				((ContaPoupanca) cb).setTaxaDeRendimento(Math.random());
		
		for(ContaBancaria cb: contas){
			cb.deposita(Math.random()*500);
			cb.saca(Math.random()*100);
			cb.tiraExtrato();
		}
		
        // imprimindo contas bancárias

        System.out.println("\n\n\nPrints!");

		for(ContaBancaria cb: contas){
            System.out.println("");

			if(cb instanceof ContaPoupanca)
				System.out.println("Taxa de rendimento da poupança "+cb.getNumero()+": "+((ContaPoupanca) cb).getTaxaDeRendimento());
			else if(cb instanceof ContaCorrente)
				System.out.println("Quantidade de transações da conta corrente "+cb.getNumero()+": "+((ContaCorrente)cb).getQuantidadeTransacoes());
        }
    }
}
