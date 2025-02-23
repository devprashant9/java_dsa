import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if(j > i - 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
