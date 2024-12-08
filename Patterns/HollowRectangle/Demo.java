package GithunDSA.Patterns.HollowRectangle;

public class Demo {

    public static void main(String[] args) {

        int n = 3;
        int m = 5;

        for(int i =1;i<=n;i++){        //for row

            for(int j=1;j<=m;j++){     //for column

                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

    }

}
