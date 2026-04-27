public class ReverseStackRecursion {

    // Function to insert element at bottom of stack
    static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();     
        
        insertAtBottom(stack, x);

        stack.push(temp);
    }

    // Function to reverse stack using recursion
    static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        reverse(stack);

        insertAtBottom(stack, temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverse(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}