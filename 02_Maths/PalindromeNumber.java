import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        boolean digits1 = palindromeNumber(num);
        System.out.println(num + " is a Palindrome Number? " +digits1);
        sc.close();
    }

    public static boolean palindromeNumber(int num) {
        int copyNum = num;
        int reverseNum = 0;
        while(num != 0) {
            int rem = num % 10;
            reverseNum = reverseNum * 10 + rem;
            num /= 10;
        }
        if(copyNum == reverseNum){
            return true;
        }
        else {
            return false;
        }
    }

}
