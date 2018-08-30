/*
Now that you have successfully built the staircases, you need to design the walls for the first skyscraper in Sofia.
And again, in order to make the building look more fancy and disobay the 'walls' of physics, each wall will have a
different height.
The walls are a sequence of N-amount of integers that represent each wall's height, that can be either positive or
negative.That sequence will be given to you in the input. You need to use it in order to calculate the space between
each of the walls.For example, you are given the sequence 2 7 4 12 6 4 4. In order to calculate the distance between
each of the walls, you need to find the absolute difference between their heights.
Absolute difference between two integer numbers A and B is the difference of the larger between A and B minus the
smaller between A and B. Examples:

Absolute difference between 6 and 2 is 4 (6 – 2 = 4)
Absolute difference between -4 and 4 is 8 (-4 – 4 = 8
Knowing that, our example becomes: 2 5734812662404. Now, that seems a bit too complicated, no? Lets make it easier.
Instead of finding each distance between the walls, we will do some hopping around. Let me give you a hint so it's
even easier. Start from the second wall's height. Then find the distance between the current wall and the previous wall.

If the distance is an odd number, move one positions to the right.
If the distance is an even number, move two positions to the right.
Knowing that, our example becomes: 25734812skipped624skipped4, which results in 25734812062404. Now, to make things
even more simple, we need to find the sum of the even distances between the walls. In this example, the only even ones
are between the walls with height 4 and 12 and the walls with heigth 6 and 4.
That means that we need to sum 8 + 2. Therefore, we output 10.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CrookedWalls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numbers = in.nextLine();

        List<String> nums = new ArrayList<String>(Arrays.asList(numbers.split(" ")));
        List<Long> numsInt = new ArrayList<Long>();
        List<Long> numsDiff = new ArrayList<Long>();
        long absoluteDiff = 0;
        long evenDistance = 0;

        for (int i = 0; i < nums.size(); i++) {
            long currentNum = Long.parseLong(nums.get(i));
            numsInt.add(currentNum);
        }

        for (int l = 1; l < numsInt.size(); l++) {
            absoluteDiff = numsInt.get(l) - numsInt.get(l - 1);
            if (absoluteDiff % 2 == 0) {
                l++;
            }
            if (absoluteDiff < 0) {
                absoluteDiff = -absoluteDiff;
            }
            numsDiff.add(absoluteDiff);
        }
        for (int i = 0; i < numsDiff.size(); i++) {
            long value = numsDiff.get(i);
            if (value % 2 == 0) {
                evenDistance += numsDiff.get(i);
            }
        }
        System.out.println(evenDistance);
    }
}
