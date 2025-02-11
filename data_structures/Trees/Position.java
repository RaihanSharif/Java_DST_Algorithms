package data_structures.Trees;

// a basic Node interface that can be implemented by different data structures
public interface Position<E> {
    /**
     * Returns the element stored at this position.
     * 
     * @return the stored element
     * @throws IllegalStateException if position no longer valid
     */
    E getElement() throws IllegalStateException;
}
