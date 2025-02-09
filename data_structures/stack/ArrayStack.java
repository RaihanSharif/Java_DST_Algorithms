package data_structures.stack;

// implements the Stack interface using an array to store the data
// simple, and easy to implement, but size is fixed
public class ArrayStack<E> implements Stack<E> {
    private E[] elements;
    private int topOfStack = -1;  // tracks the top of the stack;
    

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        elements = (E[]) new Object[capacity]; // is there a better way?
    }

    // default constructor inits ArrayList of size 5 if one is not provided
    public ArrayStack() {
        this(5);
    }
    
    public void push(E elem) throws IllegalStateException {
        if (size() == elements.length) {
            throw new IllegalStateException("Stack is full");
        }
        elements[++topOfStack] = elem; // increment top of stackm abd then put new data in
    }
    
    public E top() {
        if (isEmpty()) return null;
        return elements[topOfStack];
    }
    public E pop() {
        if (isEmpty()) return null;
        E temp = elements[topOfStack];
        elements[topOfStack] = null;  // deference to help garbage collection
        topOfStack--;
        return temp;
    }

    public int size() { return topOfStack+1; }

    public boolean isEmpty() { return topOfStack == -1; }
}


/* 
 * Stack is super efficient if all you need is a first in first out data structure
 * size O(1)
 * isEmpty O(1)
 * top O(1)
 * push O(1)
 * pop O(1)
 * 
 * Spance usage is O(n), where n is the size of the array, does not use auxiliary space
 * not dependent on the  number of elements in the stack
 */