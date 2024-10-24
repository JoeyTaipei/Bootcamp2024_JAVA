package HW5.HW5_Extention;
//多型操作，當共同呼叫write()方法與getPrice()方法，
//各種筆都可正確顯示write內容與售價金額
public class WriteWithPen {
    public static void main(String[] args) {
        Pen pencil1 = new Pencil("SKB",20);
        Pen inkbr1 = new InkBrush("LKK",25);

        pencil1.write();
        inkbr1.write();

        System.out.println(pencil1.getBrand() + "pencil1 price: " + pencil1.getPrice());
        System.out.println(inkbr1.getBrand() + "inkbrush1 price: " + inkbr1.getPrice());
    }
}
