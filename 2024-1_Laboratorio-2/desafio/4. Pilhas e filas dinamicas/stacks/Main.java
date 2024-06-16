public class Main{
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();
        
        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek at the top element
        System.out.println("Top element: " + stack.top()); // Output: 3

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 2

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        // Get the size of the stack
        System.out.println("Stack size: " + stack.numElements()); // Output: 1
    }
}