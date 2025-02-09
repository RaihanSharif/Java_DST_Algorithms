package inheritance;

public class TestProgression {
    public static void main(String[] args) {
        Progression prog = new Progression();
        System.out.println("Default progression ");
        prog.printProgression(10);

        Progression arithProg = new ArithProgression(5);
        // ArithProgression arithProg = new ArithProgression(5); this works too
        System.out.print("Arithmetic progression, with custom increment:");
        arithProg.printProgression(10); // arithProg inherits this method from base class

        Progression geomProg = new GeomeProgression(3);
        System.out.print("Geometric progression: ");
        geomProg.printProgression(10);

        Progression fibProg = new FibProgression();
        System.out.print("Fibonacci progression: ");
        fibProg.printProgression(10);

    }
}
