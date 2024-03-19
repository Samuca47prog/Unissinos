public class Principal{
    public static void main(String[] args){
        int[] lista = {23, 5432, 98, -33, -573, 654, -98};
        int[] listaVazia = {};

        AnaliseArray analise = new AnaliseArray();

        boolean[] resultado = analise.positivosOuNegativos(listaVazia);

        System.out.println("Positivos true | Negativos false: " + analise.positivosOuNegativos(listaVazia));


    }
}