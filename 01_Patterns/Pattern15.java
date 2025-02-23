import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                int c = 65 + i + j;
                System.out.print((char) c++ + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
