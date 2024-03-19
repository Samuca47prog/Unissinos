public class Exercicio4 {
    
    public Universidade maisAlunos(Universidade[] universidades){

        Universidade UniversidadeComMaisAlunos;
        int indexPrimeiraNaoNula = -1;

        for(int i=0; i<universidades.length; i++){
            if(universidades[i] != null){
                indexPrimeiraNaoNula = i;
                break;
            }
        }

        if(indexPrimeiraNaoNula == -1){
            return null;
        }
        else{
            UniversidadeComMaisAlunos = universidades[indexPrimeiraNaoNula];
        }

        for(int i=1; i<universidades.length; i++){
            if(universidades[i] != null){
                if(universidades[i].getNumeroDeAlunos() > UniversidadeComMaisAlunos.getNumeroDeAlunos()){
                    UniversidadeComMaisAlunos = universidades[i];
                }
            }
        }

        return UniversidadeComMaisAlunos;
    }

}
