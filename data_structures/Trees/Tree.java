package data_structures.Trees;

import java.util.Iterator;

public interface Tree<E> extends Iterable<E> {
    /**
     * Returns position of the root of the tree
     * @return Position
     */
    Position<E> root();
    /**
     * Returns the parent of passed in Position
     * @param p a position in the tree
     * @return Position
     * @throws IllegalArgumentException if the supplied position (node) doesn't exist
     */  
    Position<E> parent(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns an iterable collection containing the children of the position
     * @param p a Position
     * @return
     * @throws IllegalArgumentException
     */
    Iterable<Position<E>> children(Position<E> p) 
                                            throws IllegalArgumentException;

    /**
     * The number of children a node in the tree has
     * @param p
     * @return
     * @throws IllegalArgumentException
     */
    int numChildren(Position<E> p) throws IllegalArgumentException;
    boolean isInternal(Position<E> p) throws IllegalArgumentException;
    boolean isExternal(Position<E> p) throws IllegalArgumentException;
    int size();
    boolean isEmpty();

    /**
     * Returns an iterator for all elements in the tree. 
     * I.e. the tree itself is iterable
     */
    Iterator<E> iterator();

    /**
     * Returns an iterable collection of all positions of the tree
     * @return
     */
    Iterable<Position<E>> positions();
}
