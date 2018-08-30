/*
You are given a sequence of the speeds of cars in a single-lane street.
A car can catch up to the car B, only if B is in front of A and the speed
of A is greater than the speed of B, and then the speed of A is lowered
to the speed of B. Each gathering of cars is called a group. Your task
is to find the sum of the initial speeds of the longest group of cars
(the group with most cars in it). If more than one group with equal length exists,
then find the biggest sum of the initial speeds of these groups.

Additional notes
Cars cannot outrun each other
They can only catch up
The street is very very long and no matter the speed
No car with any speed can get out of it until the end of the exam
Cars with equal speeds do not catch up to each other
They do not form a group
 */
import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int groupSpeed = scanner.nextInt();

        int groupLenght = 1;
        int groupSum = groupSpeed;

        int bestLenght = 1;
        int bestSum = groupSum;

        for(int i = 0; i < n -1; i ++){
            int speed = scanner.nextInt();

            if(groupSpeed < speed){
                groupLenght ++;
                groupSum += speed;
            } else {
                groupSpeed = speed;
                groupSum = speed;
                groupLenght = 1;
            }
            if (bestLenght < groupLenght){
                bestLenght = groupLenght;
                bestSum = groupSum;
            }else if (bestLenght == groupLenght){
                bestSum = Math.max(bestSum, groupSum);
            }
        }
        System.out.println(bestSum);
    }
}
