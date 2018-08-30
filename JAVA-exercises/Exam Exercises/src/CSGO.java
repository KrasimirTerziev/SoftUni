import java.util.Scanner;

public class CSGO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int money = scanner.nextInt();
        if (num > 7) {
            System.out.println("Sorry, you can't carry so many things!");
        }
        int current;
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            String text = scanner.nextLine();

            if(text == "ak47") {
                current = 2700;
                sum += current;
            }
            if(text == "awp") {
                 current = 4750;
                sum += current;
            }
            if(text == "sg553") {
                current = 3500;
                sum += current;
            }
            if(text == "grenade") {
                current = 300;
                sum += current;
            }
            if(text == "flash") {
                current = 250;
                sum += current;
            }
            if(text == "glock") {
                current = 500;
                sum += current;
            }
            if(text == "bazooka") {
                current = 5600;
                sum += current;
            }
        }
        if (sum < money){
            System.out.println("You bought all " + num + " items! Get to work and defeat the bomb!");
        }else if (sum > money){
            int moreMoney = sum - money;
            System.out.println("Not enough money! You need " + moreMoney + " more money");
        }
    }
}
