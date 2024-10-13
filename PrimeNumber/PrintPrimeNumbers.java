package SelfPrograms.PrimeNumber;

import java.util.Scanner;

public class PrintPrimeNumbers {                   // Class

    //......................................................................................//

    public static boolean isPrime(int n) {                           // Function Declaration
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //......................................................................................//

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Value of N :- ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers between 0 and " + n + ":");

        for (int i = 2; i <= n; i++) {
            if ( isPrime(i) ) {                                                 // Function Call
                System.out.print(i + " ");
            }
        }

    }
}