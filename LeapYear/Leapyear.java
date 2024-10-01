package SelfPrograms.LeapYear;

import java.util.Scanner;

public class Leapyear {

    //.........................................................................//
    public static void Leap(int n){

        boolean leap = false;

        if (n % 4 == 0) {
            leap = true;

            if (n % 100 == 0){

                if (n % 400 == 0){
                    leap = true;
                }
                else {
                    leap = false;
                }
            }
        }

        if (leap){
            System.out.println(n + " is a Leap Year");
        }
        else {
            System.out.println(n + " is not a Leap Year");
        }
        //.........................................................................//

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year :- ");
        int n = sc.nextInt();

        Leap(n);

    }
}
