import java.util.Scanner;

public class SwitchWeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number corresponding to the Week days : ");
        int dayNo = sc.nextInt();

        String whichDay;

        switch (dayNo) {
            case 1:
                whichDay = "Sunday";
                break;
            case 2:
                whichDay = "Monday";
                break;
            case 3:
                whichDay = "Tuesday";
                break;
            case 4:
                whichDay = "Wednesday";
                break;
            case 5:
                whichDay = "Thursday";
                break;
            case 6:
                whichDay = "Friday";
                break;
            case 7:
                whichDay = "Saturday";
                break;
            default:
                whichDay = "Invalid input, Please enter a number between 1 and 7";
        }

        System.out.println(whichDay);

    }
}
