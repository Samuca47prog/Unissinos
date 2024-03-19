public class Principal{
    public static void main(String[] args){
        int[] lista = {23, 5432, -33, -573, 654, 98};
        int[] listaVazia = {};

        AnaliseArray analise = new AnaliseArray();

        System.out.println("Quantidade negativos: " + analise.quantidadeNegativos(listaVazia));
    }
}