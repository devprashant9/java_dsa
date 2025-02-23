import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                int c = 65 + rows - i + j - 1;
                System.out.print((char) c++ + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
