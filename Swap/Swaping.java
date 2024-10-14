package SelfPrograms.Swap;

import java.util.Scanner;

public class Swaping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number :- ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number :- ");
        int b = sc.nextInt();

        //........................ Using temp Variable ...............................//

        System.out.println("After Swapping the Numbers are :- ");

        int temp = a;
        a = b;
        b = temp;

        System.out.println("First Number is :- " + a);
        System.out.println("Second Number is :- " + b);
        //............................................................................//


        //......................... Without temp Variable .............................//

        System.out.println("After Swapping the Numbers are :- ");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("First Number is :- " + a);
        System.out.println("Second Number is :- " + b);

        //............................................................................//

    }
}
