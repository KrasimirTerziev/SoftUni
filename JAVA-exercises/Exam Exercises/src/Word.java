import java.util.ArrayList;
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int currentNum = 0;
        int sum = 0;
        int max = 0;
        int max2= 0;
        String finalWord = "";

        for (int i = 0; i < n; i++) {

            String words = in.nextLine();
            String wordsToLower = words.toLowerCase();

            for (int j = 0; j < wordsToLower.length(); j++) {
                if (words.charAt(j) == 'a') {
                    currentNum = 1;
                }
                if (words.charAt(j) == 'b') {
                    currentNum = 2;
                }
                if (words.charAt(j) == 'c') {
                    currentNum = 3;
                }
                if (words.charAt(j) == 'd') {
                    currentNum = 4;
                }
                if (words.charAt(j) == 'e') {
                    currentNum = 5;
                }
                if (words.charAt(j) == 'f') {
                    currentNum = 6;
                }
                if (words.charAt(j) == 'g') {
                    currentNum = 7;
                }
                if (words.charAt(j) == 'h') {
                    currentNum = 8;
                }
                if (words.charAt(j) == 'i') {
                    currentNum = 9;
                }
                if (words.charAt(j) == 'j') {
                    currentNum = 10;
                }
                if (words.charAt(j) == 'k') {
                    currentNum = 11;
                }
                if (words.charAt(j) == 'l') {
                    currentNum = 12;
                }
                if (words.charAt(j) == 'm') {
                    currentNum = 13;
                }
                if (words.charAt(j) == 'n') {
                    currentNum = 14;
                }
                if (words.charAt(j) == 'o') {
                    currentNum = 15;
                }
                if (words.charAt(j) == 'p') {
                    currentNum = 16;
                }
                if (words.charAt(j) == 'q') {
                    currentNum = 17;
                }
                if (words.charAt(j) == 'r') {
                    currentNum = 18;
                }
                if (words.charAt(j) == 's') {
                    currentNum = 19;
                }
                if (words.charAt(j) == 't') {
                    currentNum = 20;
                }
                if (words.charAt(j) == 'u') {
                    currentNum = 21;
                }
                if (words.charAt(j) == 'v') {
                    currentNum = 22;
                }
                if (words.charAt(j) == 'w') {
                    currentNum = 23;
                }
                if (words.charAt(j) == 'x') {
                    currentNum = 24;
                }
                if (words.charAt(j) == 'y') {
                    currentNum = 25;
                }
                if (words.charAt(j) == 'z') {
                    currentNum = 26;
                }
                sum += currentNum;

            }
            if(sum > max) {
                max = sum;
                finalWord = wordsToLower;
            }
            else{
                currentNum = 0;
                sum = 0;
            }
            max2 = Math.max(sum, max);


        }
        System.out.println();
        System.out.print(max2 + " ");
        System.out.println(finalWord);
    }

}

