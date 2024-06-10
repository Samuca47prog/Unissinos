public class StaticQueue<E> implements Queue<E> {

    private int first;

    private int last;

    private E elements[];

    public StaticQueue(int maxSize) {
        elements = (E[])new Object[maxSize];
        first = last = -1;
    }

    public boolean isEmpty() {
        return first == -1;
    }

    public boolean isFull() {
        return first == ((last + 1) % elements.length);
    }

    public int numElements() {
        if (isEmpty())
            return 0;
        else {
            int n = elements.length; // p/ legibilidade da expressão abaixo
            return ((n + last - first) % n) + 1;
        }
    }

    public void enqueue(E element) throws OverflowException {
        if (isFull())
            throw new OverflowException();
        else {
            if (last == -1)
                first = last = 0;
            else
                last = (last + 1) % elements.length;
            elements[last] = element;
        }

    }

    public E dequeue() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException();
        E element = elements[first];
        elements[first] = null; // p/ coleta de lixo
        if (first == last)
            first = last = -1;
        else
            first = (first + 1) % elements.length;

        return element;
    }

    public E front() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException();
        return elements[first];
    }

    public E back() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException();
        return elements[last];
    }

    public String toString() {
        if (isEmpty())
            return "[Empty]";
        else {
            String s = "[" + elements[first];
            int n = numElements();
            for (int i = 1; i < n; i++) {
                int k = (first + i) % elements.length;
                s += ", " + elements[k];
            }
            s += "]";
            return s;
        }
    }

    public boolean contains(E element) throws UnderflowException {
        if(isEmpty())
            throw new UnderflowException();

        for(int i = 0; i < numElements(); i++)
            if(elements[i] == element)
                return true;

        return false;
    }

    public void flip() {
        Stack<E> aux = new StaticStack<E>(this.numElements());

        while(!this.isEmpty())
            aux.push(this.dequeue());

        while(!aux.isEmpty())
            this.enqueue(aux.pop());	
    }

    public void enqueue(StaticQueue<E> nq) throws OverflowException {
        if(this.isFull() || (nq.numElements() > this.elements.length - this.numElements()))
            throw new OverflowException();

        for(int i = 0; i < nq.numElements(); i++) {
            if(last == -1)
                first = last = 0;
            else
                last = (last + 1) % elements.length;
            elements[last] = nq.elements[i];
        }
    }

    public void enqueueWithPriority(E element) throws OverflowException {
        if(isFull())
            throw new OverflowException();

        first = (first + elements.length - 1) % elements.length;
        elements[first] = element;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof StaticQueue))
            return false;

        @SuppressWarnings("unchecked")
        StaticQueue<E> other = (StaticQueue<E>) obj;

        if(numElements() != other.numElements())
            return false;

        for(int i = 0; i < numElements(); i++)
            if(!elements[i].equals(other.elements[i]))
                return false;

        return true;
    }

    public boolean find(E element) {
        for(int i = 0; i < this.numElements(); i++) {
            if(this.elements[i].equals(element))
                return true;
        }
        return false;
    }

    public Queue<E> clone() {
        StaticQueue<E> aux = new StaticQueue<E>(this.numElements());

        for(int i = 0; i < this.numElements(); i++)
            aux.enqueue(this.elements[i]);

        return aux;
    }

    public Queue<E> split(E element) {
        StaticQueue<E> nq = new StaticQueue<E>(this.numElements());

        int i = first,
        posicao = -1,
        nlast   = -1;
        while(i != last) {
            if(elements[i].equals(element)) {
                posicao = (i + 1) % elements.length;
                nlast = last;
                last = i;
                break;
            }
            i = (i + 1) % elements.length;
        }
        if(posicao == -1) {
            if(elements[last].equals(element))
                posicao = last;
        }
        else {
            int j = posicao;
            while(j != nlast) {
                nq.enqueue(elements[j]);
                elements[j] = null;
                j = (j + 1) % elements.length;
            }
            nq.enqueue(elements[nlast]);
            elements[nlast] = null;
        }

        return nq;
    }

    public void moveToBackAllOccurrencesOf(E element) {
        int i = first,
        l = last;
        while(i != l) {
            if(elements[i] == element) {
                int j = i;
                while(j != l) {
                    elements[j] = elements[(j + 1) % elements.length];
                    j = (j + 1) % elements.length;
                }
                elements[last] = element;

                if(l == 0)
                    l = elements.length - 1;
                else if((l - 1) == 0)
                    l = 0;
                else
                    l = (l - 1) % elements.length;
            }
            else
                i = (i + 1) % elements.length;
        }
        if(elements[l] == element) {
            int j = l;
            while(j != last) {
                elements[j] = elements[(j + 1) % elements.length];
                j = (j + 1) % elements.length;
            }
            elements[last] = element;
        }
    }

    public void ensureCapacity(int capacity) {
        System.out.println("Capacidade antiga: " + this.elements.length);

        if(capacity > elements.length) {
            int i = 0;
            E[] novo = (E[])new Object[capacity];

            while(!this.isEmpty())
                novo[i++] = this.dequeue();

            first = 0;
            last = i - 1;
            this.elements = novo;
        }

        System.out.println("Capacidade nova: "+ this.elements.length);
    }

}