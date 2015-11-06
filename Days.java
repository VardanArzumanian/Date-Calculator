import java.util.*;
public class Days {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the day using an integer (Sunday is 0, Monday is 1... Saturday is 6).");
        int dayIn;
        dayIn = input.nextInt();
        System.out.println("Enter the number of days after today for a future day.");
        int numOfDays;
        numOfDays = input.nextInt();
        int finalDay;
        finalDay = (dayIn + numOfDays) % 7;
        
        switch (finalDay) {
            case 0:
                System.out.println("That day is Sunday");
                break;
            case 1:
                System.out.println("That day is Monday");
                break;
            case 2:
                System.out.println("That day is Tuesday");
                break;
            case 3:
                System.out.println("That day is Wednesday");
                break;
            case 4:
                System.out.println("That day is Thursday");
                break;
            case 5:
                System.out.println("That day is Friday");
                break;
            case 6:
                System.out.println("That day is Saturday");
                break;
            default:
                break;
        }
        
    }
    
}
