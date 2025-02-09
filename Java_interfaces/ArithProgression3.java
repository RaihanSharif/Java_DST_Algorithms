package Java_interfaces;

public class ArithProgression3 implements ProgressionInterface{
    protected long first, current, increment;

    public ArithProgression3(int incr) {
        increment = incr;
    }

    public ArithProgression3() {
        this(1);
    }

    public long firstVal() {
        current = first;
        return current;
    }

    public long nextVal() {
        current += increment;
        return current;
    }
    
}
