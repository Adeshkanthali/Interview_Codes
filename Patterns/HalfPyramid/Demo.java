package GithunDSA.Patterns.HalfPyramid;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value :- ");
        int x = sc.nextInt();

        //....................................................................................//

        for (int i=1; i<=x; i++){
            for (int j=1; j<=i; j++){
//                System.out.print("*" + " ");
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //....................................................................................//

    }

}

