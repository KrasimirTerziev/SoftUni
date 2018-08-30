/* Write a program that applies bonus score to given score in the range [1…9] by the following rules:
        If the score is between 1 and 3, the program multiplies it by 10.
        If the score is between 4 and 6, the program multiplies it by 100.
        If the score is between 7 and 9, the program multiplies it by 1000.
        If the score is less than 0 or more than 9, the program prints "invalid score".
*/
import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        if (n < 1 || n > 9){
            System.out.print("invalid score");
        } else if (n < 4){
            System.out.print(n * 10);
        } else if (n < 7){
            System.out.print(n * 100);
        } else {
            System.out.print(n * 1000);
        }
    }
}

