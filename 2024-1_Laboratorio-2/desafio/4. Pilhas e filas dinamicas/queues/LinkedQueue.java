public class LinkedQueue<E> implements Queue<E>{
    private Node<E> front;
    private Node<E> back;
    private int numElements;

	public boolean isEmpty(){
        return front == null;
    }
	
	public boolean isFull(){
        return false;
    }
	
	public int numElements(){
        return numElements;
    }

    public LinkedQueue(){
        front = back = null;
        numElements = 0;
    }

	public void enqueue(E element) throws OverflowException{
        Node<E> newNode = new Node<E>(element);

        if (isEmpty()) {
            front = newNode;
            back = newNode;
        } else {
            back.setNext(newNode);
            back = newNode;
        }
        numElements++;
    }

	public E dequeue() throws UnderflowException{
        if(isEmpty()){
            throw new UnderflowException();
        }

        E element = front.getElement();
        front = front.getNext();
        if (front == null) {
            back = null;
        }
        numElements--;
        return element;
    }
	
	public E front() throws UnderflowException{
        if(isEmpty()){
            throw new UnderflowException();
        }

        return front.getElement();
    }
	
	public E back() throws UnderflowException{
        if(isEmpty()){
            throw new UnderflowException();
        }

        return back.getElement();
    }
}
