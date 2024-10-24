package HW5.HW5_2;

public class OverLoad {
    public static void main(String[] args) {
        int[][] intArray = {
                {1, 6, 3},
                {9, 5, 2}
        };
        double[][] doubleArray = {
                {1.2, 3.5, 2.2},
                {7.4, 2.1, 8.2}
        };
        OverLoad o1 = new OverLoad();
        System.out.println(o1.maxElement(intArray));   // Output: 9
        System.out.println(o1.maxElement(doubleArray)); // Output: 8.2
    }

    // Method for int[][] arrays
    public int maxElement(int[][] x){
        int max = 0;  // Initialize to the smallest possible int value
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > max) {
                    max = x[i][j];  // Update max if current element is larger
                }
            }
        }
        return max;
    }

    // Method for double[][] arrays
    public double maxElement(double[][] x) {
        double max = 0.0;  // Initialize to the smallest possible double value
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > max) {
                    max = x[i][j];  // Update max if current element is larger
                }
            }
        }
        return max;
    }
}

