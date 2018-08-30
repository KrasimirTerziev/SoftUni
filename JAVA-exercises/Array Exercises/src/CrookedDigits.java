/*
  The crooked digit of a given number N is calculated using the number's
  digits in a very weird and bendy algorithm. The algorithm takes the following steps:
  Sums the digits of the number N and stores the result back in N.
  If the obtained result is bigger than 9, step 1. is repeated, otherwise the algorithm finishes.
  The last obtained value of N is the result, calculated by the algorithm.
 */

import java.util.Scanner;

public class CrookedDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        char[] nums = String.valueOf(n).toCharArray();

        int count = 0;


        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count == 9 && nums[i] == (nums.length - 1))
            {
                System.out.println(count);
                break;
            }
            else if (count == 9 && nums[i] != (nums.length - 1))
            {
                count = 0;
            }
        }
        System.out.println(count);
    }

}
