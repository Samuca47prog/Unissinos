public class AnaliseArray {
    public boolean[] positivosOuNegativos(int[] lista){
        boolean[] posOuNeg = new boolean[lista.length];

        if(lista == null)
            return null;

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
