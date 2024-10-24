package HW4.HW4_3;
import java.util.Scanner;

public class Dayofyear {
    public static void main(String[] args) {
        System.out.println("Please enter three integers, for the year, month, and day:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        int n = 0;
        boolean isLeapYear = false;
        if (year %4 == 0 || year%100 !=0 || year % 400 == 0) {
            isLeapYear = true;
        }

        switch(month) {
            case 1:
                if  (day > 31){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= day;
                    break;
                }
            case 2:
                if  (day > 29){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31 + day;
                    break;
                }
            case 3:
                if  (day > 31){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31 + (isLeapYear? 29 :28) + day;
                    break;
                }
            case 4:
                if  (day > 30){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31+ (isLeapYear? 29 :28) + 31 + day;
                    break;
                }
            case 5:
                if  (day > 31){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31 + (isLeapYear? 29 :28) + 31 + 30 + day;
                    break;
                }
            case 6:
                if  (day > 30){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31 + (isLeapYear? 29 :28) + 31 + 30 + 31 + day;
                    break;
                }
            case 7:
                if  (day > 31){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31 + (isLeapYear? 29 :28) + 31 + 30 + 31 + 30 + day;
                    break;
                }
            case 8:
                if  (day > 31){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31 + (isLeapYear? 29 :28) + 31 + 30 + 31 + 30 + 31+  day;
                    break;
                }
            case 9:
                if  (day > 30){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31 + (isLeapYear? 29 :28) + 31 + 30 + 31 + 30 + 31+ 31 + day;
                    break;
                }
            case 10:
                if  (day > 31){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31 + (isLeapYear? 29 :28) + 31 + 30 + 31 + 30 + 31+ 31 + 30 + day;
                    break;
                }
            case 11:
                if  (day > 31){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31 + (isLeapYear? 29 :28) + 31 + 30 + 31 + 30 + 31+ 31 + 30 + 31 + day;
                    break;
                }
            case 12:
                if  (day > 31){
                    System.out.println("Please enter the right day");
                    return;
                } else{
                    n+= 31 + (isLeapYear? 29 :28) + 31 + 30 + 31 + 30 + 31+ 31 + 30 + 31 + 30 + day;
                    break;
                }
            default:
                System.out.println("Invalid month");
                return;
        }
        System.out.println("輸入的日期為該年第"+ n + "天");
    }
}


/*
public class DayOfYear {
    public static void main(String[] args) {
        System.out.println("Please enter three integers for the year, month, and day:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        // Determine if it's a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Array for days in each month (index 0 is ignored for convenience)
        int[] daysInMonth = {0, 31, (isLeapYear ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Validate month and day input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
            return;
        }

        if (day < 1 || day > daysInMonth[month]) {
            System.out.println("Invalid day for the given month.");
            return;
        }

        // Calculate the day of the year
        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;

        // Output the result
        System.out.println("The entered date is day number " + dayOfYear + " of the year.");
    }
}
 */
