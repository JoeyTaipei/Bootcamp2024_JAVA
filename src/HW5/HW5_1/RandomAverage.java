package HW5.HW5_1;
import java.util.Random;

public class RandomAverage {
    public static void main(String[] args) {
        randAvg(10);
    }

    public static void randAvg(int n) {
        Random r1 = new Random();
        int x[] = new int[n];
        int sum = 0;
        for (int i=0;i<n;i++) {
            x[i] = r1.nextInt(101);
        }
        System.out.print("本次亂數結果: ");

        for(int i=0;i<n;i++){
            System.out.print(x[i] +"\t");
            sum+= x[i];
        }
        System.out.println();
        int avg = sum/n;
        System.out.println("平均: " + avg);
    }
}
