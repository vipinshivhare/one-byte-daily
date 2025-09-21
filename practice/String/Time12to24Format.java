
import java.util.Scanner;



public class Time12to24Format{
    public static String convertTo24Time(String time12){
        String AmPm = time12.substring(8);
        int hour = Integer.parseInt(time12.substring(0,2));
        String minutesSecond = time12.substring(2,8);

        if(AmPm.equals("AM") && hour == 12){
            hour = 0;
        }
        else if(AmPm.equals("PM") && hour != 12){
            hour += 12;
        }
        String hourStr = String.format("%02d", hour);

        return hourStr + minutesSecond;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the correct format of time : ");
        String time12 = scanner.nextLine();
        // String time12 = "07:45:54PM";
        System.out.print("24-format time is "+convertTo24Time(time12));

        scanner.close();
    }
}