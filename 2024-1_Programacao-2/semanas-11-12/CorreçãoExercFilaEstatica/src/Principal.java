
public class Principal {

	public static void main(String[] args) {
		
		
		StaticQueue<Integer> q1 = new StaticQueue<Integer>(10);
		StaticQueue<Integer> q2 = new StaticQueue<Integer>(10);
		StaticQueue<Character> q3 = new StaticQueue<Character>(10);
		StaticQueue<Integer> q4 = new StaticQueue<Integer>(5);
/*
	    try{
	    	
	    	q4.enqueue(1);
			q4.enqueue(3);
			q4.enqueue(5);
			q4.enqueue(7);
			q4.enqueue(9);
			
	    }catch (OverflowException e) {
	    	System.out.println(e);
	    }
	    
	    try{
	    	
	    	q4.dequeue();
	    	q4.dequeue();
			
	    }catch (UnderflowException e) {
	    	System.out.println(e);
	    }
	    
	    try{
	    	
	    	q4.enqueue(2);
			q4.enqueue(4);
			
	    }catch (OverflowException e) {
	    	System.out.println(e);
	    }
	    
	    try{
	    	
	    	q4.dequeue();
			
	    }catch (UnderflowException e) {
	    	System.out.println(e);
	    }
			
	    try{
	    	
	    	q4.enqueue(3);
			
	    }catch (OverflowException e) {
	    	System.out.println(e);
	    }
	    
	    System.out.println(q1);
	    
	    */

		    q1.enqueue(1);
			q1.enqueue(2);
			q1.enqueue(3);
			q1.enqueue(4);
			
			q2.enqueue(5);
			q2.enqueue(6);
			q2.enqueue(7);
			q2.enqueue(8);
			
			System.out.println("Imprimindo a fila 1: ");
			System.out.println(q1.toString());
			System.out.println("Imprimindo a fila 2: ");
			System.out.println(q2.toString());
			
			prependQueue(q1,q2);
			
			System.out.println("Imprimindo a fila 1 depois da chamada do método : ");
			System.out.println(q1.toString());
			System.out.println("Imprimindo a fila 2 depois da chamada do método : ");
			System.out.println(q2.toString());
/*
			System.out.println("***********");
						
			q3.enqueue('A');
			q3.enqueue('B');
			q3.enqueue('C');
			q3.enqueue('D');
			q3.enqueue('A');
			q3.enqueue('D');
			
			System.out.println("Imprimindo a fila 3: ");
			System.out.println(q3.toString());
			
			exterminateFromQueue(q3, 'D');
			
			System.out.println("Imprimindo a fila 3 após a chamada do método: ");
			System.out.println(q3.toString());

			System.out.println("***********");
			
			q2.enqueue(6);
			q2.enqueue(7);
			q2.enqueue(8);
			q2.enqueue(9);
			
			System.out.println("Imprimindo a fila 2: ");
			System.out.println(q2.toString());
			
			q2.flip();
			System.out.println("Imprimindo a fila 2 após a chamada do método: ");
			System.out.println(q2.toString());
			
			
			q3.flip();
			System.out.println("Imprimindo a fila 3 após a chamada do método: ");
			System.out.println(q3.toString());

			System.out.println("***********");
			System.out.println(q2.contains(8));
			
			System.out.println("Imprimindo a fila 2 depois do método: ");
			System.out.println(q2.toString());

			
	    }catch (OverflowException e) {
	    	System.out.println(e);
	    }catch (UnderflowException e) {
	    	System.out.println(e);
	    }
	    
	    */
	   
	}
	

	public static void prependQueue(Queue<Integer> q1, Queue<Integer> q2) {
		StaticQueue<Integer> qaux = new StaticQueue<Integer>(q1.numElements());
		
		//salvando q1 em auxiliar
		while (!q1.isEmpty()) {
			qaux.enqueue(q1.dequeue());
		}

		//inserindo a q2 em q1
		while (!q2.isEmpty()) {
			q1.enqueue(q2.dequeue());
		}
		
		//inserindo a qaux em q1
		while (!qaux.isEmpty()) {
			q1.enqueue(qaux.dequeue());
		}
		
	}
	
	public static void exterminateFromQueue(Queue<Character> q, char element) {
		StaticQueue<Character> qaux = new StaticQueue<Character>(q.numElements());
		char valor;
		while (!q.isEmpty()) {
			valor = q.dequeue();
			if (valor != element)
				qaux.enqueue(valor);
		}
		
		while (!qaux.isEmpty()) {
			q.enqueue(qaux.dequeue());
		}
	}

}
