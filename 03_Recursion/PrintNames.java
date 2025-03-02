import java.util.Scanner;

public class PrintNames {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String s = sc.nextLine();
        printName(s, 1);
        sc.close();
    }
    public static void printName(String s, int n) {
        if(n == 5) {
            return;
        }
        System.out.println(s);
        printName(s, n + 1);
    }
}
