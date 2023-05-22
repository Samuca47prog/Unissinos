import java.lang.Math;

public class Exercicios{
    
    public void exercicio1(){
        int qtdNotas = 0;
        double[] notas; 
        double somaNotas = 0;

        qtdNotas = Teclado.leInt("Quantidade de notas: ");
        notas = new double[qtdNotas];

        for(int i=0; i<qtdNotas; i++){
            notas[i] = Teclado.leDouble("Nota " + (i+1) + ": ");
            somaNotas += notas[i];
        }


        System.out.println("Média do aluno: " + somaNotas/qtdNotas);

    }


    public void exercicio2(){
        int qtdNomes = 0;
        String[] nomes; 

        qtdNomes = Teclado.leInt("Quantidade de nomes: ");
        nomes = new String[qtdNomes];

        for(int i=0; i<qtdNomes; i++){
            nomes[i] = Teclado.leString("Nome " + (i+1) + ": ");
        }


        System.out.print("Dados informados: " + nomes[0]);
        for(int i=1; i<qtdNomes; i++){
            System.out.print(", " + nomes[i]);
        }
        System.out.print(".");

    }



    public int exercicio3(int[] array){
        int soma = 0;

        for(int i=0; i<array.length; i++){
            soma += array[i];
        }

        return soma;
    }



    public boolean procuraNome(String[] array, String nome){
        boolean nomeAchado = false;

        for(int i=0; i<array.length; i++){
            if( array[i].equals(nome) ){
                nomeAchado = true;
                System.out.println("Nome localizado na posição: " + i);
            }
        }

        return nomeAchado;
    }



    public int[] exercicio5(int[] array1, int[] array2){

        int[] soma;

        if(array1.length != array2.length){
            return null;
        }

        soma = new int[array1.length];


        for(int i=0; i<array1.length; i++){
            soma[i] = array1[i] + array2[i];
        }

        return soma;

    }


    public void exercicio6(double[] array){

        double maiorValor = array[0];
        double menorValor = array[0];
        double somaValores = 0;


        for(int i=1; i<array.length; i++){
            if(array[i] > maiorValor){
                maiorValor = array[i];
            }

            if(array[i] < menorValor){
                menorValor = array[i];
            }

            somaValores += array[i];
        }


        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Média: " + somaValores / array.length);
    }


    public void exercicio7(){
        int[] array = new int[ (int) ((Math.random( )*100)+1) ];

        for(int i=0; i<array.length; i++){
            array[i] = (int) ((Math.random( )*100)+1);
        }


        System.out.println("Tamanho do array: " + array.length);

        System.out.print(array[0]);
        for(int i=1; i<array.length; i++){
            System.out.print("-" + array[i]);
        }
    }
}