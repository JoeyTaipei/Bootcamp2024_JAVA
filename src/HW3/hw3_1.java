import java.util.Scanner;
import java.util.Arrays;

public class hw3_1 {
    public static void main(String[] args) {
        int[] x = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 integers: ");
        // read the number
        for(int i=0;i<x.length;i++){
            // keep reading until we have enough number
            while (true) {
                if(sc.hasNextInt()) {
                    x[i] = sc.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer: ");
                    sc.next(); //clear the invalid input
                }
            }
        }

        for(int i=0;i<x.length;i++) {
            System.out.print(x[i] + "\t");
        }

        Arrays.sort(x);

        int a = x[0];
        int b = x[1];
        int c = x[2];

        if (a <= 0 || b <= 0 || c <= 0 || a+b <= c) {
            System.out.println("不是三角形");
        }else if (a==b && b==c) {
            System.out.println("正三角形");
        } else if (a == b || b == c) {
            System.out.println("等腰三角形");
        } else if (Math.pow(a,2)+Math.pow(b,2)== Math.pow(c,2)) {
            System.out.println("直角三角形");
        } else {
            System.out.println("其他三角形");
        }
    }
}
