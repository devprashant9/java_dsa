import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        mergeSort(array, 0, length - 1); // Corrected high value

        System.out.println("Sorted Array: " + Arrays.toString(array)); // Final sorted array output
        sc.close();
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (low >= high) {
            return; // Base condition corrected
        }

        int mid = (low + high) / 2;
        mergeSort(array, low, mid); // Sort first half
        mergeSort(array, mid + 1, high); // Sort second half
        mergeArrays(array, low, mid, high); // Merge sorted halves
    }

    public static void mergeArrays(int[] array, int low, int mid, int high) {
        int left = low, right = mid + 1, k = 0;
        int[] temp = new int[high - low + 1];

        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                temp[k++] = array[left++];
            } else {
                temp[k++] = array[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = array[left++];
        }

        while (right <= high) {
            temp[k++] = array[right++];
        }

        // Copy sorted elements back to the original array
        System.arraycopy(temp, 0, array, low, temp.length);
    }
}
