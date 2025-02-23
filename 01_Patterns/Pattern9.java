import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                int c = 'A' + i;
                System.out.print((char) c + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
