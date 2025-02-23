import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 4; j >= 0; j--) {
                if(j > rows - i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
            }  
            System.out.println();
        }
        sc.close();
    }
}
