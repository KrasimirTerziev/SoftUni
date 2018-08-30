/*
A balanced number is a 3-digit number whose second digit is equal to the sum of the first and last digit.
Write a program which reads and sums balanced numbers. You should stop when an unbalanced number is given.

Input
Input data is read from the standard input
Numbers will be given
Each one will be on a separate line

Output
Print to the standard output
 */

import java.util.Scanner;

public class BalancedNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while (true) {
            String num = in.nextLine();

            int num01 = Integer.parseInt(String.valueOf(num.charAt(0)));
            int num02 = Integer.parseInt(String.valueOf(num.charAt(1)));
            int num03 = Integer.parseInt(String.valueOf(num.charAt(2)));
        /*
        int a = number.charAt(0) - '0';
        int b = number.charAt(1) - '0';
        int c = number.charAt(2) - '0';
         */

            if (num01 + num03 != num02){
                break;
            }
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }

}
