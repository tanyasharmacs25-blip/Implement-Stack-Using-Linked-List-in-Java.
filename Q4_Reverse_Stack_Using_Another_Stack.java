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

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node temp = top;
        if (temp == null) {
            System.out.println("Stack is empty");
            return;
        }
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

public class Q4_Reverse_Stack_Using_Another_Stack {
    static Stack reverseStack(Stack original) {
        Stack reversed = new Stack();

        while (!original.isEmpty()) {
            reversed.push(original.pop());
        }

        return reversed;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.print("Original stack (top to bottom): ");
        stack.display();

        Stack reversed = reverseStack(stack);
        System.out.print("Reversed stack (top to bottom): ");
        reversed.display();
    }
}
