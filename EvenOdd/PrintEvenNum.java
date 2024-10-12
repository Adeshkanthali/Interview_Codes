package SelfPrograms.EvenOdd;

import java.util.Scanner;

public class PrintEvenNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :- ");
        int x = sc.nextInt();

        //....................................................................................//

        System.out.println("Even Numbers are :- ");
        for (int i=1; i<=x; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }

        //....................................................................................//

    }
}
