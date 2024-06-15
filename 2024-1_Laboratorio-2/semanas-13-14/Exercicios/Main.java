public class Main{
    public static void main(String[] args) {
        //lista simplesmente encadeada
		SinglyLinkedList<Integer> lista = new SinglyLinkedList<Integer>();
		
		System.out.println("Lista Simplesmente Encadeada");
		System.out.println("************\n");
		
		try {
			lista.insertLast(1);
			lista.insertLast(2);
			lista.insertLast(3);
			lista.insertLast(4);
			lista.insertLast(5);
			lista.insertLast(6);
			lista.insert(10,0);
			
			System.out.println(lista);

		}catch (UnderflowException e) {
			System.out.println(e);
		}

        // Exercício 2
        System.out.println(SomaElementos(lista));

        // Exercício 3
        System.out.println(lista.split(3));

        // Exercício 4
        System.out.println(createStackFromList(lista));

        
        DoublyLinkedList<Integer> listaD = new DoublyLinkedList<Integer>();
		
		System.out.println("Lista Duplamente Encadeada");
		System.out.println("************\n");
		
		try {
			listaD.insertLast(1);
			listaD.insertLast(2);
			listaD.insertLast(3);
			listaD.insertLast(4);
			listaD.insertLast(5);
			listaD.insertLast(6);
			listaD.insert(0,0);
			
			System.out.println(listaD);

		}catch (UnderflowException e) {
			System.out.println(e);
		}

        // Exercício 5
        listaD.swap(2, 5);
        System.out.println(listaD);

        // Exercício 7
        System.out.println("false == " + isOrderedList(listaD));

        System.out.println("true == " + isOrderedList(listaD));

        // Exercício 8
        System.out.println("3 is found at position 3 == " + pesquisaBinaria(listaD, 3));
        System.out.println("7 is not found, -1 == " + pesquisaBinaria(listaD, 7));
    }

    // Exercício 2
    public static int SomaElementos(SinglyLinkedList<Integer> lista){
        return SomaElementos(lista, 0, 0);
    }

    private static int SomaElementos(SinglyLinkedList<Integer> lista, int soma, int pos){
        if(pos >= lista.numElements())
            return soma;

        soma += lista.get(pos);

        return SomaElementos(lista, soma, pos+1);
    }


    // Exercício 4
    public static StaticStack<Integer> createStackFromList(SinglyLinkedList<Integer> list){
        StaticStack<Integer> stack = new StaticStack<Integer>(list.numElements());

        for(int i=0; i<list.numElements(); i++){
            stack.push(list.get(i));
        }

        return stack;
    }

    // Exercício 7
    public static boolean isOrderedList(DoublyLinkedList<Integer> listD){
        if(listD.numElements() <= 1)
            return true;
        return isOrderedList(listD, 1);
    }

    private static boolean isOrderedList(DoublyLinkedList<Integer> listD, int pos){
        if(pos >= listD.numElements())
            return true;

        if(listD.get(pos-1) > listD.get(pos))
            return false;

        return isOrderedList(listD, pos+1);
    }

    // Exercício 8
    public static int pesquisaBinaria(DoublyLinkedList<Integer> listD, int alvo){
        return pesquisaBinaria(listD, alvo, 0, listD.numElements()-1);
    }

    private static int pesquisaBinaria(DoublyLinkedList<Integer> listD, int alvo, int start, int end){
        if (start > end) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (listD.get(middle) == alvo) {
            return middle;
        } else if (listD.get(middle) > alvo) {
            return pesquisaBinaria(listD, alvo, start, middle - 1);
        } else {
            return pesquisaBinaria(listD, alvo, middle + 1, end);
        }
    }
}