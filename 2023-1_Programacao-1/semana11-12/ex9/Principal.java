public class Principal{
    public static void main(String[] args){
        int[] array = {1, -2, 4, -7};

        for(int i=0; i<array.length; i++)
            array[i] = (array[i] % 2 == 0) ? 1 : -1;

        System.out.println();
    }
}