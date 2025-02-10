package data_structures.queue;

import java.util.NoSuchElementException;

//array based implementation of queue ADT
// variables to track the front and back of the queue
// within the array. Use modulo to wrap around the array
public class CircularQueue<E> implements Queue<E>{
    protected E[] queueArr;
    protected int front;
    protected int rear;

    @SuppressWarnings("unchecked")
    public CircularQueue(int size) {    
        queueArr = (E[]) new Object[size];
        front = 0;
        rear = 0;
    }

    public CircularQueue() {
        this(10);
    }

    @Override
    public void enqueue(E e) throws IllegalStateException {
        if (size() == queueArr.length -1) throw new IllegalStateException("Queue is full");
        queueArr[rear] = e;
        rear = (rear + 1) % queueArr.length;
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        E result = queueArr[front];
        queueArr[front] = null;
        front = (front + 1) % queueArr.length;
        return result;
    }
    
    @Override
    public int size() {
        return (rear - front + queueArr.length) % queueArr.length;
    }
    
    @Override
    public boolean isEmpty() {
        return (front == rear);
    }

    @Override
    public E front() throws IllegalStateException{
        if (isEmpty()) throw new IllegalStateException("queue is empty");
        return queueArr[front];
    }
    
    @Override
    public E rear() throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException("queue is empty");
        return queueArr[rear-1];
    }
}