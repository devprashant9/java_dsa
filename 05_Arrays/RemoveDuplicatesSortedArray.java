import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        removeDuplicates(array);
        sc.close();
    }
    public static void removeDuplicates(int[] array) {
        int i = 0;
        int j = 1;
        while(j < array.length) {
            if(array[j] != array[i]) {
                array[i + 1] = array[j];
                i++;
                j++;
            }
            j++;
        }
        System.out.println("Modified Array is: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Unique Elements: " +(i + 1));
    }
}
