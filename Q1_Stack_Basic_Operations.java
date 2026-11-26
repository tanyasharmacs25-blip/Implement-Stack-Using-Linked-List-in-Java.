class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node top;
    int count;

    Stack() {
        top = null;
        count = 0;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;
        System.out.println(data + " inserted");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int removed = top.data;
        top = top.next;
        count--;
        System.out.println(removed + " removed");
        return removed;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    int size() {
        return count;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Q1_Stack_Basic_Operations {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.print("Stack: ");
        stack.display();

        System.out.println("Peek: " + stack.peek());
        stack.pop();

        System.out.print("After pop: ");
        stack.display();

        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());

        stack.pop();
        stack.pop();
        System.out.println("Is empty: " + stack.isEmpty());

        stack.pop(); // Underflow test
    }
}
