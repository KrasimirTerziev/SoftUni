import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int divider = 2;
        // int maxDivider = n - 1;
        // int maxDivider = n / 2 + 1;
        int maxDivider = (int) Math.sqrt(n); // най - оптимизирания вариант. Не проверява всички числа.
        boolean isPrime = true;



        while (isPrime && divider <= maxDivider) {
            if(n % divider == 0){
                isPrime = false;
            }
            divider++;
        }
        /*
        for (int i = 2; i <= maxDivider; i++) {
            if(n % divider == 0){
                isPrime = false;
            }
            divider++;
        }
        */
        System.out.println("Is prime -> " + isPrime);
    }
}
