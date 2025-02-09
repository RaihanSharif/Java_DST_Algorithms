package recursion;
import java.util.Arrays;
public class ReverseArray {
	public static void recursiveReverseArray(int[] x, int i, int j){
		if (i < j) {
			int tmp = x[i];
			x[i] = x[j];
			x[j] = tmp;
			// tail recursion: linear recursion where the last statement is the recursive call
			// converted to iterative version by compiler for efficiency
			recursiveReverseArray(x, i+1, j-1);
		}
	}

	// iterative solution basically uses the same principle
	public static void iterReverseArray(int[] arr) {
		int i = 0;
		int j = arr.length-1;

		while (i < j) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;		
		}
	}
	public static void main(String[] args) {
	  int[] myArr = {6, 5, 4, 3, 2, 1};
	  recursiveReverseArray(myArr, 0, myArr.length-1);
	  System.out.println(Arrays.toString(myArr));
	  iterReverseArray(myArr);
	  System.out.println(Arrays.toString(myArr));
	}
  }