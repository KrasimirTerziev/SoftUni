/*
  Sums the digits of the number N and stores the result back in N.
  If the obtained result is bigger than 9, step 1. is repeated,
  otherwise the algorithm finishes.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrookedDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nums = in.nextLine();
        List<String> numList = new ArrayList<>();
        //Обхожда стринга и запазва в листа.
        for (int i = 0; i < nums.length(); i++) {
            if (nums.charAt(i) != '-' && nums.charAt(i) != '.'){
                numList.add(String.valueOf(nums.charAt(i)));
            }
        }
        //Докато дължината на листа е по=голяма от цифра, тоест е два или повече символа.
        while(numList.size()> 1){
            List<String> newList = new ArrayList<>();

            int sum = 0;
            for (int i = 0; i < numList.size(); i++) {
                int num = Integer.valueOf(numList.get(i));
                sum += num;
            }
            String sum01 = String.valueOf(sum); // Сумата се парсва към стринг, за да се обходи.

            for (int i = 0; i < sum01.length(); i++) {
                newList.add(String.valueOf(sum01.charAt(i)));
            }
            numList = newList; // Запазваме стойността отново в основния лист.
        }
        System.out.println(numList.get(0));
    }
}
