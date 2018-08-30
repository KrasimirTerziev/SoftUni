import java.util.ArrayList;
        import java.util.Scanner;

public class HeaviestWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int currentNum = 0;
        int sum = 0;
        int max = 0;
        String finalWord = "";
        for (int i = 1; i <= n; i++) {
            String words = in.nextLine();
            String wordsToLower = words.toLowerCase();
            for (int j = 0; j < wordsToLower.length(); j++) {
                switch (words.charAt(j)) {
                    case 'a':
                        currentNum = 1;
                    case 'b':
                        currentNum = 2;
                    case 'c':
                        currentNum = 3;
                    case 'd':
                        currentNum = 4;
                    case 'e':
                        currentNum = 5;
                    case 'f':
                        currentNum = 6;
                    case 'g':
                        currentNum = 7;
                    case 'h':
                        currentNum = 8;
                    case 'i':
                        currentNum = 9;
                    case 'j':
                        currentNum = 10;
                    case 'k':
                        currentNum = 11;
                    case 'l':
                        currentNum = 12;
                    case 'm':
                        currentNum = 13;
                    case 'n':
                        currentNum = 14;
                    case 'o':
                        currentNum = 15;
                    case 'p':
                        currentNum = 16;
                    case 'q':
                        currentNum = 17;
                    case 'r':
                        currentNum = 18;
                    case 's':
                        currentNum = 19;
                    case 't':
                        currentNum = 20;
                    case 'u':
                        currentNum = 21;
                    case 'v':
                        currentNum = 22;
                    case 'w':
                        currentNum = 23;
                    case 'x':
                        currentNum = 24;
                    case 'y':
                        currentNum = 25;
                    case 'z':
                        currentNum = 26;
                    default:
                        break;
                }
                sum += currentNum;
            }
            if(sum > max){
                max = sum;
                finalWord = wordsToLower;
            }

            currentNum = 0;
            sum = 0;
        }
        System.out.println();
        System.out.print(max + " ");
        System.out.println(finalWord);
    }
}