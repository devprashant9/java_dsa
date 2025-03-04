import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, length - 1);
        printArray(arr);
        sc.close();
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = swapElements(array, low, high);
            quickSort(array, low, partitionIndex);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    public static int swapElements(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (array[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (array[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;

        return j;
    }
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
