import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        factors(num);
        sc.close();
    }

    public static void factors(int num) {
        List<Integer> ansList = new ArrayList<>();
        int condition = (int) Math.sqrt(num);
        for (int i = 1; i <= condition; i++) {
            if (num % i == 0) {
                ansList.add(i);
                if (num / i != i) {
                    ansList.add(num / i);
                }
            }
        }
        Collections.sort(ansList);
        System.out.println(ansList);
    }
}