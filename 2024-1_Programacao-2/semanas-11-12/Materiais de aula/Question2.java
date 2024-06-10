public class Question2 {
    public static void main(String[] args) {
        StaticStack<Integer> stackInt = new StaticStack<Integer>(8);
        Queue<Integer> queueInt = new StaticQueue<Integer>(2);
        try {
            for(int i = 10, j = 0; i > 3; i--, j++) {
                queueInt.enqueue(j - i);
                stackInt.push(queueInt.dequeue());
                queueInt.enqueue(stackInt.pop() * -1);
            }
        } catch(UnderflowException e) {
            e.printStackTrace();
        } catch(OverflowException e) {
            e.printStackTrace();
        }

        System.out.println("Queue: " + queueInt.toString());
        System.out.println("Stack: " + stackInt.toString());

        StaticQueue<String> queueStr = new StaticQueue<String>(stackInt.numElements() + queueInt.numElements());
        while(!stackInt.isEmpty()) {
            while(!queueInt.isEmpty()) {
                queueStr.enqueue(stackInt.pop() + " - " + queueInt.dequeue());
            }
        }
        System.out.println(queueStr);
    }
}
