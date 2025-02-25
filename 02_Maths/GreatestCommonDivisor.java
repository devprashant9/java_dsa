import java.util.Scanner;

public class GreatestCommonDivisor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = Math.min(num1, num2); i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0 ) {
                max = i;
                break;
            }
        }
        System.out.println(max);
        sc.close();
    }
}

// Euclidean GCD = (n1 - n2, n2)     n1 > n2
// Euclidean GCD = (n1 % n2, n2)     n1 > n2
// Repeat The Formula Until One is zero other is the GCD