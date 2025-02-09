package inheritance;

public class GeomeProgression extends Progression {

    protected long base;  // ratio of the progression   
    public GeomeProgression(long b) {
        base = b;
        first = 1;
        current = first;
    }
    public GeomeProgression() {
        this(2);  // default constructor sets base to 2
    }

    @Override  // compiler uses this to make sure you are actually overriding parent class method
    protected long nextValue()  {
        current *= base; 
        return current;
    }    
}
