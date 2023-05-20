import java.util.Arrays;

public class Principal{
    public static void main(String[] args){
        Exercicios exercicios = new Exercicios();

        int[] arrayInt = {1, 2, 3, 4, 5, 6};
        String[] arrayString = {"Eu", "Memo", "Samuel"};
        boolean[] arrayBool = {true, false, false ,true, true};



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



        System.out.println("Final");
    }
}