package sorting_algorithms;

public class MergeSort {
    public MergeSort(){};
    /*  this compares the first element of each list and puts the smaller
    one into the sorted list, progrsses through the index of the sorted list
    then the list from wihch the smaller number was taken, but not the one
    with the bigger number. 

    This number is then compared again to the next number in the other list.
    This process is repeated until the sorting is done.
    */
    public int[] mergeTwoSortedArrays(int[] firstArr, int[] secondArr) {
        int[] sorted = new int[firstArr.length + secondArr.length];

        int i = 0, j = 0, k = 0;
        while (i < firstArr.length && j < secondArr.length) {
            if (firstArr[i] < secondArr[j]) {
                sorted[k] = firstArr[i];
                k++;
                i++;
            } else {
                sorted[k] = secondArr[j];
                k++;
                j++;
            }
        }
        // if there is more than one elem left in second array,
        // put them into the sorted array
        if (i == firstArr.length) {
            while (j < secondArr.length) {
                sorted[k] = secondArr[j];
                k++;
                j++;
            }
        }
        // same as above but for first arr
        if (j == secondArr.length) {
            while (i < firstArr.length) {
                sorted[k] = firstArr[i];
                k++;
                i++;
            }
        }
        return sorted;
    }

    /**
     * @param arr the array to sort
     * @param low starting index
     * @param high ending index, inclusive. For a whole array, input length -1
     * @return sorted int array
     */
    public int[] mergesort(int[] arr, int low, int high) {
        // if the array is of size 1, return that one
        if (low == high) {
            int[] br = new int[1];
            br[0] = arr[low];

            return br;
        }
        int mid = (low + high)/2;

        int[] leftHalf = mergesort(arr, low, mid);
        int[] rightHalf = mergesort(arr, mid+1, high);

        int[] merged = mergeTwoSortedArrays(leftHalf, rightHalf);

        return merged;
    }
}
