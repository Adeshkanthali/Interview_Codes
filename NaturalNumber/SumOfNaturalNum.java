package SelfPrograms.NaturalNumber;

import java.util.Scanner;

public class SumOfNaturalNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //...................................................................//

        System.out.println("Enter the Number :- ");
        int n = sc.nextInt();

        int sum = n * (n+1) / 2;

        System.out.println("Sum of first " + n + " Natural Numbers :- " + sum);

        //...................................................................//

    }
}