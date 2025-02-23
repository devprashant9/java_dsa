import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // Print numbers from 1 to i
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }

            // Print stars
            int stars = (n - i) * 2;
            j = 1;
            while (j <= stars) {
                System.out.print("*");
                j++;
            }

            // Print numbers from i to 1
            j = i;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }

            System.out.println();
        }

        sc.close();
    }
}
