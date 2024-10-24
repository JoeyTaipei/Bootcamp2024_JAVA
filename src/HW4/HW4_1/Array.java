package HW4.HW4_1;
//Q: 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        int avg = sum / intArray.length;
        System.out.println("Average is " + avg);

        //Elements greater than average, using ArrayList
        ArrayList<Integer> bigger = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > avg) {
                bigger.add(intArray[i]);
            }
        }

        System.out.println("Numbers greater than the average: " +bigger);

    }
}
