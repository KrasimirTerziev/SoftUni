/*
Write a program that reads from the console a sequence of N real numbers and returns the minimal,
the maximal number, the sum and the average of all numbers (displayed with 2 digits after the decimal point).

The input starts by the number N (alone in a line) followed by N lines, each holding an real number.
The output is like in the examples below.
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        double min = 1099511627776.00;
        double max = - 1099511627776.00;
        double sum = 0;
        double avg = 0;
        double count = 0;


        for (int i = 0; i < n; i++) {

            double numbers = in.nextDouble();

            if(numbers < min){
                min = numbers;
            }if (numbers > max){
                max = numbers;
            }
            sum += numbers;

        }
        avg = sum/n;
     /*   DecimalFormat twoSign = new DecimalFormat("#.##");

        System.out.println("min=" + twoSign.format(min));
        System.out.println("max=" + twoSign.format(sum));
        System.out.println("avg=" + twoSign.format(avg));
     */

        System.out.print("min=");
        System.out.printf("%.2f%n", min);


        System.out.print("max=");
        System.out.printf("%.2f%n", max);


        System.out.print("sum=");
        System.out.printf("%.2f%n", sum);


        System.out.print("avg=");
        System.out.printf("%.2f%n", avg);
/*
        System.out.println("min=" + df.format(min));
        System.out.println("max=" + df.format(max));
        System.out.println("sum=" + df.format(sum));
        System.out.println("avg=" + df.format(sum / n));
*/

    }
}
