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

    Node top;

    public Stack() {
        top = null;
    }

    public void push(T data) {
        Node newTop = new Node(data);
        newTop.next = top;
        top = newTop;
    }

    public T pop() {
        if(top == null) {
            throw new NoSuchElementException("Stack is empty");
        }
        T oldTop = top.data;
        top.next = top;
        return oldTop;
    }

    public T peek() {
        if(top == null) {
            throw new NoSuchElementException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getLength() {
        if(top == null) {
            return 0;
        }
        Node curNode = top;
        int counter = 1;
        while(curNode != null) {
            curNode = curNode.next;
            counter++;
        }
        return counter;
    }
}
