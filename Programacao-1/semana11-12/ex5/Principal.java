public class Principal{
    public static void main(String[] args){
        int[] lista = {23, 5432, 98, -33, -573, 654, 98};
        int[] listaVazia = {};
        int valor = 98;

        AnaliseArray analise = new AnaliseArray();

        System.out.println("Quantidade de aparições do número " + valor + ": " + analise.quantidadeAparicoes( valor, lista));
    }
}