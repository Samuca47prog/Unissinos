
public class Principal {

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
		
			System.out.println("Valor head: " + lista.head);
			System.out.println("Valor tail: " + lista.tail);
			
			System.out.println(lista);
			while (!lista.isEmpty()) {
				System.out.println(lista.removeFirst());
				System.out.println("Valor head: " + lista.head);
				System.out.println(lista);
			} 
		}catch (UnderflowException e) {
			System.out.println(e);
		}
		
		/*
		//lista duplamente encadeada
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>(); 
		
		System.out.println("Lista Duplamente Encadeada");
		System.out.println("************\n");
		
		
		list.insertLast(2); 
		list.insertLast(4); 
		list.insertLast(6); 
		list.insertLast(1); 
		list.insertLast(8); 
		list.insertLast(9); 
		
		System.out.println(list);
		
		try { 
			list.removeFirst(); 
		} catch (UnderflowException e) { 
			e.printStackTrace(); 
		} 
		
		System.out.println(list);
		
		try { 
			list.removeLast(); 
		} catch (UnderflowException e) { 
			e.printStackTrace(); 
		} 
		
		System.out.println(list);
		*/
		
	}

}
