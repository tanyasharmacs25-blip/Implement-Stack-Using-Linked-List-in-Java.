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

public class Q5_Find_Middle_Element_Of_Stack {
    static int findMiddle(Stack stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        Node slow = stack.top;
        Node fast = stack.top;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.print("Stack (top to bottom): ");
        stack.display();
        System.out.println("Middle element: " + findMiddle(stack));
    }
}
