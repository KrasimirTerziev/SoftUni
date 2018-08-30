import java.util.Scanner;

public class GameThreeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        int x = n.charAt(0) - '0';
        int y = n.charAt(1) - '0';
        int z = n.charAt(2) - '0';

        int result = -1;

        result = Math.max(result, x+y+z);
        result = Math.max(result, x+y*z);
        result = Math.max(result, x*y+z);
        result = Math.max(result, x*y*z);

        System.out.println(result);
    }
}
