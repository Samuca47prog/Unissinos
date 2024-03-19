public class AnaliseArray {
    public int quantidadeNegativos(int[] lista){
        int qtdNegativos = 0;

        for (int i : lista){
            if(i<0){
                qtdNegativos++;
            }
        }

        return qtdNegativos;
    }
}
