public class Principal {
    public static void main(String[] args) {

        /* Exercício A */
        int[] arrayA = new int[10];
    
        for (int i=0; i < arrayA.length; i++)
            arrayA[i] = arrayA.length - i;

        /* Exercício B */
        int[] arrayB = new int[11];

        for (int i=0; i < arrayB.length; i++)
            arrayB[i] = i * i;

        /* Exercício C */
        int[] arrayC = new int[10];

        for (int i=0; i < arrayB.length; i++)
            arrayB[i] = i * i;

        System.out.println();
    }
}
