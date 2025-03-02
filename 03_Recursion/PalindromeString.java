import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        palindromeString(s, 0);
        sc.close();
    }
    public static void palindromeString(String s, int n) {
        if(n > ((s.length() - 1) / 2)) {
            System.out.println("Palindrome");
            return;
        }
        if(s.charAt(n) != s.charAt(s.length() - 1 - n)) {
            System.out.println("Not Palindrome");
        }
        palindromeString(s, n + 1);
    }
}
