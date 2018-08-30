import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
   Иванчо много обича да подрежда числа. Днес той иска да отбележи ранка на всяко число от дадена редица.
   Най-голямото число замества с 1, второто по големина с 2 и така нататък, докато замести всички.
   Напишете програма, която да намира и извежда ранковете на дадена редица от числа.
*/
public class Ранкове {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Integer> myList = new ArrayList<>();
        List<Integer> finalL = new ArrayList<>();
        int count = 1;


        for (int i = 0; i < n; i++) {
            int numbers = in.nextInt();
            myList.add(numbers);
        }
        for (int i = 0; i < myList.size(); i++) {
            int itemI = myList.get(i);
            for (int j = 0; j < myList.size(); j++) {
                int itemL = myList.get(j);
                if(itemI > itemL){
                   itemI = count;
                }

            }
            finalL.add(count);
            count ++;
        }
        for (int i = 0; i < finalL.size(); i++) {
            System.out.println(finalL.get(i) + " ");
        }

   /*     Collections.sort(myList);
        Collections.reverse(myList);
        int num = 1;

        for (int i = 0; i < myList.size(); i++) {

            System.out.print(num + " ");
            num++;
        }
     */

    }
}
