package data_structures.queue;

import java.util.NoSuchElementException;

// first in, first out data structure
// insert at back, retrieve at front
public interface Queue<E> {
    public void enqueue(E e) throws IllegalStateException; 
    public E dequeue() throws NoSuchElementException; // can't throw EmptyQueueException, doesn't exist
    public E front() throws IllegalStateException;
    public E rear() throws IllegalStateException;
    public int size();
    public boolean isEmpty();
}
