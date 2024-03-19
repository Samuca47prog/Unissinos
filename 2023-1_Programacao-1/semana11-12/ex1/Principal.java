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

        for (int i=0; i < (arrayC.length / 2); i++)
            arrayC[i] = i+1;

        for (int i=(arrayC.length / 2); i < arrayC.length; i++)
            arrayC[i] = arrayC[i - (arrayC.length / 2)] * 10;

        /* Exercício D */
        int[] arrayD = new int[10];

        /*  
         * 3 4 7 12 19 28 39 52 67 84 
         *-1 1 3 5  7  9  11 13 15 17
        */

        arrayD[0] = 3;

        for (int i=1 ; i < arrayD.length; i++){
            arrayD[i] = i*i +3;
        }


        System.out.println();
    }
}
