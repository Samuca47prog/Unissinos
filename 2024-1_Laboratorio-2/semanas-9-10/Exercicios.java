public class Exercicios<E> implements List<E> {
    private E[] elements;
	private int numElements;
	

	public Exercicios(int maxSize) {
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
	public boolean removee(E element) throws UnderflowException{
		if(isEmpty()) throw new UnderflowException();

		int position = this.search(element);
		if(position != -1){
			remove(position);
			return true;
		}

		return false;
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
}
