package HW4.HW4_4;

public class TwoDimArray {
    public static void main(String[] args) {
        int quiz[][] = {
                {10, 37, 100, 77, 98, 90},
                {35, 75, 70, 95, 70, 80},
                {40, 77, 79, 70, 89, 100},
                {100, 89, 90, 89, 90, 75},
                {90, 64, 75, 60, 75, 50},
                {85, 75, 70, 75, 90, 20},
                {75, 70, 79, 85, 89, 99},
                {70, 95, 90, 89, 90, 75}
        };

        int[] highestCount = new int[8];

        for (int j = 0; j < 6; j++) {
            int maxScore = 0;
            int maxIndex = 0;
            for (int i=0;i<quiz.length;i++){
                if (quiz[i][j] > maxScore){
                    maxScore = quiz[i][j];
                    maxIndex = i;
                }
            }
            highestCount[maxIndex]++;
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Student " + (i + 1) + " had the highest score " + highestCount[i] + " times.");
        }
    }
}


