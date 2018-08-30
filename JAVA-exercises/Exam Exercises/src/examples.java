import java.util.Scanner;

public class examples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String toys = in.nextLine();

        String[] arr = toys.split(" ");
        int num = Integer.parseInt(arr[arr.length - 1]);
        int num02 = Integer.parseInt(arr[arr.length - 2]);
        System.out.println(num);
        System.out.println(num02);
    }
}
