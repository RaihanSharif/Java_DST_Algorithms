package data_structures.stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new ArrayStack<>(10);
        myStack.push(5);
        myStack.push(3);
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
    }


}
