class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        next = null;
    }
}

class CharStack {
    Node top;

    void push(char ch) {
        Node newNode = new Node(ch);
        newNode.next = top;
        top = newNode;
    }

    char pop() {
        if (top == null) {
            return '\0';
        }
        char ch = top.data;
        top = top.next;
        return ch;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class Q2_Reverse_String_Using_Stack {
    static String reverseString(String str) {
        CharStack stack = new CharStack();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "JAVA";
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reverseString(input));
    }
}
