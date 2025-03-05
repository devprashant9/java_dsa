import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        secondSmallest(array);
        sc.close();
    }
    public static void secondSmallest(int[] array){
        int smallest = Integer.MAX_VALUE;
        int second_Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < smallest) {
                second_Smallest = smallest;
                smallest = array[i];
            } else if(array[i] > smallest && array[i] < second_Smallest){
                second_Smallest = array[i];
            }
        }
        System.out.println(second_Smallest);
    }
}
