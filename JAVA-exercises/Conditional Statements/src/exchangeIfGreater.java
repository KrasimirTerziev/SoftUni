/*
Write a program that reads two double values from the console A and B,
stores them in variables and exchanges their values if the first one
is greater than the second one. Use an if-statement.
As a result print the values of the variables A and B, separated by a space.
 */
import java.util.Scanner;

public class exchangeIfGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondtNum = Double.parseDouble(scanner.nextLine());

        if (firstNum > 100 || firstNum < -100 || secondtNum > 100 || secondtNum< -100) {
            System.out.print("Invalid Number");
        }
        else if (firstNum>(long)firstNum || secondtNum>(long)secondtNum) {
            System.out.print(Math.min(firstNum, secondtNum) + " ");
            System.out.print( Math.max(firstNum, secondtNum));
        }
        else {
            int A = (int)firstNum;
            int B = (int)secondtNum;

            System.out.print(Math.min(A, B) + " ");
            System.out.print( Math.max(A, B));
        }
    }

}
