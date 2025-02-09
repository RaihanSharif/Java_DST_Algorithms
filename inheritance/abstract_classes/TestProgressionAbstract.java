package inheritance.abstract_classes;

public class TestProgressionAbstract {
	public static void main(String[] args) {
        ProgressionAbstract progAbstract;

        //progAbstract = new ProgressionAbstract();  // cannot instantiate abstract class

        progAbstract = new ArithProgression2();
        System.out.println("Arithmetic progression with default increment: ");
        progAbstract.printProgression(10);
    }
}