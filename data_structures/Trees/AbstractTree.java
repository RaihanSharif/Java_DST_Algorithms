package data_structures.Trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import data_structures.queue.Queue;
import data_structures.queue.CircularQueue;


// partial implementation of the Tree ADT. 
public abstract class AbstractTree<E> implements Tree<E> {

    // -------private iterator class
    private class ElementIterator implements Iterator<E> {
        Iterator<Position<E>> posIterator = positions().iterator();
        public boolean hasNext() { return posIterator.hasNext(); }
        public E next() { return posIterator.next().getElement(); } 
        public void remove() { posIterator.remove(); }
    }
    // ----- end of private iterator class

    

    // these methods will be common across different tree implementations
    public boolean isInternal(Position<E> p) { return numChildren(p) > 0; }
    public boolean isExternal(Position<E> p) { return numChildren(p) == 0; }
    public boolean isRoot(Position<E> p) { return p == root(); }
    public boolean isEmpty() { return size() == 0; }

    // recursively determine the depth of a node in the tree
    public int depth(Position<E> p) {
        if (isRoot(p)) return 0;
        return 1 + depth(parent(p));
    }

    /**
     * Bad efficiency. Must iterate through entire tree
     * then sum of depth for all position p. 
     * O(n^2) run time 
     */
    @SuppressWarnings("unused")
    private int heightBad() {
        int h = 0;
        for (Position<E> p : positions()) {
            if (isExternal(p)) {
                h = Math.max(h, depth(p));
            }
        }
        return h;
    }

    /*
     * this recursive method is much more efficient
     * O(n) because it is called once for each position in the tree
     */
    public int height(Position<E> p) {
        int h = 0;
        for (Position<E> c : children(p)) {
            h = Math.max(h, 1 + height(c));
        }
        return h;
    }

    // add position elements from the tree in preorder, recursively
    private void preorderSubtree(Position<E> p, List<Position<E>> snapshot) {
        snapshot.add(p);
        for (Position<E> c: children(p)) {
            preorderSubtree(c, snapshot);
        }
    }

    public Iterable<Position<E>> preorder() {
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty()) {
            preorderSubtree(root(), snapshot);
        }
        return snapshot;
    }

    private void postorderSubtree(Position<E> p, List<Position<E>> snapshot) {
        for (Position<E> c: children(p)) {
            preorderSubtree(c, snapshot);
        }
        snapshot.add(p);
    }

    public Iterable<Position<E>> postorder() {
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty()) {
            postorderSubtree(root(), snapshot);
        }
        return snapshot;
    }

    public Iterable<Position<E>> breadthfirst() {
        List<Position<E>> snapshot = new ArrayList<>();
        if(!isEmpty()) {
            Queue<Position<E>> fringe = new CircularQueue<>();
            fringe.enqueue(root());
            while(!fringe.isEmpty()) {
                Position<E> p = fringe.dequeue();
                snapshot.add(p);
                for (Position<E> c : children(p)) {
                    fringe.enqueue(c);
                }
            }
        }
        return snapshot;
    }

    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    public Iterable<Position<E>> positions() {
        return preorder();
    }
}
