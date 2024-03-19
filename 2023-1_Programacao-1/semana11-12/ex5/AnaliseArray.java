public class AnaliseArray {
    public int quantidadeAparicoes(int valor, int[] lista){
        int aparicoesValor = 0;

        for (int i : lista){
            if(i == valor){
                aparicoesValor++;
            }
        }

        return aparicoesValor;
    }
}
