import java.util.Scanner;

public class ExerciciosArrays_lista1 {

		public int[][] exercicio1a(){
			/*0 1 2 3 4 5 6 7 8 9
			  0 1 2 3 4 5 6 7 8 9
			  0 1 2 3 4 5 6 7 8 9*/
			int[][] array = new int[3][10];
			for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++)
					array[i][j] = j;
			
			return array;
		}
		
		public int[][] exercicio1b(){
			/*0 1 4 9 16 25 36 49 64 81
			0 1 4 9 16 25 36 49 64 81
			0 1 4 9 16 25 36 49 64 81
			0 1 4 9 16 25 36 49 64 81
			0 1 4 9 16 25 36 49 64 81*/
			int[][] array = new int[5][10];
			for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++)
					array[i][j] = j * j; //(int) Math.pow(j, 2);
			return array;
		}
		
		public int[][] exercicio1c(){
		  /*0 0 0 0 0 0
			1 1 1 1 1 1
			2 2 2 2 2 2
			3 3 3 3 3 3
			4 4 4 4 4 4
			5 5 5 5 5 5*/
			
			int[][] array = new int[6][6];
			for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++)
					array[i][j] = i;
			
			return array;
		}
		
		public int[][] exercicio1d(){
			 /*-1 -1 -1 -1 -1 -1
			  0  0  0  0  0  0
			 -1 -1 -1 -1 -1 -1
			  0  0  0  0  0  0
			 -1 -1 -1 -1 -1 -1
			  0  0  0  0  0  0
			 -1 -1 -1 -1 -1 -1
			  0  0  0  0  0  0
			 -1 -1 -1 -1 -1 -1*/
			int[][] array = new int[9][6];
			for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++)
					array[i][j] = i % 2 == 0 ? -1 : 0;
					
					/*if(i % 2 == 0)
						array[i][j] = -1;
					else
						array[i][j] = 0;*/
					
			return array;
		}
		
		public int[][] exercicio2(){
			Scanner s = new Scanner(System.in);
			System.out.println("Informe o numero de linhas:");
			int linhas = Integer.parseInt(s.next());
			System.out.println("Informe o numero de colunas:");
			int colunas = Integer.parseInt(s.next());
			int[][] retorno = new int[linhas][colunas];
			
			for(int i=0; i<retorno.length; i++)
				for(int j=0; j<retorno[i].length; j++)
					retorno[i][j] = (int)(Math.random()*100);
			
			return retorno;
		}
		
		public double[][] exercicio3(){
			Scanner s = new Scanner(System.in);
			double[][] retorno = new double[2][5];
			for(int i=0; i<retorno.length; i++)
				for(int j=0; j<retorno[i].length; i++){
					System.out.println("Digite o próximo valor (double):");
					retorno[i][j] = Double.parseDouble(s.next());
				}
			return retorno;
		}
		
		public int exercicio4_e_5(double[][] array){
			int quantElementos = 0;
			
			for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++)
					quantElementos++;
			
			return quantElementos;
		}
		
		public void imprimeArrayBidimensional(int[][] array){
			for(int i=0; i<array.length; i++){
				for(int j=0; j<array[i].length; j++)
					System.out.print(array[i][j]+" ");
				System.out.println();
			}
		}
		
		public String exercicio6(int[][] array){
			String retorno = "";
			for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++)
					retorno += j == array[i].length-1 ? array[i][j] + "\n" : array[i][j]+" - ";
			return retorno;
		}
		
		public double exercicio7(double[][] array){
			double maior = array[0][0];
			for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++)
					if(array[i][j] > maior)
						maior = array[i][j];
			return maior;
		}
		
		public int exercicio8(int[][] array){
			int soma = 0;
			for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++)
					soma += array[i][j];
			return soma;
		}
		
		public double exercicio9(int[][] array){
			double soma = 0;
			int quantElementos = 0;
			for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++){
					soma += array[i][j];
					quantElementos++;
				}
			return soma/quantElementos;
		}
		
		public char[][] exercicio10(){
			Scanner s = new Scanner(System.in);
			
			int linhas = (int)(Math.random()*5+1);
			int colunas = (int)(Math.random()*3+1);
			
			char[][] retorno = new char[linhas][colunas];
			
			for(int i=0; i<retorno.length; i++)
				for(int j=0; j<retorno[i].length; j++){
					System.out.println("Digite o próximo valor (char):");
					retorno[i][j] = s.next().charAt(0);
				}
			
			return retorno;
		}
		
		public int[] exercicio11(int[][] array){
			int[] retorno = new int[array.length * array[0].length];
			int cont = 0;
			for(int i=0; i<array.length; i++)
				for(int j=0; j<array[i].length; j++)
					if(array[i][j] >= 0)
						retorno[cont++] = array[i][j];
			return retorno;
		}
		
		public static void main(String[] args) {
			int[][] arrayBi = {{3, 5, 6}, {5, 4, 6}, {1, 9, 0}, {5, 4, 6}};
			int[] arrayUni = {5, 1, 3, 5, 6, 8};
			System.out.println(new ExerciciosArrays_lista1().exercicio6(arrayBi));
		}
}





