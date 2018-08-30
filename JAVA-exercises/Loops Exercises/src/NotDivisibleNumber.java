/*
 Write a program that reads from the console a positive
 integer N and prints all the numbers from 1 to N not divisible
 by 3 or 7, on a single line, separated by a space.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotDivisibleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Integer> inArr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if(i % 3 == 0 || i % 7 == 0){
                //skip this num
            }else{
                inArr.add(i);
            }
        }
        for (int i = 0; i < inArr.size(); i++) {
            System.out.print(inArr.get(i) + " ");
        }

    }

}
