public class ArrayImplementation<T> {

    private int capacity;
    private T[] arr;
    private int top = 0;

    // Constructor with a class type to safely create a generic array

    ArrayImplementation(int capacity){
        arr=(T[])new Object[capacity];
        this.capacity=capacity;
      }

    public void push(T data) throws Exception {
        if (top == capacity) {
            throw new Exception("Array is full");
        }
        arr[top] = data;
        top++;
    }

    public T pop() throws Exception {
        if (top == 0) {
            throw new Exception("Element not present");
        }
        T element = arr[top - 1];
        top--;
        return element;
    }

    public T peek() throws Exception {
        if (top == 0) {
            throw new Exception("Stack is empty");
        }
        return arr[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == capacity;
    }
}
