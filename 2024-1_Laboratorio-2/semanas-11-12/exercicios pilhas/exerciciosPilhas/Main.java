public class Main {
    public static void main(String[] args) {

        imprimeTitulo("Exercício 1"); // -------------------------------------
        StaticStack<Integer> p1 = new StaticStack<Integer>(5);
        StaticStack<Integer> p2 = new StaticStack<Integer>(5);
        StaticStack<Integer> p3 = new StaticStack<Integer>(5);
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);

        try {
            int temp = p1.pop();
            p2.push(temp);
            p3.push(p1.pop());
            p2.push(p1.pop());
            temp = p1.pop();
            p3.push(temp);
            p1.push(p2.pop());
            p3.push(p2.pop());
            p3.push(p1.pop());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString());


        imprimeTitulo("Exercício 2"); // -------------------------------------
        p1 = new StaticStack<Integer>(5);
        p2 = new StaticStack<Integer>(5);
        p3 = new StaticStack<Integer>(5);
        try {
            p1.push(10);
            p1.push(20);
            p1.push(30);
            p1.push(40);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            p2.push(p1.pop());
            p2.push(p1.pop());
            p3.push(p1.pop());
            p3.push(p1.pop());
            p1.push(p2.pop());
            p3.push(p2.pop());
            p3.push(p1.pop());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString());


        imprimeTitulo("Exercício 3"); // -------------------------------------
        p1 = new StaticStack<Integer>(5);
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        p1.push(1);

        Integer[] ex3 = itemsExcept(1, p1);
        for (Integer integer : ex3) {
            System.out.println(integer);
        }


        imprimeTitulo("Exercício 4"); // -------------------------------------
        p1 = new StaticStack<Integer>(5);
        p1.push(1);
        p1.push(2);
        p1.push(3);

        p2 = new StaticStack<Integer>(5);
        p2.push(5);
        p2.push(6);

        transferElements(p1, p2);

        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());


        imprimeTitulo("Exercício 5"); // -------------------------------------
        p1 = new StaticStack<Integer>(5);
        p1.push(1);
        p1.push(2);
        p1.push(3);

        p2 = new StaticStack<Integer>(5);
        p2.push(4);
        p2.push(5);

        prependStack(p1, p2);

        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());


        imprimeTitulo("Exercício 8"); // -------------------------------------
        p1 = new StaticStack<Integer>(5);
        p1.push(1);
        p1.push(2);
        p1.push(3);

        p1.flip();

        System.out.println("p1: " + p1.toString());
    }

    /*
     * END MAIN
     */

    public static void imprimeTitulo(String titulo){
        System.out.println("\n\n\n-----------");
        System.out.println("\t" + titulo);
        System.out.println("-----------");
    }


    // Exercício 3
    public static Integer[] itemsExcept(int number, Stack<Integer> p) {
        Integer[] retorno = new Integer[p.numElements()];
        int i=0; 

        Stack<Integer> aux = new StaticStack<>(p.numElements());

        // Retira items de p e armazena em aux, salvando também em retorno 
        while(!p.isEmpty()) {
            int elemento = p.pop();
            if(elemento != number)
                retorno[i++] = elemento;
            aux.push(elemento);
        }

        // copia os items de volta para p
        while(!aux.isEmpty())
            p.push(aux.pop());

        return retorno;
    }


    // Exercício 4
    public static <E> void transferElements(Stack<E> s1, Stack<E> s2){
        StaticStack<E> aux = new StaticStack<E>(s1.numElements());

		while (!s1.isEmpty()) {
			aux.push(s1.pop());
		}

		while (!aux.isEmpty()) {
			E el = aux.pop();
			s1.push(el);
			s2.push(el);
		}
    }


    // Exercício 5
    public static <E> void prependStack(Stack<E> p1, Stack<E> p2){
        StaticStack<E> auxp1 = new StaticStack<E>(p1.numElements());
        StaticStack<E> auxp2 = new StaticStack<E>(p2.numElements());

        // Deixa p1 vazio
		while (!p1.isEmpty()) {
			auxp1.push(p1.pop());
		}

        // Transfere p2 para o p1
		while (!p2.isEmpty()) {
            E el = p2.pop();
			p1.push(el);
			auxp2.push(el);
		}

        // devolve os elementos de p2
        StaticStack<E> auxp22 = new StaticStack<E>(p1.numElements());
        while (!auxp2.isEmpty()) {
            auxp22.push(auxp2.pop());
        }
        while (!auxp22.isEmpty()) {
            p2.push(auxp22.pop());
        }

        // devolve os elementos de p1 para o topo
		while (!auxp1.isEmpty()) {
			p1.push(auxp1.pop());
		}
    }


}
