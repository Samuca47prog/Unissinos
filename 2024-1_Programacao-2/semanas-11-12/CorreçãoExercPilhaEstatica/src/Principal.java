	
public class Principal {

	public static void main(String[] args) {
		
		//pilha
		 StaticStack<Integer> p1 = new StaticStack<>(5);
		 StaticStack<Integer> p2 = new StaticStack<>(5);
		 StaticStack<Integer> p3 = new StaticStack<>(5);
		 try {
		 p1.push(10);
		 p1.push(20);
		 p1.push(30);
		 p1.push(40);
		 
		 //System.out.println(p1);
		 
		 p2.push(p1.pop());
		 p2.push(p1.pop());
		 p3.push(p1.pop());
		 p3.push(p1.pop());
		 p1.push(p2.pop());
		 p3.push(p2.pop());
		 p3.push(p1.pop());
		 
		 
		 System.out.println(p1);
		 System.out.println(p2);
		 System.out.println(p3);
		 
		 
		 
		 } catch (Exception e) {
		 System.out.println(e);
		 } 
		
		 
		/*
		StaticStack<Integer> p1 = new StaticStack<Integer>(20);
		StaticStack<Integer> p2 = new StaticStack<Integer>(10);
		StaticStack<Integer> p3 = new StaticStack<Integer>(10);
	
		//exercício 1
		try {
			p1.push(1);
			p1.push(2);
			p1.push(3);
			p1.push(4);
			
			int temp = p1.pop();   
			p2.push(temp);   
			p3.push(p1.pop());   
			p2.push(p1.pop());   
			temp = p1.pop();  
			p3.push(temp);  
			p1.push(p2.pop()); 
			p3.push(p2.pop());   
			p3.push(p1.pop()); 
			
			
		}catch(OverflowException e) {
			System.out.println(e);
		}
		
		System.out.println("Exercício 1");
		System.out.println("***********");
		
		System.out.println("Imprimindo pilha 1: ");
		System.out.println(p1.toString());
		
		System.out.println("Imprimindo pilha 2: ");
		System.out.println(p2.toString());
		
		System.out.println("Imprimindo pilha 3: ");
		System.out.println(p3.toString());
		
		/*
		//exercício 3
		
		p1.push(1);
		p1.push(2);
		p1.push(3);
		p1.push(4);
		
		System.out.println("***********");
		System.out.println("Exercício 3");
		System.out.println("***********");
		
		System.out.println("Imprimindo pilha 1: ");
		System.out.println(p1.toString());
		
		Integer [] v = itemsExcept(4, p1);
		
		for (int i=0; i < v.length; i++) {
			System.out.println("Imprimindo array: " + v[i]);
		}
		
		System.out.println("Imprimindo pilha 1 após chamada do método: ");
		System.out.println(p1.toString());

		
		//exercício 5
		
		System.out.println("***********");
		System.out.println("Exercício 5");
		System.out.println("***********");
		
		System.out.println("Imprimindo pilha p1: ");
		System.out.println(p1.toString());
		System.out.println("Imprimindo pilha p3: ");
		System.out.println(p3.toString());
		
		prependStack(p1,p3);
		
		System.out.println("Imprimindo pilha 1 final após chamada do método: ");
		System.out.println(p1.toString());
		System.out.println("Imprimindo pilha p3 após chamada método: ");
		System.out.println(p3.toString());
		
		
		//exercício 11
		
		System.out.println("***********");
		System.out.println("Exercício 11");
		System.out.println("***********");
		
		p2.push(1);
		p2.push(2);
		p2.push(3);
		p2.push(4);
		
		System.out.println("Imprimindo pilha p2: ");
		System.out.println(p2.toString());
		
		p2.flip();
		System.out.println("Imprimindo pilha p2 após chamada do método: ");
		System.out.println(p2.toString());
		
		
		p2.InverteElementos(p2);
		System.out.println("Imprimindo pilha p2 após chamada do método: ");
		System.out.println(p2.toString());
		
		*/
	   
	}
	
	//exercício 3
	public static Integer [] itemsExcept (int number,  Stack<Integer> p) {
		Integer[] v = new  Integer[p.numElements()];
		Stack<Integer> paux = new StaticStack<Integer>(10);
		int valor = 0;
		int cont = 0;
		while (!p.isEmpty()) {
			valor = (int) p.pop();
			if (valor != number) {
				v[cont++] = valor;
			}
			paux.push(valor);
		}
		while (!paux.isEmpty())
			p.push(paux.pop());
		return v;
	}
	
	//exercício 5
	public static void prependStack(Stack<Integer> p1, Stack<Integer> p2) {
		StaticStack<Integer> p3 = new StaticStack<Integer>(10);
		StaticStack<Integer> p4 = new StaticStack<Integer>(10);
		
		//salvando os elementos em pilha auxiliar 
		while (!p1.isEmpty()) {
			p3.push(p1.pop());
		}
		while (!p2.isEmpty()) {
			p4.push(p2.pop());
		}
		while (!p4.isEmpty()) {
			p1.push(p4.pop());
		}
		while (!p3.isEmpty()) {
			p1.push(p3.pop());
		}	
	}

}
