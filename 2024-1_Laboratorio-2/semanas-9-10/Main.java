public class Main{
    public static void main(String[] args) {
        StaticList<Integer> listaInteger = new StaticList<Integer>(10);
        listaInteger.add(1);
        listaInteger.add(1);
        listaInteger.add(1);
        listaInteger.add(2);
        listaInteger.add(2);
        listaInteger.add(3);
        listaInteger.add(4);

        imprimeTitulo("Exercício 1");
        Integer[] resultado = evenNumbers(listaInteger);
        for (Integer integer : resultado) {
            System.out.print(integer + "  ");
        }





        StaticList<Character> listaChar1 = new StaticList<Character>(10);
        listaChar1.add('A');
        listaChar1.add('B');
        listaChar1.add('C');
        listaChar1.add('D');
        StaticList<Character> listaChar2 = new StaticList<Character>(10);
        listaChar2.add('E');
        listaChar2.add('F');
        listaChar2.add('G');

        imprimeTitulo("Exercício 2");
        StaticList<Character> resultadoChar = mergeLists(listaChar1, listaChar2);
        for(int i=0; i<resultadoChar.numElements(); i++){
            System.out.print(resultadoChar.get(i) + "  ");
        }




        StaticList<Double> listaDouble1 = new StaticList<Double>(20);
        listaDouble1.add(1.0);
        listaDouble1.add(1.1);
        listaDouble1.add(1.2);
        listaDouble1.add(1.3);
        StaticList<Double> listaDouble2 = new StaticList<Double>(20);
        listaDouble2.add(0.7);
        listaDouble2.add(0.8);
        listaDouble2.add(0.9);


        imprimeTitulo("Exercício 3");
        preApendList(listaDouble1, listaDouble2);
        for(int i=0; i<listaDouble1.numElements(); i++){
            System.out.print(listaDouble1.get(i) + "  ");
        }




        imprimeTitulo("Exercício 4");
        System.out.println("is false: " + listaDouble2.remove(1.0));
        System.out.println("is true: " + listaDouble2.remove(0.9));
        listaDouble2.add(0.9);



        imprimeTitulo("Exercício 5");
        listaDouble2.insertAfter(0.8, 0.85);
        for(int i=0; i<listaDouble2.numElements(); i++){
            System.out.print(listaDouble2.get(i) + "  ");
        }


        imprimeTitulo("Exercício 6");
        listaDouble2.swap(1, 2);
        for(int i=0; i<listaDouble2.numElements(); i++){
            System.out.print(listaDouble2.get(i) + "  ");
        }

        imprimeTitulo("Exercício 7");
        listaDouble2.flip();
        for(int i=0; i<listaDouble2.numElements(); i++){
            System.out.print(listaDouble2.get(i) + "  ");
        }


        imprimeTitulo("Exercício 8");
        listaDouble2.insert(listaDouble1, 2);
        for(int i=0; i<listaDouble2.numElements(); i++){
            System.out.print(listaDouble2.get(i) + "  ");
        }

        imprimeTitulo("Exercício 9");
        listaDouble2.dedup();
        for(int i=0; i<listaDouble2.numElements(); i++){
            System.out.print(listaDouble2.get(i) + "  ");
        }


        imprimeTitulo("Exercício 10");
        StaticList<Integer> listaEquals1 = new StaticList<Integer>(10);
        StaticList<Integer> listaEquals2 = new StaticList<Integer>(10);

        listaEquals1.add(1);
        listaEquals1.add(2);
        listaEquals2.add(1);
        listaEquals2.add(2);


        System.out.println("is true: " + listaEquals1.equals(listaEquals2));
        System.out.println("is false: " + listaDouble1.equals(listaDouble2));


        imprimeTitulo("Exercício 12");
        listaDouble2.remove(2, 5);
        for(int i=0; i<listaDouble2.numElements(); i++){
            System.out.print(listaDouble2.get(i) + "  ");
        }


    }

    public static void imprimeTitulo(String titulo){
        System.out.println("\n\n\n-----------");
        System.out.println("\t" + titulo);
        System.out.println("-----------");
    }

    // Exercício 1
    public static Integer[] evenNumbers(List<Integer> lista){
        int evenNumbersCount=0;
        for(int i=0; i<lista.numElements(); i++){
            if(lista.get(i)%2 == 0){
                evenNumbersCount++;
            }
        }

        Integer[] result = new Integer[evenNumbersCount];
        int j=0;
        for(int i=0; i<lista.numElements(); i++){
            if(lista.get(i)%2 == 0){
                result[j] = lista.get(i);
                j++;
            }
        }

        return result;
    }

    // Exercício 2
    public static StaticList<Character> mergeLists(StaticList<Character> t1, StaticList<Character> t2){
        int totalLentgh = t1.numElements() + t2.numElements();
        int j=0, k=0;

        StaticList<Character> result = new StaticList<Character>(totalLentgh);

        for(int i=0; i<totalLentgh; i++){
            if(i%2 == 0 && j<t1.numElements()){
                result.add(t1.get(j));
                j++;
            }
            if(i%2 != 0 && k<t2.numElements()){
                result.add(t2.get(k));
                k++;
            }
        }

        return result;
    }

    // Exercício 3
    public static void preApendList(StaticList<Double> t1, StaticList<Double>t2){
        for(int i=0; i<t2.numElements(); i++){
            t1.insert(t2.get(i), i);
        }
    }
}