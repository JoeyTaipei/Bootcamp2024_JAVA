import java.util.Scanner;

public class hw3_3 {
    public static void main(String[] args) {
        int x;
        System.out.println("阿文...請輸入 1~ 9 你討厭哪個數字? ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int count = 0;
        for (int i=1;i<=49;i++) {
            // check if 'i' contains 'x'
            if (String.valueOf(i).contains(String.valueOf(x))){
                continue;
            } else {
                System.out.print(i + "\t");
                count ++;
            }
            //change line every 6 number
            if (count % 6 == 0) {
                System.out.println();
            }
        }
        System.out.println("總共有" + count + "數字可選");
    }
}
