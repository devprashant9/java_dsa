import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if(j <= rows - i + 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
