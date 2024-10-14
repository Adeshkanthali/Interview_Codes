package SelfPrograms.PreOrderPostOrder;

public class Demo {
    public static void main(String[] args) {

        //............. Pre-Order Increment ...........//


        int a = 10;
        int b = ++a;
        int c = --a;
        System.out.println("a value is :- " + a);
        System.out.println("b value is :- " + b);
        System.out.println("c value is :- " + c);

        System.out.println();


        //............. Post-Order Increment ..........//


        int x = 10;
//        int y = x++;
        int z = x--;
        System.out.println("x value is :- " + x);
//        System.out.println("y value is :- " + y);
        System.out.println("z value is :- " + z);

    }
}
