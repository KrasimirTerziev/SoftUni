import java.util.Scanner;

public class PrimeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        for (int i = 0; i < N; i ++){
            if(N % i == 0){
                System.out.println("i is not prime");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
