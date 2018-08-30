//There are two things that cats love most: 1) sleeping and 2) attending beauty contests.
// The most important thing for each female cat is the contest “Miss Cat”.
// There are always ten cats that participate in the final round of the contest, numbered 1 to 10.
//The jury of the contest consists of N people who subjectively decide which cat to vote for.
// In other words each person votes for just 1 cat that he has most liked, or from whose owner
// he has received the biggest bribe. The winner of the contest is the cat that has gathered most votes.
// If two cats have equal votes, the winner of the contest is the one whose number is smaller.
//Your task is to write a computer program that finds the number of the cat that is going to win the contest “Miss cat”

import java.util.Scanner;

public class MissCat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int max = 0;
        int result = 0;
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        // if (numbers.length == 1){
        //System.out.println(numbers[0]);
        //}
        for (int i = 0; i < numbers.length; i++) {
        int currentValue = numbers[i];
        if( max < currentValue){
            max = currentValue;
            result = i;
        }
    }
        System.out.println(result);
}
}
