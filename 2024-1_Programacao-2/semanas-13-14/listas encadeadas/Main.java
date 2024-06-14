public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        // Test isEmpty
        printTestName("isEmpty - true");
        System.out.println(list.isEmpty());
        list.add(1);
        printTestName("isEmpty - false");
        System.out.println(list.isEmpty());

        // Test insertFirst
        printTestName("insertFirst - 0");
        list.insertFirst(0);
        System.out.println(list.toString());

        // Additional tests
        // Test insertLast
        printTestName("insertLast - 2");
        list.insertLast(2);
        System.out.println(list.toString());

        // Test removeFirst
        printTestName("removeFirst - 0");
        try {
            System.out.println("Removed first: " + list.removeFirst());
        } catch (UnderflowException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(list.toString());

        // Test removeLast
        printTestName("removeLast - 2");
        try {
            System.out.println("Removed last: " + list.removeLast());
        } catch (UnderflowException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(list.toString());

        // Test add
        printTestName("add - 3");
        list.add(3);
        System.out.println(list.toString());

        // Test insert at position
        printTestName("insert at position - 4 at 1");
        list.insert(4, 1);
        System.out.println(list.toString());

        // Test remove at position
        printTestName("remove at position - 1");
        try {
            System.out.println("Removed at position 1: " + list.remove(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(list.toString());

        // Test get
        printTestName("get at position -  0");
        try {
            System.out.println("Element at position 0: " + list.get(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // Test search
        printTestName("search");
        System.out.println("Search for 3: " + list.search(3));
        System.out.println("Search for 5: " + list.search(5));
    }

    private static void printTestName(String testName) {
        System.out.println("\n--- " + testName + " ---");
    }
}
