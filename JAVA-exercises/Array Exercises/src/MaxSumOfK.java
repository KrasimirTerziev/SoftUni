
// Write a program that reads two integer numbers N and K and an array of N elements
// from the console. Find the maximal sum of K elements in the array.

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSumOfK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int j = 0; j < list.size(); j++) {
                if (max < list.get(j)){
                    max = list.get(j);
                    index = j;
                }
            }
            list.remove(index);
            sum += max;
        }
        System.out.println(sum);
    }
}
