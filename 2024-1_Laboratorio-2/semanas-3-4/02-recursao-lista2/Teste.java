public class Teste {

    public static void printaCabecalho(String cabecalho){
        System.out.println("\n");
        System.out.println("===========================");
        System.out.println("\t" + cabecalho);
        System.out.println();
    }


    public static void main(String[] args) {
        Exercicios ex = new Exercicios();

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


        printaCabecalho("Exercício 1");
        System.out.println("2 should return true: " + ex.exercicio1(arrayDeInt, 2));
        System.out.println("7 should return false: " + ex.exercicio1(arrayDeInt, 7));
        System.out.println("9 should return true: " + ex.exercicio1(arrayDeInt, 9));


        printaCabecalho("Exercício 2");
        System.out.println("2 is prime: " + ex.exercicio2(2));
        System.out.println("21 is NOT prime: " + ex.exercicio2(21));
        System.out.println("47 is prime: " + ex.exercicio2(47));


        printaCabecalho("Exercício 3");
        System.out.println("prime: " + ex.exercicio3("prime"));
        System.out.println("Grêmio: " + ex.exercicio3("Grêmio"));


        printaCabecalho("Exercício 4");
        System.out.println("3: 1,8333...  " + ex.exercicio4(3));
        System.out.println("5: 2,2833...  " + ex.exercicio4(5));
        System.out.println("20: " + ex.exercicio4(20));


        printaCabecalho("Exercício 5");
        System.out.println("renner: true  ...  " + ex.exercicio5("renner"));
        System.out.println("samuel: false ...  " + ex.exercicio5("samuel"));
        System.out.println("ana:    true  ...  " + ex.exercicio5("ana"));
        // System.out.println("o teu dueto:   true  ...  " + ex.exercicio5("o teu dueto"));

    }
}
