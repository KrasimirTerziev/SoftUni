
import java.util.Scanner;

public class ReturnComplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        String binaryX = Integer.toBinaryString(x);
        StringBuilder binaryX01 = new StringBuilder();

        binaryX01.append(binaryX);
        binaryX01 = binaryX01.reverse();

        String y = binaryX01.toString();
        int decimalY = Integer.parseInt(y, 2);

        System.out.println(decimalY);
    }

}
