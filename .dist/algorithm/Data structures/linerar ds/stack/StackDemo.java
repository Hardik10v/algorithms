public class StackDemo {
    
    public static void main(String[] args) {
        try {
            System.out.println("Stack...Array Impl");
            ArrayImplementation<String> stack = new ArrayImplementation<>(3);
            stack.push("1");
            stack.push("2");
            stack.push("3");

            System.out.println("Popped from Array Stack: " + stack.pop());
            System.out.println("Peek from Array Stack: " + stack.peek());

            System.out.println("Stack...LinkedList Impl");

            LinkedListImpl<String> ll = new LinkedListImpl<>();
            ll.push("5");
            ll.push("6");
            ll.push("7");

            System.out.println("Popped from Linked List Stack: " + ll.pop());
            System.out.println("Popped from Linked List Stack: " + ll.pop());
            System.out.println("Popped from Linked List Stack: " + ll.pop());
            
            // Handling potential exception gracefully
            try {
                System.out.println("Attempting to pop from empty Linked List Stack...");
                System.out.println("Popped from Linked List Stack: " + ll.pop());
            } catch (Exception e) {
                System.out.println("Caught exception: " + e.getMessage());
            }

            // Uncomment if you want to test peek after emptying the stack
            // System.out.println("Peek from empty Linked List Stack: " + ll.peek());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
