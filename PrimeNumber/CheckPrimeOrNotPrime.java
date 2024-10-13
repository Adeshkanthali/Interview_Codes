package SelfPrograms.PrimeNumber;

import java.util.Scanner;

public class CheckPrimeOrNotPrime {

    //....................................................................................//

    public static boolean isPrime(int n){                      // function declaration
        if (n % 2 == 0){
            return false;
        }
        return true;
    }

    //....................................................................................//

    public static void main(String[] args) {
        System.out.println("Enter Number :- ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(isPrime(x)){                                       // function call
            System.out.print("Number is Prime.");
        }
        else {
            System.out.println("Number is Not-prime.");
        }

    }
}
