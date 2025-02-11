package data_structures.Trees;

// partial implementation of the Tree ADT. 
public abstract class AbstractTree<E> implements Tree<E> {
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
}
