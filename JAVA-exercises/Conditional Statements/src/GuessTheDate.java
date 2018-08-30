/* Gancho works in a factory. He is a diligent worker and he always finish his tasks on time.
On the other side Gancho is a football fan and goes regularly on the matches of his favorite
team which is Simitli. Just sayin', continue to the task below.
By a provided date (year, month, day), calculate the day before.
*/

import java.util.Scanner;

public class GuessTheDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();

        String monthString = " ";
        int previuosDay = day - 1;

        switch (month) {
            case 1:  monthString = "Jan";
                break;
            case 2:  monthString = "Feb";
                break;
            case 3:  monthString = "Mar";
                break;
            case 4:  monthString = "Apr";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "Jun";
                break;
            case 7:  monthString = "Jul";
                break;
            case 8:  monthString = "Aug";
                break;
            case 9:  monthString = "Sep";
                break;
            case 10: monthString = "Oct";
                break;
            case 11: monthString = "Nov";
                break;
            case 12: monthString = "Dec";
                break;
            default: monthString = "Invalid month";
                break;
        }

        if (previuosDay == 0 && monthString == "Jan"){
            previuosDay = 31;
            monthString = "Dec";
            year -= 1;
        }else if (previuosDay == 0 && monthString == "Feb"){
            previuosDay = 31;
            monthString = "Jan";
        }else if(previuosDay == 0 && monthString == "Mar"){
            previuosDay = 31;
            monthString = "Feb";
        }else if (previuosDay == 0 && monthString == "Apr"){
            previuosDay = 31;
            monthString = "Mar";
        }else if (previuosDay == 0 && monthString == "May"){
            previuosDay = 31;
            monthString = "Apr";
        }else if(previuosDay == 0 && monthString == "Jun"){
            previuosDay = 31;
            monthString = "May";
        }else if(previuosDay == 0 && monthString == "Jul"){
            previuosDay = 31;
            monthString = "Jun";
        }else if(previuosDay == 0 && monthString == "Aug"){
            previuosDay = 31;
            monthString = "Jul";
        }else if (previuosDay == 0 && monthString == "Sep"){
            previuosDay = 31;
            monthString = "Aug";
        }else if (previuosDay == 0 && monthString == "Oct"){
            previuosDay = 31;
            monthString = "Sep";
        }else if(previuosDay == 0 && monthString == "Nov"){
            previuosDay = 31;
            monthString = "Oct";
        }else if(previuosDay == 0 && monthString == "Dec"){
            previuosDay = 31;
            monthString = "Nov";
        }

        System.out.println(previuosDay + "-" + monthString + "-" + year);

    }
}
