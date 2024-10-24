package HW6;

public class Calculator {
    public int powerXY(int x, int y) throws CalException{
        //x與y同時為0，(產生自訂的CalException例外物件)
        //y為負值，而導致x的y次方結果不為整數
        //x與y皆正確情況下，會顯示運算後結果
        if (x == 0 && y==0) {
            throw new CalException("x and y can't both be 0.");
        } else if (y <0 && x==0) {
            throw new CalException("negative power of 0 is meaningless");
        } else if (y < 0) {
            throw new CalException("y should be a non-negative integer.");
        } else {
            return (int) Math.pow(x, y);
        }
    }
}

