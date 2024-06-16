public class LinkedStack<E> implements Stack<E> {
    private Node<E> top;
    private int numElements;

	public boolean isEmpty(){
        return top == null;
    }
	
	public boolean isFull(){
        return false;
    }
	
	public int numElements(){
        return numElements;
    }

    public LinkedStack() {
        top = null;
        numElements = 0;
    }


	public void push(E element) {
        Node<E> newNode = new Node<E>(element);
        
        newNode.setNext(top);
        top = newNode;
        numElements++;
    }
	
	public E pop() throws UnderflowException{
        if(isEmpty()) {
            throw new UnderflowException();
        }

        E el = top.getElement();
        top = top.getNext();
        numElements--;

        return el;
    }
	
	public E top() throws UnderflowException{
        if(isEmpty()){
            throw new UnderflowException();
        }

        return top.getElement();
    }
}
