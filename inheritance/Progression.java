package inheritance;

public class Progression {
    protected long first;   // protected access: class, package, subclass
    protected long current;

    protected Progression() {
        current = first = 0;
    }

    protected long firstValue() {
        current = first; // resets the progression to the furst value
        return current;
    }

    protected long nextValue() {
        return ++current; // default progression
    }

    public void printProgression(int n) {
        System.out.print(firstValue());
        for (int i = 0; i < n; i++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }


    
}
