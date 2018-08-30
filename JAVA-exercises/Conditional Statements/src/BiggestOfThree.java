//Write a program that finds the biggest of three numbers that are read from the console.
import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();

        float max = Math.max(x, Math.max(y, z));

        if(max == (int) max){
            System.out.println((int) max);
        } else {
            System.out.println(max);
        }
    }
}
