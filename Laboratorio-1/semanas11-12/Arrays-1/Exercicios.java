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



    public int[] exercicio6(int[] array1, int[] array2){
        int[] retorno = null;
        int tamanhoRetorno = 0;


        if(array1 != null)
            tamanhoRetorno += array1.length;
        if(array2 != null)
            tamanhoRetorno += array2.length;

        retorno = new int[tamanhoRetorno];


        if(array1 != null){
            for(int i=0; i<array1.length; i++){
                retorno[i] = array1[i];
            }
        }
        if(array2 != null){
            for(int i=0; i<array2.length; i++){
                retorno[i+array1.length] = array2[i];
            }
        }

        return retorno;

    }



    public int[] exercicio7(int[] array1, int[] array2){
        int[] retorno = null;
        int tamanhoRetorno = 0;

        int index = 0;


        if(array1 != null)
            tamanhoRetorno += array1.length;
        if(array2 != null)
            tamanhoRetorno += array2.length;

        retorno = new int[tamanhoRetorno];

        // Posiciona os números negativos
        if(array1 != null){
            for(int i=0; i<array1.length; i++){
                if(array1[i] < 0){
                    retorno[index] = array1[i];
                    index++;
                }
                    
            }
        }
        if(array2 != null){
            for(int i=0; i<array2.length; i++){
                if(array2[i] < 0){
                    retorno[index] = array2[i];
                    index++;
                }
            }
        }

        // Posiciona os números npositivos
        if(array1 != null){
            for(int i=0; i<array1.length; i++){
                if(array1[i] >= 0){
                    retorno[index] = array1[i];
                    index++;
                }
                    
            }
        }
        if(array2 != null){
            for(int i=0; i<array2.length; i++){
                if(array2[i] >= 0){
                    retorno[index] = array2[i];
                    index++;
                }
            }
        }

        return retorno;

    }



    public void exercicio8(char[] chars){
        for(char c : chars){
            System.out.print(c);
        }
    }



    public double exercicio9(int[] array){
        double soma = 0.0;
        int numeroDeElementos = 0;

        for(int i : array){
            soma += i;
            numeroDeElementos++;
        }

        if(numeroDeElementos != 0){
            return soma / numeroDeElementos;
        }
        else{
            return 0;
        }

    }



    public double exercicio10(int[] array){
        double somaPares = 0.0;
        int numeroDeElementosPares = 0;

        for(int i : array){
            if(i%2 == 0){
                somaPares += i;
                numeroDeElementosPares++;
            }
        }

        if(numeroDeElementosPares != 0){
            return somaPares / numeroDeElementosPares;
        }
        else{
            return 0;
        }

    }



    public int exercicio11(int[] array, int posicao){
        if(array != null){
            return array[posicao];
        }
        else{
            return -1;
        }

    }



    public boolean exercicio12(double[] array){
        boolean haNegativos = false;

        for(double d : array){
            if(d < 0){
                haNegativos = true;
            }
        }

        return haNegativos;
    }



    public int exercicio13(int[] array){
        int maiorNumero = array[0];

        for(int i=1; i<array.length; i++ ){
            if(array[i] > maiorNumero){
                maiorNumero = array[i];
            }
        }

        return maiorNumero;
    }


    public int exercicio14(int[] array){
        int posicaoMaiorNumero = 0;

        for(int i=1; i<array.length; i++ ){
            if(array[i] > array[posicaoMaiorNumero]){
                posicaoMaiorNumero = i;
            }
        }

        return posicaoMaiorNumero;
    }


    public int exercicio15(int[] array){
        int menorNumero = array[0];

        for(int i=1; i<array.length; i++ ){
            if(array[i] < menorNumero){
                menorNumero = array[i];
            }
        }

        return menorNumero;
    }


    public int exercicio16(int[] array){
        int posicaoMenorNumero = 0;

        for(int i=1; i<array.length; i++ ){
            if(array[i] < array[posicaoMenorNumero]){
                posicaoMenorNumero = i;
            }
        }

        return posicaoMenorNumero;
    }


    public boolean exercicio17(int[] array1, int[] array2){

        if(array1 == null || array2 == null)
            return false;

        if(array1.length == array2.length){
            for(int i=0; i<array1.length; i++){
                if(array1[i] != array2[i]){
                    return false;
                }
            }
        }
        else {
            return false;
        }

        return true;

    }

}
