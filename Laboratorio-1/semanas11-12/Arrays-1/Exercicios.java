public class Exercicios {

    public void exercicio1(int[] array){
        System.out.print("[");

        if(array != null){
            System.out.print(array[array.length-1]);
            for(int i=array.length-2; i>=0; i--){
                System.out.print(", " + array[i]);
            }
        }

        System.out.println("]");
    }



    public int[] exercicio2(int[] array){
        int[] arrayAoContrario = null;

        if(array != null){
            arrayAoContrario = new int[array.length];

            for(int i=array.length-1; i>=0; i--){
                arrayAoContrario[array.length-1 - i] = array[i];
            }
        }

        return arrayAoContrario;

    }



    public int[] exercicio3(int[] array){
        int[] arrayDePares = null;
        int qtdPares = 0;
        int index = 0;

        if(array != null){

            for(int i=0; i<array.length; i++){
                if(array[i] % 2 == 0){
                    qtdPares++;
                }
            }

            arrayDePares = new int[qtdPares];

            for(int i=0; i<array.length; i++){
                if(array[i] % 2 == 0){
                    arrayDePares[index] = array[i];
                    index++;
                }
            }
        }

        return arrayDePares;

    }



    public int exercicio4(String[] array, String string){
        int index = -1;

        if(array != null){
            for(int i=0; i<array.length; i++){
                if(array[i] == string){
                    index = i;
                }
            }
        }

        return index;

    }



    public int[] exercicio5(boolean[] array){
        int[] retorno = null;

        if(array != null){
            retorno = new int[array.length];

            for(int i=0; i<array.length; i++){
                if(array[i] == true){
                    retorno[i] = 1;
                }
                else{
                    retorno[i] = 0;
                }
            }
        }

        return retorno;

    }

}
