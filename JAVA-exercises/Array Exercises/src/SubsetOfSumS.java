/*
We are given an array of integers and a number S.
 Write a program to find if there exists a subset
 of the elements of the array that has a sum S.

Input
Read from the standard input
On the first line is S
On the second line, there is the array
As values, separated by a single whitespace
Output
Print on the standard output
On the single line print "yes" or "no"
 */

import java.util.Scanner;

public class SubsetOfSumS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String nums = in.nextLine();

        System.out.println(nums);
    }
}
