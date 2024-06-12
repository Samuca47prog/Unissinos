/**
 * Implementação de uma lista linear com armazenamento estático,
 * baseado em array.
 */
public class StaticList<E> implements List<E> {
	private E[] elements;
	private int numElements;
	
	/**
	 * Constrói uma lista com um tamanho máximo.
	 * @param maxSize O tamanho máximo da lista
	 */
	public StaticList(int maxSize) {
		elements = (E[])new Object[maxSize];
		numElements = 0;
	}

	public int numElements() {
		return numElements;
	}

	public boolean isEmpty() {
		return numElements == 0;
	}

	public boolean isFull() {
		return numElements == elements.length;
	}

	public void insert(E element, int pos) throws OverflowException, IndexOutOfBoundsException{
		// verifica se há espaço na lista
		if (isFull())
			throw new OverflowException();

		// verifica se a posição é válida
		if (pos < 0  ||  pos > numElements)
			throw new IndexOutOfBoundsException();
		
		// desloca para a direita os elementos necessários,
		// abrindo espaço para o novo
		for (int i = numElements-1; i >= pos; i--)
			elements[i+1] = elements[i];
		
		// armazena o novo elemento e ajusta o total
		elements[pos] = element;
		numElements++;
	}

	public void add(E element) throws OverflowException, IndexOutOfBoundsException{
		// verifica se há espaço na lista
		if (isFull())
			throw new OverflowException();
		
		// armazena o novo elemento e ajusta o total
		elements[numElements()] = element;
		numElements++;
	}

	public E remove(int pos) throws UnderflowException, IndexOutOfBoundsException{
		if(isEmpty())
			throw new UnderflowException();
		
		// verifica se a posição é válida
		if (pos < 0  ||  pos >= numElements)
			throw new IndexOutOfBoundsException();
		
		// guarda uma refer�ncia temporária ao elemento removido
		E element = elements[pos];
		
		// desloca para a esquerda os elementos necessários,
		// sobrescrevendo a posição do que está sendo removido
		for (int i = pos; i < numElements-1; i++)
			elements[i] = elements[i+1];
		
		// define para null a posição antes ocupada pelo último,
		// para que a coleta de lixo possa atuar, e ajusta o total
		elements[numElements-1] = null;
		numElements--;

		return element;
	}


	// Exercício 4
	public boolean remove(E element) throws UnderflowException{
		if(isEmpty()) throw new UnderflowException();

		int position = this.search(element);
		if(position != -1){
			remove(position);
			return true;
		}

		return false;
	}


	// Exercício 5
	public void insertAfter(E obj1, E obj2) throws OverflowException{
		if(this.isFull()) throw new OverflowException();

		int posObj1 = this.search(obj1);
		if(posObj1 != -1){
			insert(obj2, posObj1+1);
		}

	}


	// Exercício 6
	public void swap(int pos1, int pos2) throws IndexOutOfBoundsException{
		if(pos1 < 0 || pos1 >= numElements() || pos2 < 0 || pos2 >= numElements())
			throw new IndexOutOfBoundsException();

		E aux = elements[pos1];
		elements[pos1] = elements[pos2];
		elements[pos2] = aux;
	}


	// Exercício 7
	public void flip(){
		for(int i=0; i<numElements; i++)
			insert(remove(numElements-1), i);
	}


	// Exercício 8
	public void insert(StaticList<E> newElements, int pos) throws OverflowException, IndexOutOfBoundsException{
		if (isFull())
			throw new OverflowException();
		if (pos < 0  ||  pos > numElements)
			throw new IndexOutOfBoundsException();
		
		for (int i = numElements-1; i >= pos; i--)
			elements[i+newElements.numElements()] = elements[i];
		
		int j=0;
		for (int i=pos; i<pos+newElements.numElements(); i++){
			elements[i] = newElements.get(j);;
			numElements++;
			j++;
		}
		
	}


	// Exercício 9
	public void dedup(){
		for(int i=0; i<numElements-1; i++)
			for(int j=i+1; j<numElements; j++)
				if(elements[i].equals(elements[j]))
					remove(j--);
	}




	// Exercício 10
	public boolean equals(StaticList<E> compareToList){
		int i;
		for(i=0; i<numElements(); i++){
			if(i<numElements || i<compareToList.numElements())
				return false;

			if(compareToList.get(i) != elements[i])
				return false;
		}

		

		return true;
	}




	// Exercício 12
	public int remove(int ini, int fim) throws UnderflowException, IndexOutOfBoundsException{
		if (isEmpty())
			throw new UnderflowException();
		if (ini < 0  ||  fim > numElements)
			throw new IndexOutOfBoundsException();

		int countRemoved=0;

		for(int i=ini; i<fim; i++){
			remove(i);
			countRemoved++;
		}

		return countRemoved;
	}



	public E get(int pos) throws IndexOutOfBoundsException{
		// verifica se a posição é válida
		if (pos < 0  ||  pos >= numElements)
			throw new IndexOutOfBoundsException();

		return elements[pos];
	}

	public int search(E element) {
		for (int i = 0; i < numElements; i++)
			if (element.equals(elements[i]))
				return i;
		
		// se chegar até aqui, é porque não encontrou
		return -1;
	}
	
	/**
	 * Retorna uma representação String da lista.
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < numElements; i++)
			s += elements[i] + " ";
		return s;
	}


	public int contaElementos(E el) throws IllegalArgumentException{
		if(el == null){
			throw new IllegalArgumentException();
		}
		return contaElementos(el, 0, 0);
	}

	private int contaElementos(E el, int i, int count){
		if(i>numElements()){
			return count;
		}
		if (elements[i] == el) {
			count++;
		}
		return contaElementos(el, i+1, count);
	}
}