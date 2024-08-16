package Stack_16_8_2024;

public class StackMethod {
    // Inner class Stack
    public class Stack {
        static final int MAX = 1000;
        public int top;
        public int a[] = new int[MAX];

        public Stack() {
            top = -1;
        }

        public boolean isEmpty() {
            return (top < 0);
        }

        public boolean push(int x) {
            if (top >= (MAX - 1)) {
                System.out.println("Stack Overflow");
                return false;
            } else {
                a[++top] = x;
                System.out.println(x + " pushed into stack");
                return true;
            }
        }

        public int pop() {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            } else {
                int x = a[top--];
                return x;
            }
        }

        public int peek() {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            } else {
                int x = a[top];
                return x;
            }
        }

        public void print() {
            for (int i = top; i > -1; i--) {
                System.out.print(" " + a[i]);
            }
            System.out.println();
        }
    }
}
