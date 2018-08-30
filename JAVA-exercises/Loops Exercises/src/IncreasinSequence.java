// Write a program that finds the length of the
// maximal increasing sequence in an array of N integers.

import java.util.Scanner;

public class IncreasinSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int current = 1;
        int max = 1;
        int prev = scanner.nextInt();


        for (int i = 1; i < n; i++) {
            int next = scanner.nextInt();

            if (prev < next ){
                current ++;
            } else {
                current = 1;
            }
            max = Math.max(current, max);
            prev = next;
        }
        System.out.println(max);
    }
}
