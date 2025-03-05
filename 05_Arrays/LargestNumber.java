import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length :");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int largestNum = largestNumber(array);
        System.out.println("Largest Number is: " +largestNum);
        sc.close();
    }
    public static int largestNumber(int[] array) {
        int largestNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > largestNum) {
                largestNum = array[i];
            }
        }
        return largestNum;
    }
}
