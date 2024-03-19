public class Principal {
    public static void main(String[] args){

        /* Passo 1 e 2 */
        Competicao comp = new Competicao("Correr cansa", new Data(19, 05, 2011));
        comp.imprimeInfo();

        /* Passo 3 e 4 */
        Nadador nadador = new Nadador("Cielo", 23, "borboleta");
        nadador.imprimeInfo();

        /* Passo 5 */
        Corredor corredor = new Corredor("Pedro", 91, 68, comp);

        /* Passo 6 */
        corredor.getCompeticao().getData().setMes(02);

        /* Passo 7 */
        corredor.imprimeCompeticao();

        /* Passo 8 e 9 */
        Competicao saoSilvestre = new Competicao("São Silvestre", new Data(1, 1, 2012));
        Corredor corredor2 = new Corredor("Augosto", 100, 70, saoSilvestre);
        corredor2.imprimeInfo();

        /* Passo 10 */
        int escolha = 1;

        Atleta a;

        if(escolha == 1){
            a = new Nadador("Phelps", 40, "Lendarios");
        }
        else{
            a = new Corredor("Bolt", 42, 75, saoSilvestre);
        }

        /* Passo 11 */
        InformacoesAtletas infoAtleta = new InformacoesAtletas();

        infoAtleta.imprimeExclusivosAtleta(a);
        infoAtleta.imprimeInformacoesAtleta(a);

        /* Passo 12 */
        if(a instanceof Nadador){
            ((Nadador)a).setCategoria("Livre");
        }

        if(a instanceof Corredor){
            ((Corredor)a).setPeso(89);
        }

        infoAtleta.imprimeExclusivosAtleta(a);
        infoAtleta.imprimeInformacoesAtleta(a);
    }

}
