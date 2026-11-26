# Implement-Stack-Using-Linked-List-in-Java.
Implementation of Stack by using linked list in java language

## Description
This assignment implements a Stack using a manually created Singly Linked List in Java. The Stack follows the LIFO (Last In, First Out) principle.

## Basic Operations
- `push(int data)` — inserts an element at the top.
- `pop()` — removes and returns the top element; prints `Stack Underflow` if empty.
- `peek()` — returns the top element without removing it.
- `isEmpty()` — checks whether the stack is empty.
- `size()` — returns the number of elements.
- `display()` — displays elements from top to bottom.

## Additional Challenges
1. Reverse a string using the Stack.
2. Check whether a string is a palindrome.
3. Reverse stack elements using another Stack.
4. Find the middle element using slow and fast pointers.

## Classes
- `Node` — stores data and a reference to the next node.
- `Stack` — implements stack operations using linked nodes.
- `Main` — contains test cases for basic operations, challenges, and edge cases.

## How to Run
1. Ensure Java JDK is installed.
2. Open a terminal in this folder.
3. Compile:
   ```bash
   javac Main.java
   ```
4. Run:
   ```bash
   java Main
   ```

## Complexity
| Operation | Time Complexity |
|---|---|
| Push | O(1) |
| Pop | O(1) |
| Peek | O(1) |
| Is Empty | O(1) |
| Size | O(1) |
| Display | O(n) |
| Find Middle | O(n) |

## Author
Tanya Sharma
