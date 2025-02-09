package data_structures;

import data_structures.stack.ArrayStack;
import data_structures.stack.Stack;

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
