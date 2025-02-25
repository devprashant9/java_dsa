import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int digits1 = revrseNumber(num);
        System.out.println("Reversed Number: " +digits1);
        sc.close();
    }

    public static int revrseNumber(int num) {
        int reverseNum = 0;
        while(num != 0) {
            int rem = num % 10;
            reverseNum = reverseNum * 10 + rem;
            num /= 10;
        }
        return reverseNum;
    }

}
