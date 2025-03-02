import java.util.Scanner;

public class PrintNumberByBackTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        printNumberByBackTrack(num);
        sc.close();
    }
    public static void printNumberByBackTrack(int num) {
        if(num > 10){
            return ;
        }
        printNumberByBackTrack(num + 1);
        System.out.print(num + " ");

    }
}
