import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        insertionSort(array);
        sc.close();
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while(j > 0 && array[j - 1] > array[j]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
