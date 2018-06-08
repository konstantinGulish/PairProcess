import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args) {
        int num1, num2, sum, product;
        double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        System.out.print("Sume is " + sum);
        if (sum > 200) {
            System.out.println("*");
        }
        else {
            System.out.println();
        }

        product = num1*num2;
        System.out.println("Product is " + product);

        average = ((double)num1/ num2);
        System.out.print("Average is " + average);

    }
}