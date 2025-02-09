package inheritance.abstract_classes;

public abstract class ProgressionAbstract {
    protected long first, current;

	public ProgressionAbstract() {
		current = first = 0;
	}
	
	protected long firstValue() {
		current = first;
		return current;
	}

	protected abstract long nextValue(); // No body, must be defined in subclasses

	public void printProgression(int n) {
		for (int i = 2; i <= n; i++) {
            //nextValue() of whichever child class calls PrintProgression will be called
			System.out.print(" " + nextValue()); 
		}

		System.out.println();
	}
}
