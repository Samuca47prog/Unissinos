public class Exercicio7 {

    public int posicaoMaiorValor(double[] array){
        int posicaoMaiorValor = 0;

        if(array == null) return -1;

        for(int i=1; i<array.length; i++ ){
            if(array[i] > array[posicaoMaiorValor]){
                posicaoMaiorValor = i;
            }
        }

        return posicaoMaiorValor;
    }

}
