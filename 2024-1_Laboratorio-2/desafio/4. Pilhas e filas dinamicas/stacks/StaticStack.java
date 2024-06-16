public class StaticStack<E> implements Stack<E> {
	private int top;

	private E elements[];

	public StaticStack(int maxSize) {
		elements = (E[])new Object[maxSize];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == elements.length - 1;
	}

	public int numElements() {
		return top + 1;
	}
	
	public void push(E element) throws OverflowException {
		if (isFull())
			throw new OverflowException();
		elements[++top] = element;
	}

	public E pop() throws UnderflowException {
		if (isEmpty())
			throw new UnderflowException();
		E element = elements[top];
		elements[top--] = null; // p/ coleta de lixo
		return element;
	}

	public E top() throws UnderflowException {
		if (isEmpty())
			throw new UnderflowException();
		return elements[top];
	}

	public String toString() {
		if (isEmpty())
			return "[Empty]";
		else {
			String s = "[";
			for (int i = numElements() - 1; i >= 0; i--) {
				s += "\n" + elements[i];
			}
			s += "\n]";
			return s;
		}
	}

	public boolean contains(E element) throws UnderflowException {
        if(isEmpty())
            throw new UnderflowException();

        for(int i = 0; i < numElements(); i++)
            if(elements[i].equals(element))
                return true;
        return false;
    }

    public void flip() {
        Stack<E> aux1 = new StaticStack<E>(this.numElements());

        for(int i = 0; i < this.numElements(); i++)
            aux1.push(elements[i]);

        for(int i = 0; i < this.numElements(); i++)
            elements[i] = aux1.pop();
    }

    public void push(StaticStack<E> p){
        if (isFull() || (p.numElements() > elements.length - this.numElements()))
            throw new OverflowException();

        for(int i = 0; i < p.numElements(); i++)
            this.push(p.elements[i]);
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof StaticStack))
            return false;

        StaticStack<E> other = (StaticStack<E>) obj;

        if(this.numElements() != other.numElements())
            return false;

        for(int i = 0; i < this.numElements(); i++)
            if(!this.elements[i].equals(other.elements[i]))
                return false;

        return true;
    }

    public Stack<E> clone() {
        StaticStack<E> ns = new StaticStack<E>(this.numElements());

        for(int i = 0; i < this.numElements(); i++) {
            ns.push(this.elements[i]);
        }

        return ns;
    }
}