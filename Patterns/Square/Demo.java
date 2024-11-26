package GithunDSA.Patterns.Square;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Column Values :- ");
        int x = sc.nextInt();

        System.out.println("Enter Row Values :- ");
        int y = sc.nextInt();

        //....................................................................................//

        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        //....................................................................................//

    }

}
