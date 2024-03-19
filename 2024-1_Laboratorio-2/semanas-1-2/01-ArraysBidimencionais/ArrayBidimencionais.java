import java.util.Scanner;

public class ArrayBidimencionais {

    public static void main(String[] args) {
        // ------------------------------------

        ArrayBidimencionais ArrBidi = new ArrayBidimencionais();

        double[][] arrayExample = new double[3][2];
        double[][] arrayExampleDouble = {
            {1.0,   2,      3},
            {4,     5.1,    6},
            {7,     8,      9.2}
        };
        int[][] arrayExampleint = {
            {1,   2,    3},
            {4,   -5,    6},
            {-7,   8,    9}
        };

        ArrBidi.printHeader("Exercicio 1 a");
        imprimirArrayBidimensional(ArrBidi.exercicio1a());

        ArrBidi.printHeader("Exercicio 1 b");
        imprimirArrayBidimensional(ArrBidi.exercicio1b());

        ArrBidi.printHeader("Exercicio 1 c");
        imprimirArrayBidimensional(ArrBidi.exercicio1c());

        ArrBidi.printHeader("Exercicio 1 d");
        imprimirArrayBidimensional(ArrBidi.exercicio1d());

        ArrBidi.printHeader("Exercicio 2");
        // imprimirArrayBidimensional(ArrBidi.exercicio2());

        ArrBidi.printHeader("Exercicio 3");
        // imprimirArrayBidimensionalDeDouble(ArrBidi.exercicio3());

        ArrBidi.printHeader("Exercicio 4 e 5");
        System.out.println("Quantidade de elementos: " + ArrBidi.exercicio4_e_5(arrayExample));

        ArrBidi.printHeader("Exercicio 6");
        System.out.println("Saída: \n" + ArrBidi.exercicio6(arrayExampleDouble));

        ArrBidi.printHeader("Exercicio 7");
        System.out.println("Maior elemento: \n" + ArrBidi.exercicio7(arrayExampleDouble));

        ArrBidi.printHeader("Exercicio 8");
        System.out.println("Soma dos elementos: \n" + ArrBidi.exercicio8(arrayExampleint));

        ArrBidi.printHeader("Exercicio 9");
        System.out.println("Média dos elementos: \n" + ArrBidi.exercicio9(arrayExampleDouble));

        ArrBidi.printHeader("Exercicio 10");
        // imprimirArrayBidimensionalDeString(ArrBidi.exercicio10());

        ArrBidi.printHeader("Exercicio 11");
        imprimirArrayUnidimensional(ArrBidi.exercicio11(arrayExampleint));
    }

    public void printHeader(String title){
        System.out.println("\n\n");
        System.out.println(" ============== ");
        System.out.println(" --> " + title);
        System.out.println(" ============== ");
    }
    
    // Método para imprimir os conteúdos de um array bidimensional
    public static void imprimirArrayBidimensional(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para imprimir os conteúdos de um array bidimensional de double
    public static void imprimirArrayBidimensionalDeDouble(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

     // Método para imprimir os conteúdos de um array bidimensional de double
     public static void imprimirArrayBidimensionalDeString(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void imprimirArrayUnidimensional(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        
        System.out.println();
        }
    }

    public int[][] exercicio1a(){
        /* OUTPUT:
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9*/

        int[][] array = new int[3][10];

        for(int l=0; l<array.length; l++)
            for(int c=0; c<array[l].length; c++)
                array[l][c] = c;
        
        return array;
    }

    public int[][] exercicio1b(){
        /* OUTPUT:
            0 1 4 9 16 25 36 49 64 81
            0 1 4 9 16 25 36 49 64 81
            0 1 4 9 16 25 36 49 64 81
            0 1 4 9 16 25 36 49 64 81
            0 1 4 9 16 25 36 49 64 81*/

        int[][] array = new int[5][10];

        for(int l=0; l<array.length; l++)
            for(int c=0; c<array[l].length; c++)
                array[l][c] = c*c;
        
        return array;
    }

    public int[][] exercicio1c(){
        /* OUTPUT:
            0 0 0 0 0 0
            1 1 1 1 1 1
            2 2 2 2 2 2
            3 3 3 3 3 3
            4 4 4 4 4 4
            5 5 5 5 5 5*/

        int[][] array = new int[6][6];

        for(int l=0; l<array.length; l++)
            for(int c=0; c<array[l].length; c++)
                array[l][c] = l;
        
        return array;
    }

    public int[][] exercicio1d(){
        /* OUTPUT:
            -1  -1  -1  -1  -1  -1
            0   0   0   0   0   0
            -1  -1  -1  -1  -1  -1
            0   0   0   0   0   0
            -1  -1  -1  -1  -1  -1
            0   0   0   0   0   0
            -1  -1  -1  -1  -1  -1
            0   0   0   0   0   0
            -1  -1  -1  -1  -1  -1*/

        int[][] array = new int[9][6];

        for(int l=0; l<array.length; l++)
            for(int c=0; c<array[l].length; c++) {
                if(l%2 == 0){
                    //linha é par
                    array[l][c] = -1;
                }
                else {
                    // linha é impar
                    array[l][c] = 0;
                }
            }
        
        return array;
    }

    public int[][] exercicio2(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o numero de linhas: ");
        int linhas = Integer.parseInt(scan.next());
        System.out.print("Informe o numero de colunas: ");
        int colunas = Integer.parseInt(scan.next());

        int[][] retorno = new int[linhas][colunas];
        
        for(int i=0; i<retorno.length; i++)
            for(int j=0; j<retorno[i].length; j++)
                retorno[i][j] = (int)(Math.random()*100);
        
        return retorno;
    }
    
    public double[][] exercicio3(){
        Scanner scan = new Scanner(System.in);

        double[][] retorno = new double[2][5];

        System.out.println("Informe os valores de cada posição: ");

        for(int i=0; i<retorno.length; i++)
            for(int j=0; j<retorno[i].length; j++){
                System.out.print(String.format("[%d][%d]: ", i+1, j+1));
                double value = Double.parseDouble(scan.next());
                retorno[i][j] = value;
            }
                
        return retorno;
    }

    public int exercicio4_e_5(double[][] array){
        int quantidadeElementos = 0;

        for(int i=0; i<array.length; i++)
            for(int j=0; j<array[i].length; j++){
                quantidadeElementos++;
            }
                
        return quantidadeElementos;
    }

    public String exercicio6(double[][] array){
        String resultado = "";


        for(int i=0; i<array.length; i++){
            resultado += array[i][0];

            for(int j=1; j<array[i].length; j++){
                resultado += " - " + array[i][j];
            }
            resultado += "\n";
        } 
                
        return resultado;
    }

    public double exercicio7(double[][] array){
        double resultado = array[0][0];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j] > resultado)
                    resultado = array[i][j];
            }
        } 
                
        return resultado;
    }

    public int exercicio8(int[][] array){
        int resultado = 0;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                resultado += array[i][j];
            }
        } 
                
        return resultado;
    }

    public double exercicio9(double[][] array){
        double soma = 0;
        int quantidadeElementos = 0;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                soma += array[i][j];
                quantidadeElementos++;
            }
        } 
                
        return soma / quantidadeElementos;
    }

    public String[][] exercicio10(){
        Scanner scan = new Scanner(System.in);

        int linhas = (int)(Math.random()*5) + 1;
        int colunas = (int)(Math.random()*3) + 1;

        System.out.println(String.format("[%d][%d]", linhas, colunas));

        String[][] retorno = new String[linhas][colunas];
        
        for(int i=0; i<retorno.length; i++)
            for(int j=0; j<retorno[i].length; j++)
                retorno[i][j] = scan.next();
        
        return retorno;
    }

    public int[] exercicio11(int[][] array){
        
        //1° passo: Descobre a quantidade de positivos que há
        int quantidadePositivos = 0;
        for(int i=0; i<array.length; i++)
            for(int j=0; j<array[i].length; j++)
                if(array[i][j] > 0)
                    quantidadePositivos++;

        int[] resultado = new int[quantidadePositivos];

        int k = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j] > 0){
                    resultado[k] = array[i][j];
                    k++;
                }
            }
        } 
                
        return resultado;
    }
}
