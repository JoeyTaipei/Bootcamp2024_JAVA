package HW7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class NumToFile {
    public static void main(String[] args) {
        // file name
        Random rn = new Random();
        String filePath = "C:/Users/e6499/Desktop/OneDrive/Desktop/TIA104_Homework_23/src/HW7/Data.txt/";

        try {
            FileWriter fw = new FileWriter (filePath, true);

            BufferedWriter bw = new BufferedWriter(fw);

            PrintWriter pw = new PrintWriter(bw);

            //generate 10 of 1-1000 random number and write into the file
            for(int i=0; i<10;i++){
                int num = rn.nextInt(1000)+1; // 產生 1-1000 的隨機數
                pw.write(num + "\t");
            }

            pw.close();

        } catch (IOException e){
            System.out.println("檔案寫入時發生錯誤: " + e.getMessage());
        }
    }
}


