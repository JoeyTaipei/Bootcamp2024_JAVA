package HW4.HW4_1;

public class reverse {
    public static void main(String[] args) {
        String s = "Hello World";

        for (int i=s.length()-1; i>=0;i--) {
            char a = s.charAt(i);
            System.out.print(a);
        }
    }
}
