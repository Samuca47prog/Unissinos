public class Exercicios_lista_1{

    public void printaCabecalho(String cabecalho){
        System.out.println("\n");
        System.out.println("===========================");
        System.out.println("\t" + cabecalho);
        System.out.println();
    }

    /*
     * Exercício 1
     * Crie um método recursivo que imprime um array recebido por parâmetro de 
     * trás para frente
     */ 
    public void imprimeArrayReverso(int[] array) throws IllegalArgumentException{
        if(array == null) throw new IllegalArgumentException();
        imprimeArrayReversoP(array, 0);
    }
    private void imprimeArrayReversoP(int[] array, int i){
        if(i < array.length-1) imprimeArrayReversoP(array, i+1);
        System.out.println("["+i+"]: " + array[i]);
    }

    /*
     * Exercício 2
     * Crie um método recursivo que recebe um array bidimensional de double e
     * retorna a soma dos elementos deste array
     */
    public double SomaArrayBi(double[][] array) throws IllegalArgumentException{
        if(array == null) throw new IllegalArgumentException();
        return SomaArrayBiP(array, 0, 0);
    }

    private double SomaArrayBiP(double[][] array, int l, int c){
        if(l >= array.length) return 0;
        if(c >= array[l].length) return SomaArrayBiP(array, l+1, 0);
        return array[l][c] + SomaArrayBiP(array, l, c+1);
    }

    /*
     * Exercício 3
     * Crie um método chamado encontraPosicaoMenorValor. Este método deve
     * encontrar a posição do menor valor de um array de inteiros V (recebido por
     * parâmetro). Por exemplo, digamos que o array abaixo seja passado por parâmetro:
     *   {23, 35, 16, 8, 13, 11, 10, 20, 9, 12}
     * O método, neste caso, retornaria o valor 3
     */
    public int encontraPosicaoDoMenor(int[] array) throws IllegalArgumentException{
        if(array == null) throw new IllegalArgumentException();
        return encontraPosicaoDoMenorP(array, 0, 0);
    }
    private int encontraPosicaoDoMenorP(int[] array, int i, int posicaoMenor){
        if(i >= array.length) return posicaoMenor;
        if(array[i] < array[posicaoMenor]){
            posicaoMenor = i;
        }
        return encontraPosicaoDoMenorP(array, i+1, posicaoMenor);
    }

    /*
     * Exercício 4
     * Crie um método recursivo chamado printPrimaryDiagonal, que imprime a
     * diagonal primária de uma matriz qualquer. No método público, apenas a matriz
     * deve ser passada por parâmetro.
     * Não esqueça de que uma matriz só possui diagonal secundária caso ela seja uma
     * matriz quadrada.
     * Caso contrário, seu método deve lançar uma exceção do tipo
     * MatrixNotPossibleException, que deve ser criada por você.
     */

    public void printPrimaryDiagonal(int[][] m) throws IllegalArgumentException, MatrixNotPossibleException{
        if(m == null) throw new IllegalArgumentException();
        if(m.length != m[0].length) throw new MatrixNotPossibleException();
        printPrimaryDiagonal(m, 0);
    }
    private void printPrimaryDiagonal(int[][] m, int i){
        if(i <= m.length-1){
            System.out.println("["+i+"]["+i+"]: " + m[i][i]);
            printPrimaryDiagonal(m, i+1);
        }
    }

    /*
     * Exercícios 5
     * Crie um método recursivo chamado binaryToDecimal, que recebe uma String
     * que contém um número em base 2 e retorna um número em base 10. Para isto,
     * você deve utilizar o método de conversão abaixo:
     * 1 1 0 1 0 0 0 1
     * 27 26 25 24 23 22 21 20
     * O valor de entrada deve ter exatamente 8 dígitos, caso contrário a conversão
     * não poderá ser realizada. Para converter o número de binário para decimal,
     * basta somar as potências de 2 das posições que estão em 1. No exemplo acima,
     * teríamos: 27 + 26 + 24 + 20 = 209.
     */

    public int convertStringToInteger(String s) throws IllegalArgumentException{
        if( (s == null) || (s.length() != 8) ) throw new IllegalArgumentException();
        return convertStringToInteger(s, 0);
    }

    private int convertStringToInteger(String s, int i){
        if(i >= s.length()) return 0;
        char digito = s.charAt(s.length()-1-i);
        if(digito == '1') return (int)Math.pow(2, i) + convertStringToInteger(s, i+1);
        return convertStringToInteger(s, i+1);
    }

    public static void main(String[] args) {
        int[] arrayDeInt = {2, 3, 6, 1, 8, 9};
        double[][] arrayDeDouble = {
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6},
            {7.7, 8.8, 9.9}
        };
        int[][] matrixDeInt = {
            {8, 1, 6},
            {11, 15, 10},
            {12, 5, 9}
        };
        


        Exercicios_lista_1 ex = new Exercicios_lista_1();

        ex.printaCabecalho("Exercício 1");
        ex.imprimeArrayReverso(arrayDeInt);

        ex.printaCabecalho("Exercício 2");
        System.out.println("Soma: " + ex.SomaArrayBi(arrayDeDouble));

        ex.printaCabecalho("Exercício 3");
        System.out.println("Menor valor está na posição: " + ex.encontraPosicaoDoMenor(arrayDeInt));
    
        ex.printaCabecalho("Exercício 4");
        try {
            ex.printPrimaryDiagonal(matrixDeInt);
        } catch (MatrixNotPossibleException e) {
            // TODO: handle exception
        }
        
        ex.printaCabecalho("Exercício 5");
        System.out.println("Conversor binário: " + ex.convertStringToInteger("01111111") );

    }

}