import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {

            // spaces
            int space = rows - i;
            while(space > 0){
                System.out.print(" ");
                space--;
            }

            // triangle 1
            int j = 1;
            while(j <= i) {
                System.out.print(j);
                j++;
            }

            // triangle 2
            int k = i - 1;
            while(k >= 1) {
                System.out.print(k);
                k--;
            }

            System.out.println();
        }
        sc.close();
    }
}
