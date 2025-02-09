package recursion;
public class Ruler {
	public static void drawRuler(int nLines, int majorL) {
		drawOneTick(majorL, 0);  // draw tick zero and its label

		for (int i = 1; i <= nLines; i++) {
			drawTicks(majorL - 1); // draw all the ticks for current inch
			drawOneTick(majorL, i); // draw the largest tick and its label
		}

	}

	public static void drawTicks(int tickLen) {
		if (tickLen > 0) {
			// recursively draw the small tick on one side of the major
			// tick then draw major tick, then draw the other side
			drawTicks(tickLen - 1);
			drawOneTick(tickLen);
			drawTicks(tickLen -1);
		}
	}

	// draw a tick with a label
	public static void drawOneTick(int tickLen, int tickLabel) {
		for (int i = 0; i < tickLen; i++) {
			System.out.print("-");
		}

		if (tickLabel >= 0) {
			System.out.print(" " + tickLabel);
		}

		System.out.println();
	}

	public static void drawOneTick(int tickLen) {
		drawOneTick(tickLen, -1);

	}

    public static void main(String[] args) {
        drawRuler(4, 4);
    }

}
