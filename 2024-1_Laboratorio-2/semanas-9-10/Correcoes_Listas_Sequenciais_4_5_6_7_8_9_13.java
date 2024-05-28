	public boolean remove(E element) throws UnderflowException{
		if(this.isEmpty()) throw new UnderflowException();
		int pos = this.search(element);
		if(pos != -1){
			remove(pos);
			return true;
		}
		return false;
	}

	public void insertAfter(E obj1, E obj2) throws OverflowException{
		if(this.isFull()) throw new OverflowException();
		int pos = this.search(obj1);
		if(pos != -1)
			insert(obj2, pos+1);
	}

	public void swap(int pos1, int pos2) throws IndexOutOfBoundsException{
		if(pos1 < 0 || pos1 >= numElements || pos2 < 0 || pos2 >= numElements)
			throw new IndexOutOfBoundsException();
		E aux = elements[pos1];
		elements[pos1] = elements[pos2];
		elements[pos2] = aux;
	}

	public void flip(){
		for(int i=0; i<numElements; i++)
			insert(remove(numElements-1), i);
	}

	public void insert(List<E> novaLista, int pos) throws OverflowException, IndexOutOfBoundsException{
		if(pos < 0 || pos > numElements)
			throw new IndexOutOfBoundsException();
		for(int i=0; i < novaLista.numElements(); i++)
			insert(novaLista.get(i), pos++);
	}

	public void dedup(){
		for(int i=0; i<numElements-1; i++)
			for(int j=i+1; j<numElements; j++)
				if(elements[i].equals(elements[j]))
					remove(j--);
	}

	//****** EXEMPLO DE MAIN PARA TESTAR OS MÉTODOS ******//

	public static void main(String[] args) {
		StaticList<Integer> lista = new StaticList<>(100);
		for(int i=0; i<5; i++)
			lista.insert(i, i);
		
		System.out.println("Lista original:");
		System.out.println(lista);
		
		StaticList<Integer> lista2 = new StaticList<>(400);
		for(int i=20; i<24; i++)
			lista2.insert(i, lista2.numElements());
		
		for(int i=20; i<24; i++)
			lista2.insert(i, lista2.numElements());
		
		for(int i=20; i<24; i++)
			lista2.insert(i, lista2.numElements());
		
		System.out.println("Lista nova:");
		System.out.println(lista2);
		
		lista.insert(lista2, 3);
		
		System.out.println("Lista original com insert da lista nova:");
		System.out.println(lista);
		
		lista.flip();
		
		System.out.println("Lista invertida:");
		System.out.println(lista);
		
		lista.insert(3, 1);
		lista.insert(3, 1);
		lista.insert(3, 1);
		
		System.out.println("Lista com duplicados:");
		System.out.println(lista);
		
		lista.dedup();
		
		System.out.println("Lista sem duplicados:");
		System.out.println(lista);		
	}

