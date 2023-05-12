/**
 * Crie uma classe chamada Principal. Nesta classe, crie o método main. No main, faça o que se pede:
 * • Crie um objeto do tipo Sala, com todos os parâmetros necessários sendo recebidos pelo Teclado
 * • Imprima as informações da sala
 * • Tente fazer 6 alunos entrarem na sala criada. As informações a serem solicitadas devemser obtidas 
 *   a partir de leituras do Teclado. A cada inserção, imprima na tela o que aconteceu com a tentativa
 *   de entrada do aluno na sala: se ele entrou (ou seja, ocupou uma cadeira), imprima as informações da
 *   cadeira que ele ocupou; se ele não entrou, imprima uma mensagem informando que não havia lugar na sala.
 * • Imprima a área de todas as mesas acopladas nas cadeiras que possuem mesa
 * • Imprima a data da última manutenção de cada cadeira com rodinhas presente na sala
 * • Insira as seguintes linhas NAS PRIMEIRAS LINHAS da classe Principal:
 *		import javax.swing.*;
 * 		import java.awt.Color;
 * Peça para o Usuário digitar o nome de um aluno para procurar na sala. Em seguida, utilize o código abaixo
 * (no final do seu método main) para abrir uma janela contendo a cor da cadeira que este aluno está sentado
 * (caso o aluno seja encontrado em alguma das cadeiras da sala):
 * 		JFrame a = new JFrame();
 * 		a.setSize(200, 200);
 * 		a.getContentPane().setBackground(new Color(R, G, B));
 * 		a.setVisible(true);
 * Atente para o fato de que no trecho de código “a.setBackground(new Color(R,G, B));”, as letras R, G e B
 * devem ser substituídas pelo conteúdo respectivo da cor da cadeira que o aluno está sentado. Se tudo der
 * certo, uma janela com a cor da cadeira vai ser aberta.
**/

import javax.swing.*;
import java.awt.Color;

public class Principal{
	
	public static void main(String[] args){
		Teclado t = new Teclado();
		
		Cor vermelho = new Cor(255, 0, 0);
		Cor azul = new Cor(0, 0, 255);
		Cor verde = new Cor(0, 255, 0);
		
		Data dataManutencao1 = new Data(1, 5, 2023);
		Data dataManutencao2 = new Data(10, 4, 2023);
		
		Cadeira cadeira1 = new CadeiraComMesa(azul, 80, 60);
		Cadeira cadeira2 = new CadeiraComRodinhas(verde, dataManutencao1);
		Cadeira cadeira3 = new CadeiraComMesa(vermelho, 80, 60);
		Cadeira cadeira4 = new CadeiraComRodinhas(azul, dataManutencao2);
		
		String nomeSala = t.leString("Informe o nome da sala: ");
		Sala sala = new Sala(nomeSala, cadeira1, cadeira2, cadeira3, cadeira4);
		
		Aluno a1 = new Aluno("Mestre", 22);
		Aluno a2 = new Aluno("Dunga", 19);
		Aluno a3 = new Aluno("Zangado", 20);
		Aluno a4 = new Aluno("Dengoso", 20);
		Aluno a5 = new Aluno("Atchim", 21);
		Aluno a6 = new Aluno("Feliz", 21);
		
		System.out.println("\nIncluindo o aluno 1 na cadeira com rodinha....");
		if(sala.entraAluno(a1, "rodinha") != null){
			System.out.println("Incluído com sucesso!");
		} else{
			System.out.println("Sala já está cheia.");
		}
		
		System.out.println("\nComo está a sala?");
		System.out.println(sala.toString());
		
		System.out.println("\nIncluindo o aluno 2 na cadeira com mesa....");
		if(sala.entraAluno(a2, "mesa") != null){
			System.out.println("Incluído com sucesso!");
		} else{
			System.out.println("Sala já está cheia.");
		}
		
		System.out.println("\nComo está a sala?");
		System.out.println(sala.toString());

		System.out.println("\nIncluindo o aluno 3 na cadeira com mesa....");
		if(sala.entraAluno(a3, "mesa") != null){
			System.out.println("Incluído com sucesso!");
		} else{
			System.out.println("Sala já está cheia.");
		}
		
		System.out.println("\nComo está a sala?");
		System.out.println(sala.toString());


		System.out.println("\nIncluindo o aluno 4 na cadeira com mesa....");
		if(sala.entraAluno(a4, "mesa") != null){
			System.out.println("Incluído com sucesso!");
		} else{
			System.out.println("Sala já está cheia.");
		}
		
		System.out.println("\nComo está a sala?");
		System.out.println(sala.toString());
		
		System.out.println("\nIncluindo o aluno 5 na cadeira com mesa....");
		if(sala.entraAluno(a5, "mesa") != null){
			System.out.println("Incluído com sucesso!");
		} else{
			System.out.println("Sala já está cheia.");
		}
		
		System.out.println("\nIncluindo o aluno 6 na cadeira com mesa....");
		if(sala.entraAluno(a6, "mesa") != null){
			System.out.println("Incluído com sucesso!");
		} else{
			System.out.println("Sala já está cheia.");
		}
		
		//Imprima a área de todas as mesas acopladas nas cadeiras que possuem mesa
		System.out.println("\n= Imprimindo a área de todas as mesas acopladas nas cadeiras que possuem mesa:");
		sala.exibeAreaMesas();
		
		//Imprima a data da última manutenção de cada cadeira com rodinhas presente na sala
		System.out.println("\n= Imprimindo a data da última manutenção de cada cadeira com rodinhas presente na sala:");
		sala.exibeDataUltimaManutencao();
		
		
		//Localizando um aluno
		String pesquisaNome = t.leString("Informe o nome do aluno para busca: ");
		Cadeira cadeiraAlunoLocalizado = sala.localizarAluno(pesquisaNome);
		
		if(cadeiraAlunoLocalizado == null){
			System.out.println("Aluno " + pesquisaNome + " não localizado.");
		} else{
			System.out.println("Localizado aluno " + pesquisaNome + ".");
			
			JFrame a = new JFrame();
			a.setSize(200, 200);
			Cor corCadeira = cadeiraAlunoLocalizado.getCor();
			a.getContentPane().setBackground(new Color(corCadeira.getR(), corCadeira.getG(), corCadeira.getB()));
			a.setVisible(true);
		}		
		
	}
	
}
