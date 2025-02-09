package inheritance;

public class FibProgression extends Progression {

    protected long prev;

    public FibProgression(long second) {
        prev = second - first;
    }

    public FibProgression() {
        this(1); // first element of sequence
    }

    protected long nextValue() {
        long next = current + prev;
        prev = current;
        current = next;
        return current;
    }
    
}
