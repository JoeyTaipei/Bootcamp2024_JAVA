package HW5.HW5_4;
//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合: 本次隨機產生驗證碼為: ________

import java.util.Random;

public class RandomString {
    //define code
    private static final String CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    //method
    public static String genAuthCode() {
        //generate 8 random number for the index
        Random random = new Random();
        int[] index = new int[8];
        int length = CHAR_SET.length();
        for (int i=0;i<8;i++){
            index[i] = random.nextInt(length); //0- (length-1)
        }

        //get the value from the index
        String authCode = "";
        for (int i=0;i<8;i++){
            authCode += CHAR_SET.charAt(index[i]);
        }
        //return code after for loop
        return authCode;
    }


    public static void main(String[] args) {
        //call the method
        String authCode = genAuthCode();
        System.out.println("本次隨機產生驗證碼為: " + genAuthCode());
    }

}















