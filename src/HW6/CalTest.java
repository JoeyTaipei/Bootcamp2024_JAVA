package HW6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        try {
            // User Enter
            System.out.println("Enter value for x: ");
            int x = sc.nextInt();
            System.out.println("Enter value for y: ");
            int y = sc.nextInt();

            //power calculation
            int result = cal.powerXY(x,y);
            System.out.println(x + "的" + y + "次方等於" + result);
        } catch (CalException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("An unexpected error occured: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
