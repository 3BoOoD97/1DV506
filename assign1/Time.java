package assign1;

import java.util.Scanner;


public class Time {
    public static void main(String[] args) {
        int input;
        int secTotal;
        int sec;
        int min;
        int hours;
        System.out.print("Give a number of seconds: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        sc.close();

        secTotal = input % 3600; //how many seconds are left when divided by hours
        sec = secTotal % 60; //how many seconds are left when divided by minutes
        min = secTotal / 60;
        hours = input/3600;
        System.out.print( "This corresponds to: " + hours + " hours, " + min + " minutes and " + sec + " seconds.");
    }
}
