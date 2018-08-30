import java.util.Scanner;

//Write a program that finds and prints the biggest prime number which is <= N.

public class BiggestPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int number = 1;
        int maxPrime = 0;

        while (number <= n){

            int divider = 2;
            int maxDivider = (int) Math.sqrt(number);
            boolean isPrime = true;

            while (isPrime && divider <= maxDivider) {
                if (number % divider == 0){
                    isPrime = false;
                }
                divider++;
            }
            if(isPrime){
                maxPrime = number;
            }
            number ++;
        }
        System.out.println(maxPrime);
    }
}
