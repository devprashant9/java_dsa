import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        selectionSort(array);
        sc.close(); 
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
