package inheritance;

public class ArithProgression extends Progression {
    // inherits the fields first, current from base class

    protected long increment;

    public ArithProgression(long incr) {
        increment = incr;
    }

    public ArithProgression() {
        this(1); // sets a default increment of 1
    }

    // inherits firstValue(), and printProgression(int)
    protected long nextValue() {
        current += increment;  // current inherited from base class
        return current; 
    }
}
