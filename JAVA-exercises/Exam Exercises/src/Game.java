/*
Three friends came up with a game for having fun in the break between the classes.
One of them says a three-digit number and the others use it to form a mathematical
expressions by using operators for sum and multiplication between the digits of that number.
The winner is the first one who founds the biggest number that is a result of the above mentioned rules.
Write a program 'game', which prints out that biggest number.
 */

import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();
       /* Първи опит - не покрива всички тестове.
        int num01= Integer.parseInt(String.valueOf(n.charAt(0)));
        int num02= Integer.parseInt(String.valueOf(n.charAt(1)));
        int num03= Integer.parseInt(String.valueOf(n.charAt(2)));

        int sum = 0;

        if(num01 == 0 || num01 == 1
                && num02 != 1 || num02 != 0
                && num03 != 1 || num03 != 0){
            sum = num02*num03 + num01;
        }else if(num02 == 0 || num02 == 1
                && num01 != 1 || num01 != 0
                && num03 != 1 || num03 != 0){
            sum = num01*num03 + num02;
        }else if(num03 == 0 || num03 == 1
                && num02 != 1 || num02 != 0
                && num01 != 1 || num01 != 0){
            sum = num02*num01 + num03;
        }else{
            sum = num01*num02*num03;
        }
        System.out.println(sum);
        */
        // Втори опит - покрива всички тестове.
        int num01 = n.charAt(0) - '0';
        int num02 = n.charAt(1) - '0';
        int num03 = n.charAt(2) - '0';

        int result = -1;

        result = Math.max(result, num01 + num02 + num03);
        result = Math.max(result, num01 + num02 * num03);
        result = Math.max(result, num01 * num02 + num03);
        result = Math.max(result, num01 * num02 * num03);

        System.out.println(result);

    }
}
