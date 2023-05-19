public class Principal{
    public static void main(String[] args){
        int tamanhoArray = Teclado.leInt("Tamanho do array: ");
        int[] array = new int[tamanhoArray];

        for(int i=0; i<array.length; i++){
            array[i] = Teclado.leInt("Valor da posição " + (i+1) + ": ");
        }
        System.out.println();
    }
}