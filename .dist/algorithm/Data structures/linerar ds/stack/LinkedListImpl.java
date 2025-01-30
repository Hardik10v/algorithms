public class LinkedListImpl<T> {
    
    private Node<T> head;

    // Constructor initializes head to null (empty list)
    public LinkedListImpl() {
        head = null;
    }

    // Pushes a new node to the front of the list
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    // Pops the node from the front of the list and returns its data
    public T pop() throws Exception {
        if (head == null) {
            throw new Exception("List is empty");
        }
        Node<T> temp = head;
        head = head.next;
        return temp.data;
    }

    // Returns the data at the front of the list without removing it
    public T peek() throws Exception {
        if (head == null) {
            throw new Exception("List is empty");
        }
        return head.data;
    }

    // Node class for linked list
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
        
        Node() {
            this.data = null;
            this.next = null;
        }
    }
}
