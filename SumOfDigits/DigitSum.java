package SelfPrograms.SumOfDigits;

import java.util.Scanner;

public class DigitSum {

    //............................................................................................//

    public static int SumofDigit(int n){
        int sum = 0;

        while (n != 0){
            sum = sum + n%10;
            n = n/10;
        }

        return sum;
    }
    //............................................................................................//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number :- ");
        int n = sc.nextInt();

        int sum = SumofDigit(n);

        System.out.println("Sum of Digits of " + n + " is :- " + sum);

    }
}
