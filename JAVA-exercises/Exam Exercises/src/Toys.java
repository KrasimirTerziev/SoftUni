
import java.util.Scanner;

public class Toys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int current = 0;
        int maxval = 1000000;

        String firstEll = null;


        for (int i = 0; i < n; i++) {
            String toy = in.nextLine();
            String[] arr = toy.split(" ");
            int num = Integer.parseInt(arr[arr.length - 1]);
            int num02 = Integer.parseInt(arr[arr.length - 2]);
            int sum = num  - num02;
            if (sum >= current){
                current = sum;
                if(current <= maxval){
                    maxval = current;
                    firstEll = arr[0];
                }

            }
        }
        System.out.println(firstEll);

    }
}
