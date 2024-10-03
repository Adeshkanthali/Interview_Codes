package SelfPrograms.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

    //............................................................................//
    public static void getFibonacci(int n){                //function Call

        int a = 0, b = 1;

        System.out.println("The Fibonacci Series of " + n + " is :- " );

        for (int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    //............................................................................//

    public static void main(String[] args) {

        System.out.println("Enter the Number :- ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        getFibonacci(n);                //function call

    }

}
