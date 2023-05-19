public class AnaliseArray {
    public boolean[] positivosOuNegativos(int[] lista){
        boolean[] posOuNeg = new boolean[lista.length];

        for(int i=0; i<lista.length; i++){
            if(lista[i]>=0){
                posOuNeg[i] = true;
            } 
            else{
                posOuNeg[i] = false;
            }
        }

        return posOuNeg;
    }
}
