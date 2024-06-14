public class DNode<E> {
   private E data;
   private DNode nextNode;
   private DNode previousNode;

   public DNode(E element) {
      this(element, null);
   }

   public DNode(E element, DNode node) {
      data = element;
      nextNode = node;
   }

   public E getElement() {
      return data;
   }

   public void setData(E element) {
      data = element;
   }

   public DNode getNext() {
      return nextNode;
   }

   public void setNext(DNode n) {
      nextNode = n;
   }

   public DNode getPrevious() {
      return previousNode;
   }

   public void setPrevious(DNode n) {
      previousNode = n;
   }
}
