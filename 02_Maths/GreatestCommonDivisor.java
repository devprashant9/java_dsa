import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        int naiveGCD = gcdNaiveMethod(num1, num2);
        System.out.println("GCD Naive Method: " + naiveGCD);
        int gcd = gcdEucleadeanMethod(num1, num2);
        System.out.println("GCD Eucleadean Algorithm : " + gcd);
        sc.close();
    }

    public static int gcdNaiveMethod(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int gcdEucleadeanMethod(int num1, int num2) {
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        if (num1 == 0)
            return num2;
        else
            return num1;
    }
}