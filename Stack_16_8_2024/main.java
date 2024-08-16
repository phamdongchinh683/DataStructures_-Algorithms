package Stack_16_8_2024;

import Stack_16_8_2024.StackMethod.Stack;

public class main {
    public static void main(String[] args) {
        StackMethod.Stack s = new StackMethod().new Stack(); // Create a new instance of Stack
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is: " + s.peek());
        System.out.print("Elements present in stack:");
        s.print();
    }
}
