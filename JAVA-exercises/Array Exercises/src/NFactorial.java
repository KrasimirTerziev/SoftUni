/*
   Write a method that multiplies a number represented
   as an array of digits by a given integer number.
   Write a program to calculate N!.
 */
import java.math.BigInteger;
import java.util.Scanner;

public class NFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        /*
        int num = 0;
        long sum = 1;


        for (int i = 0; i < n; i++) {
            num ++;
            sum *= num;
        }
        System.out.println(sum);
        */
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}

