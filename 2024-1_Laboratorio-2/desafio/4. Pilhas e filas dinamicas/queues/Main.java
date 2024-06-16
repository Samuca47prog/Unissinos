public class Main {
    public static void main(String[] args) {
        try {
            // Criação de uma fila de inteiros
            LinkedQueue<Integer> queue = new LinkedQueue<>();

            // Teste de inserção (enqueue)
            System.out.println("Enfileirando elementos: 1, 2, 3, 4, 5");
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);

            // Teste de verificação do primeiro e último elementos
            System.out.println("Primeiro elemento: " + queue.front()); // Deve ser 1
            System.out.println("Último elemento: " + queue.back());   // Deve ser 5

            // Teste de remoção (dequeue)
            System.out.println("Desenfileirando elementos:");
            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue());
            }

            // Tentativa de desenfileirar de uma fila vazia (deve lançar exceção)
            System.out.println("Tentativa de desenfileirar de uma fila vazia:");
            queue.dequeue();

        } catch (UnderflowException e) {
            System.out.println("Exceção de Underflow: " + e.getMessage());
        } catch (OverflowException e) {
            System.out.println("Exceção de Overflow: " + e.getMessage());
        }
    }
}
