import java.util.Arrays;

public class Teste{
    public static void main(String[] args){
        
        Exercicios exercicios = new Exercicios();

        int[] arrayint = {1, 2, 3, 4};
        int[] arrayInt2 = {1, 2, 3, 4};
        String[] arrayString = {"Samuel", "Rafaela", "Simão", "Machado"};
        double[] arrayDouble = {1.2, 324.5, 23.45};

/* 
        System.out.println("\n\n Exercício 1");
        exercicios.exercicio1();
*/

/*/
        System.out.println("\n\n Exercício 2");
        exercicios.exercicio2();
*/


        System.out.println("\n\n Exercício 3");
        System.out.print("Soma dos valores: " + exercicios.exercicio3(arrayint));



        System.out.println("\n\n Exercício 4");
        System.out.print("Encontra valor: " + exercicios.procuraNome(arrayString, "Samuel"));



        System.out.println("\n\n Exercício 5");
        System.out.print("Soma posições: " + Arrays.toString(exercicios.exercicio5(arrayint, arrayInt2)));

        

        System.out.println("\n\n Exercício 6");
        exercicios.exercicio6(arrayDouble);



        System.out.println("\n\n Exercício 7");
        exercicios.exercicio7();

    }
}