public class InformacoesAtletas {
    

    public void imprimeExclusivosAtleta(Atleta atleta){
        if(atleta instanceof Nadador){
            System.out.println(
                "É um nadador, e sua categoria é " + ((Nadador)atleta).getCategoria()
            );
        }

        if(atleta instanceof Corredor){
            System.out.println(
                "É um corredor, e seu peso é " + ((Corredor)atleta).getPeso()
            );
        }
    }

    public void imprimeInformacoesAtleta(Atleta atleta){
        if(atleta instanceof Nadador){
            ((Nadador)atleta).imprimeInfo();
        }

        if(atleta instanceof Corredor){
            ((Corredor)atleta).imprimeInfo();
        }
    }
}
