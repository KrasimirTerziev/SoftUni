/*
Write a program that shows the sign (+, - or 0) of the product of three real numbers,
without calculating it.

Use a sequence of if operators.
 */
import java.util.Scanner;

public class multiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double z = Double.parseDouble(scanner.nextLine());

        // if (x == 0 || y == 0 || z == 0){
        //    System.out.println("0");
        // }
        // else if (x <0 || y <0 || z < 0){
        //    System.out.println("-");
        // }
        // else if (x > 0 || y > 0 || z> 0){
        //    System.out.println("+");
        // }
        if (x == 0 || y == 0 || z == 0){
               System.out.println("0");
        }
        else {
            int minusCount = 0;
            if (x < 0) {
                minusCount += 1;
            }
            if (y < 0) {
                minusCount += 1;
            }
            if (z < 0) {
                minusCount += 1;
            }
            if (minusCount == 0 || minusCount == 2 ){
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}
