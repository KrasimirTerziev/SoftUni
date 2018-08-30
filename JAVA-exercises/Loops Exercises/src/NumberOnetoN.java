import java.util.Scanner;

public class NumberOnetoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 1;

        while(num <= n){
            System.out.print(num + " ");
            num ++;
        }

    }
}
