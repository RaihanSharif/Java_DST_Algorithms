package inheritance.abstract_classes;

public class ArithProgression2 extends ProgressionAbstract {
    protected long increment;

    public ArithProgression2(long incr) {
        increment = incr;
    }

    public ArithProgression2() {
        this(1); // sets a default increment of 1
    }

    // inherits firstValue(), and printProgression(int)
    @Override
    protected long nextValue() {
        current += increment;  // current inherited from base class
        return current; 
    }
    
}
