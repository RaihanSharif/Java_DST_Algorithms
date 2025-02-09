package data_structures.stack;


/*
the stack abstract data type
can be implemented using an array, linked list or other Java built-in
data structures; Array is the most efficient

uses of stack, can use it reverse an array, parenthesis matching
call stack in programming languages
*/ 

public interface Stack<E> {
    public void push(E element);
    public E pop();
    public E top();
    public int size();
    public boolean isEmpty();
}
