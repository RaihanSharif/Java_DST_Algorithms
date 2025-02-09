package data_structures.LinkedList;

public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {} // LL initially empty

    // getters
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public E first() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    // setters

    public void addFirst(E e) {
        head = new Node<>(e, head); // e = data, head = next node of this node is the previous head
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty()) {
            head = newNode;

        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size --;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }
}
