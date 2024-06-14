public class Node<E> {
   private E data;
   private Node nextNode;
   private Node previousNode;

   public Node(E element) {
      this(element, null);
   }

   public Node(E element, Node node) {
      data = element;
      nextNode = node;
   }

   public E getElement() {
      return data;
   }

   public void setData(E element) {
      data = element;
   }

   public Node getNext() {
      return nextNode;
   }

   public void setNext(Node n) {
      nextNode = n;
   }

   public Node getPrevious() {
      return previousNode;
   }

   public void setPrevious(Node n) {
      previousNode = n;
   }
}
