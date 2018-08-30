/*
  By a given N number, from which you need to generate a sequence of 1 to N inclusive.
  For every prime number in that sequence, you need to print out all the other numbers
  before it (and the number itself), whether they are prime or not

  Example
  Let's say N=10
  We have the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
  The prime numbers are 1, 2, 3, 5, 7 - 5 prime numbers, so we prive 5 rows
  Each row contains all the numbers for 1 to PRIME_NUMBER

  Lets make things simpler:
  Print 0 if the numbers is not prime
  Print 1 if the number is prime
 */


/* Вариант първи
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    String row = "";

    for (int number = 1; number <= n; number++) {
      int maxDivider = (int) Math.sqrt(number);
      boolean isPrime = true;

      for (int divider = 2; divider <= maxDivider; divider++) {
        if (number % divider == 0) {
          isPrime = false;
        }
      }

      if (isPrime) {
        row += "1";
        System.out.println(row);
      } else {
        row += "0";
      }
    }
  }
}

 */
// Вариант втори
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Integer> primeNums = new ArrayList<>();
        int row = 0;

        for (int i = 1; i <= n; i++) {
           if(isItPrime(i)){
               row ++;
               primeNums.add(i);
           }
        }
        for (int i = 1; i <= row; i++) {
          int prime = 0;
            for (int j = 1; j <= n; j++) {
                if (prime == i){
                    break;
                }// Проверяваме дали числото се намира в листа, тоест дали е prime.
                if(primeNums.contains(j)){
                    System.out.print(1);
                    prime ++;
                } else {
                    System.out.print(0);
                }

            }
            System.out.println();
        }
    }

    // Метод проверяващ дали едно число е просто.
    public static Boolean isItPrime(int number) {
        if (number == 1 || number == 2) {
            return true;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

