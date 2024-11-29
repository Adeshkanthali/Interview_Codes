package GithunDSA.Patterns.Traingle;

public class Demo {

    public static void main(String[] args) {

        int n = 5;

        //....................... First Method ......................//

        for (int i=1; i<=n; i++){

            for (int j=n; j>i; j--){
                System.out.print("  ");
            }

            for (int k=1; k<=i; k++){
                System.out.print(" *  ");
            }

            System.out.println();
        }



        //....................... Second Method .........................//

//        for (int i=1; i<=n; i++){
//
//            for (int j=n; j>=1; j--){
//                if (j>i){
//                    System.out.print("  ");
//                }
//                else{
//                    System.out.print(" *  ");
//                }
//            }
//            System.out.println();
//        }

    }
}

/*

OUTPUT :-

        *
      *   *
    *   *   *
  *   *   *   *
 *   *   *   *   *

*/

