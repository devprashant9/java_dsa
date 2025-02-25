import java.util.Scanner;
class DigitsExtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int digits1 = countDgits1(num);
        System.out.println("Primary Method: " +digits1);
        int digits2 = countDgits2(num);
        System.out.println("Using Log: " +digits2);
        sc.close();
    }

    public static int countDgits1(int num) {
        int count = 0;
        while(num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int countDgits2(int num) {
        return((int)Math.log10(num) + 1);
    }
}