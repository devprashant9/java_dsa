import java.util.Scanner;

class RecursionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        recursionSum1(num);
        recursionSum2(num);
        recursionSum3(num);
        // int sum1 =
        // int sum2 =
        // int sum3 =
        sc.close();
    }

    public static void recursionSum1(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        recursionSum1(num - 1);
    }

    public static void recursionSum2(int num) {
        if(num == 0) {
            return;
        }
        recursionSum2(num - 1);
        System.out.println(num);

    }

    public static void recursionSum3(int num) {

    }
}