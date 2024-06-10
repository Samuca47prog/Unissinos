public class ExerciciosFilas {

    public static void foobar(Queue<Integer> f) {
        try {
            f.enqueue(1);
            f.enqueue(3);
            f.enqueue(5);
            f.enqueue(7);
            f.enqueue(9);
        } catch(OverflowException e) {
            System.out.println(e);
        }
        try {
            f.dequeue();
            f.dequeue();
        } catch(UnderflowException e) {
            System.out.println(e);
        }
        try {
            f.enqueue(2);
            f.enqueue(4);
        } catch(OverflowException e) {
            System.out.println(e);
        }
        try {
            f.dequeue();
        } catch(UnderflowException e) {
            System.out.println(e);
        }
        try {
            f.enqueue(3);
        } catch(OverflowException e) {
            System.out.println(e);
        }
        System.out.println(f);
    }

    public void prependQueue(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> aux = new StaticQueue<>(q1.numElements());

        while(!q1.isEmpty())
            aux.enqueue(q1.dequeue());

        while(!q2.isEmpty())
            q1.enqueue(q2.dequeue());

        while(!aux.isEmpty())
            q1.enqueue(aux.dequeue());
    }

    public static void exterminateFromQueue(Queue<Character> q, char element){
        int nElements = q.numElements();
        for(int i = 0; i < nElements; i++){
            char temp = q.dequeue();
            if(temp != element)
                q.enqueue(temp);
        }
    }
}

