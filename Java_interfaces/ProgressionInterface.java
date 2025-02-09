package Java_interfaces;

public interface ProgressionInterface {
    public static final int  MAX_LENGTH = 5;  //static and final (i.e. a constant)
    public long firstVal();
    public long nextVal();
    
    // don't have to do this in classes that implement this interface
    public default void printProgression(int n) {
        System.out.print(firstVal());
        if (n > MAX_LENGTH) {n = MAX_LENGTH;}  

        for (int i = 2; i <= n; i++) {
            System.out.print(" "+ nextVal());
        }
        System.out.println();
    }
    
    // subclasses must:
    // - declare all required fields and
    // - implement all methods specified in the interface
}
