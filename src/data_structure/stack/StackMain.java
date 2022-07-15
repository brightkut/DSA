package data_structure.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // add to stack O(1)
        stack.push("A");
        stack.push("B");
        stack.push("C");

        //traverse
        stack.traverse();

        // remove from stack O(1)
        stack.pop();

        //traverse
        stack.traverse();
    }
}
