import java.util.Scanner;

public class InternetBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int l = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();


        int sumNet = 0;

        if(n > l){
            sumNet = (n - l)* m;
        }
        int sum = sumNet + k;
        System.out.println(sum);


    }
}
