import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int secondLarge = secondLargest(array);
        System.out.println("Second Largest is: " +secondLarge);
        sc.close();
    }
    public static int secondLargest(int[] array){
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > largest) {
                secondLarge = largest;
                largest = array[i];
            } else if(array[i] < largest && array[i] > secondLarge){
                secondLarge = array[i];
            }
        }
        return secondLarge;
    }
}
