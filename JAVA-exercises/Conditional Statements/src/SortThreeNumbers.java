/*
  Write a program that enters 3 real numbers and prints them sorted in descending order.
  Use nested if statements.
  Don’t use arrays and the built-in sorting functionality.
*/
import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        // FIRST
        // if (x > y && x > z){
        //    System.out.print(x);
        //   System.out.print(" " + Math.max(y, z));
        //   System.out.println(" " + Math.min(y, z));
        // }
        // if (y > x && y > z){
        //   System.out.print(y);
        //     System.out.print(" " + Math.max(x, z));
        //    System.out.println(" " + Math.min(x, z));
        // }
        // if (z > x && z > y){
        //     System.out.print(z);
        //     System.out.print(" " + Math.max(x, y));
        //    System.out.println(" " + Math.min(x, y));
        // }

        // SECOND
        // if (x < y && y < z){
        //    System.out.println(z + " " + y + " " + x);
        // } else if (x < y && x < z && z < y){
        //    System.out.println(y + " " + z + " " + x);
        // } else if (y < x && x < z) {
        //    System.out.println(z + " " + x + " " + y);
        // } else if (y < x && y < z && z < x) {
        //    System.out.println(x + " " + z + " " + y);
        // } else if (z < x && x < y) {
        //    System.out.println(y + " " + x + " " + z);
        // } else {
        //   System.out.println(y + " " + x + " " + z);
        // }

        int max = Math.max(x, Math.max(y, z));
        int min = Math.min(x, Math.min(y, z));
        int mid = x + y + z - max - min ;
        System.out.print(max + " ");
        System.out.print(mid + " ");
        System.out.println(min);
    }
}
