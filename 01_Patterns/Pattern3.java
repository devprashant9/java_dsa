import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        int count = 1;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
