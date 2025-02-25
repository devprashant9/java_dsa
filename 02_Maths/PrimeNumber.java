import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int factor = 2;
        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                factor = factor + 1;
            }
        }
        if(factor == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
        sc.close();
    }
}
