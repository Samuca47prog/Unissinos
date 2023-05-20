import java.util.Arrays;

public class Principal{
    public static void main(String[] args){
        Exercicios exercicios = new Exercicios();

        int[] arrayInt = {1, 2, 3, -4, 5, 6};
        int[] arrayIn2 = {10, 20, 35, 47, -5, -61};
        String[] arrayString = {"Eu", "Memo", "Samuel"};
        boolean[] arrayBool = {true, false, false ,true, true};
        char[] arrayChars = {'C', 'H', 'A', 'R'};
        double[] arrayDouble = {1.2, 43.56, 8, -54.6, -10};



        System.out.println("\n\n Exercício 1");
        exercicios.exercicio1(arrayInt);

        

        System.out.println("\n\n Exercício 2");
        System.out.println(Arrays.toString(exercicios.exercicio2(arrayInt)));



        System.out.println("\n\n Exercício 3");
        System.out.println(Arrays.toString(exercicios.exercicio3(arrayInt)));



        System.out.println("\n\n Exercício 4");
        System.out.println(exercicios.exercicio4(arrayString, "Samuel"));



        System.out.println("\n\n Exercício 5");
        System.out.println(Arrays.toString(exercicios.exercicio5(arrayBool)));



        System.out.println("\n\n Exercício 6");
        System.out.println(Arrays.toString(exercicios.exercicio6(arrayInt, arrayIn2)));



        System.out.println("\n\n Exercício 7");
        System.out.println(Arrays.toString(exercicios.exercicio7(arrayInt, arrayIn2)));



        System.out.println("\n\n Exercício 8");
        exercicios.exercicio8(arrayChars);



        System.out.println("\n\n Exercício 9");
        System.out.println("Média: " + exercicios.exercicio9(arrayInt));



        System.out.println("\n\n Exercício 10");
        System.out.println("Média: " + exercicios.exercicio10(arrayInt));



        System.out.println("\n\n Exercício 11");
        System.out.println(exercicios.exercicio11(arrayInt, 2));



        System.out.println("\n\n Exercício 12");
        System.out.println("Há negativos? " + exercicios.exercicio12(arrayDouble));



        System.out.println("\n\n Exercício 13");
        System.out.println("Maior número: " + exercicios.exercicio13(arrayInt));



        System.out.println("\n\n Exercício 14");
        System.out.println("Posição do maior número: " + exercicios.exercicio14(arrayInt));



        System.out.println("\n\n Exercício 15");
        System.out.println("Menor número: " + exercicios.exercicio15(arrayInt));



        System.out.println("\n\n Exercício 16");
        System.out.println("Posição do menor número: " + exercicios.exercicio16(arrayInt));



        System.out.println("\n\n Exercício 17");
        System.out.println("Posição do menor número: " + exercicios.exercicio17(arrayInt, arrayIn2));



        System.out.println("\n\nFinal");
    }
}