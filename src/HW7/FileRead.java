package HW7;
//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        //sample.txt 檔案路徑
        File file = new File("C:/Users/e6499/OneDrive/Desktop/TIA104_Homework_23/Sample.txt");

        long byteCount = 0;
        int charCount = 0;
        int lineCount = 0;

        try {
            //檔案的大小（以 byte 為單位）
            byteCount = file.length();
            // read file
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);

            String line;
            while ((line = bf.readLine()) != null) {
                charCount += line.length();
                lineCount++;
            }
            bf.close();

            // Output
            System.out.println("Sample.txt檔案有: " +
                                byteCount + " 個位元組，" +
                                charCount + " 個字元，" +
                                lineCount + " 列資料");

        } catch (IOException e) {
            System.out.println("檔案讀取錯誤: " + e.getMessage());
        }
    }
}


