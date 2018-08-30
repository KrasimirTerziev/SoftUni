import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitwiseInversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        String binaryX = Integer.toBinaryString(x);
        List<Character> numbers = new ArrayList<Character>();
        List<Character> numbers02 = new ArrayList<Character>();
        char n = ' ';

        for (char i : binaryX.toCharArray()) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i++) {
           if (numbers.get(i) == '1'){
               n = '0';
               numbers02.add(n);
           } else if (numbers.get(i) == '0'){
               n = '1';
               numbers02.add(n);
           }
        }
        String y = numbers02.toString();
        y = y.replaceAll("[\\[\\](){}, ]","");
        int decimalY = Integer.parseInt(y, 2);

        System.out.println(decimalY);
    }
}
