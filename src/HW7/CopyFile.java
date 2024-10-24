package HW7;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        //file path
        String srcFilePath = "C:/Users/e6499/Desktop/TIA104_Homework_23/HW7/source.txt";
        String destFilePath = "C:/Users/e6499/Desktop/TIA104_Homework_23/HW7/destination.txt";

        try {
            copyFile(srcFilePath, destFilePath);
            System.out.println("檔案複製成功");
        } catch (IOException e) {
            System.out.println("檔案複製時發生錯誤: " + e.getMessage());
        }

    }

    //copyFile method
    public static void copyFile (String src, String dest) throws IOException {
        File sourceFile = new File(src);
        File destinationFile = new File(dest);

        //check source file exists
        if (!sourceFile.exists()) {
            throw new IOException("源檔案不存在: " + src);
        }
        //Using try-with-resources for automatic resource management
        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream(destinationFile);
                BufferedOutputStream bos = new BufferedOutputStream(fos);)
        {
            byte[] buffer = new byte[1024]; //byte array
            int bytesRead;

            // read file and write to destination
            while((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer,0,bytesRead);
            }
        } catch (IOException e) {
            throw new IOException("檔案寫入時發生錯誤: " + e.getMessage());
        }

    }
}