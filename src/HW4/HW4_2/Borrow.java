package HW4.HW4_2;
import java.util.Scanner;
import java.util.ArrayList;

public class Borrow {
    public static void main(String[] args) {
        int x[][] ={
                {25,2500},
                {32,800},
                {8,500},
                {19,1000},
                {27,1200}
        };
        System.out.println("Please enter the amount of money you want to borrow: ");
        Scanner sc = new Scanner(System.in);
        int borrow = sc.nextInt();

        ArrayList<Integer> n = new ArrayList<>();

        for (int i=0;i<x.length;i++) {
            if (x[i][1] >= borrow){
                n.add(x[i][0]);
            }
        }
        System.out.println("有錢可借的員工編號: " + n +" 共 "+n.size()+" 人!");
    }
}
