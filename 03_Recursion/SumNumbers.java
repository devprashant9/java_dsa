import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int sum1 = Sum1(n, 0, 1);
        System.out.println("Sum With Acuumulator: " +sum1);
        int sum = Sum(n);
        System.out.println("Without Accumulator: " +sum);
        sc.close();
    }
    public static int Sum1(int n, int sum, int start){
        if(start > n) {
            return sum;
        }
        return Sum1(n, sum + start, start + 1);
    }
    public static int  Sum(int n){
        if(n == 0) {
            return 0;
        }
        return n + Sum(n - 1);
    }
}
