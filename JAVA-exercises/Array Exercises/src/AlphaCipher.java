// The Alpha Cipher is a very advanced cryptography algorithm,
// designed for a top secret project. You are tasked with it's
// implementation, because it proved too difficult for the experts at the government.
// The Cipher is very advanced. Here is how you can calculate it:
// You get 5 numbers that consist of 3 digits each.
// Then, you need to find the product of those digits (multiply them with one another).
// If the result consists of more than 1 digit, take only the last digit of the produced number.

import java.util.ArrayList;
import java.util.Scanner;

public class AlphaCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> ar = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String number = in.nextLine();

             int x = number.charAt(0) - '0';
             int y = number.charAt(1) - '0';
             int z = number.charAt(2) - '0';
             int sum = x*y*z;
             String number2 = Integer.toString(sum);
             ar.add(number2.substring(number2.length() - 1));
        }
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i));
        }
    }
}
