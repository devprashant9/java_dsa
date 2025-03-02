import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        printNumber(num);
        sc.close();
    }
    public static void printNumber(int num){
        if(num > 10) {
            return;
        }
        System.out.println(num);
        printNumber(num + 1);
    }
}
