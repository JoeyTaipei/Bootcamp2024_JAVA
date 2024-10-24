package HW5.HW5_1;

import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
        System.out.println("請輸入寬與高:");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        starSquare(width,height);

    }
//create a static method, without creating an object
    public static void starSquare(int width, int height) {
        for(int i=0;i<height;i++) {
            for (int j=0;j<width;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

