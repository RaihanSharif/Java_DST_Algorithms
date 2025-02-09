package data_structures.LinkedList;

// linked list is made of nodes
// a node stores its data and a reference to the next node in the LL
public class Node<E> {
    private E element;
    private Node<E> next;

    public Node(E e, Node<E> n) {
        element = e; next = n;
    }
    
    // a node with null reference to its data and next node
    public Node() { this(null, null); }

    // getters
    public E getElement() { return element; }
    public Node<E> getNext() { return next; }

    // setters
    public void setElement(E newElem) { element = newElem; }
    public void setNext(Node<E> newNext) { next = newNext; }

}
