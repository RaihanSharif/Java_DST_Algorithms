package Java_interfaces;

public class TestProgressionInterface {
	public static void main(String[] args) {
        ArithProgression3 progInterface;

        //progAbstract = new ProgressionAbstract();  // cannot instantiate abstract class

        progInterface = new ArithProgression3();
        System.out.println("Arithmetic progression with default increment: ");
        progInterface.printProgression(10);
    }
}