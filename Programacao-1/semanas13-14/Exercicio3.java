public class Exercicio3 {
    
    public void imprimeUniversidades(Universidade[] universidades){
        
        for(Universidade u : universidades){
            if(u != null)
                u.imprimeInformacoes();
        }

    }
}
