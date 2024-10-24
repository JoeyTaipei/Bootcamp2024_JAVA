import java.util.Scanner;

public class hw3_2 {
    public static void main(String[] args) {
        int i;
        i = (int) (Math.random()*10); // 0-9 random number
        System.out.println("開始猜數字吧!");
        // read the number
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            //put the read number in j
            int j = sc.nextInt();
            if (j == i) {
                System.out.println("答對了!答案就是" + i);
                break;
            } else {
                System.out.println("猜錯囉");
            }
        }
    }
}
