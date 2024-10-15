package SelfPrograms.Factors;

import java.util.Scanner;

public class NumbersFactors {

    //....................................................................................//
    public static void findFactors(int number) {               //Function Declaration

        boolean found = false;

        System.out.print("Factors of " + number + " is :- ");

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found){
            System.out.println("No Factors Found.");
        }

    }
    //....................................................................................//

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :- ");
        int num = sc.nextInt();

        findFactors(num);                                      //Function Call

    }

}
