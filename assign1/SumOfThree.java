package assign1;

import java.util.Scanner;


public class SumOfThree {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Number:");
        n = sc.nextInt();
        sc.close();

        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);

    }
}
