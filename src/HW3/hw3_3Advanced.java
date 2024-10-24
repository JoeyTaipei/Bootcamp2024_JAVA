import java.util.*;

public class hw3_3Advanced {
    public static void main(String[] args) {
        int x;
        System.out.println("阿文...請輸入 1~ 9 你討厭哪個數字? ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        ArrayList<Integer> validNumbers = new ArrayList<>();
        Random rand = new Random();

        // Collect all valid numbers (without the disliked digit)
        for (int i = 1; i <= 49; i++) {
            if (!String.valueOf(i).contains(String.valueOf(x))) {
                validNumbers.add(i);
            }
        }

        // Pick 6 unique random numbers from the valid numbers list
        System.out.println("隨機 6 個數字 (不包含你討厭的數字):");
        for (int i = 0; i < 6; i++) {
            int randomIndex = rand.nextInt(validNumbers.size());
            System.out.print(validNumbers.get(randomIndex) + "\t");
            validNumbers.remove(randomIndex); // Remove to avoid duplicates
        }
    }
}
