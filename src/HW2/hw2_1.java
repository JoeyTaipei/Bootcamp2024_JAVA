package HW2;

public class hw2_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<=1000;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("sum of 1-1000 is: " + sum);

        System.out.println("--------------------------");
        int product=1;
        for (int i=1;i<=10;i++) {
            product*=i;
        }
        System.out.println("product of 1-100 is: "+ product);

        System.out.println("--------------------------");
        int p2=1;
        int count =1;
        while(count<=10) {
            p2 *= count;
            count++;
        }
        System.out.println("product of 1-100 is: " + p2);

        System.out.println("--------------------------");
        int a;
        for (int i=1;i<=10;i++) {
            a = (int) Math.pow(i,2);
            System.out.print(a+"\t");
        }
    }
}
