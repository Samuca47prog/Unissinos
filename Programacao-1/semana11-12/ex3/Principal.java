public class Principal{
    public static void main(String[] args){
        double[] lista = new double[10];

        for(int i=0; i < lista.length; i++){
            lista[i] = Teclado.leDouble((i+1) + ": ");
        }

        System.out.println();
    }
}