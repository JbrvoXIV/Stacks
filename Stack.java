import java.util.NoSuchElementException;

public class Stack<T> {
    class Node {
        public T data;
        public Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    private Node top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(T data) {
        Node newTop = new Node(data);
        newTop.next = top;
        top = newTop;
        size++;
    }

    public T pop() {
        if(top == null) {
            throw new NoSuchElementException("Stack is empty");
        }
        T oldTop = top.data;
        top = top.next;
        size--;
        return oldTop;
    }

    public T peek() {
        if(top == null) {
            throw new NoSuchElementException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getLength() {
        return size;
    }

    public void printStack() {
        if(top == null) {
            throw new NoSuchElementException("Stack is empty");
        }
        Node curNode = top;
        System.out.printf("Top -> [%s] -> ", curNode.data);
        while(curNode.next.next != null) {
            curNode = curNode.next;
            System.out.printf("[%s] -> ", curNode.data);
        }
        curNode = curNode.next;
        System.out.printf("[%s] <- Tail\n", curNode.data);
    }

    @Override
    public String toString() {
        return "This stack contains " + size + " elements.\n";
    }

    // public int getLength() {
    //     if(top == null) {
    //         return 0;
    //     }
    //     Node curNode = top;
    //     int counter = 1;
    //     while(curNode != null) {
    //         curNode = curNode.next;
    //         counter++;
    //     }
    //     return counter;
    // }
}
