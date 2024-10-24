package HW5.HW5_Extention;
//(1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//(2) Pencil實際售價為定價8折，InkBrush為定價9折

public class InkBrush extends Pen {

    public InkBrush(){
    }

    public InkBrush(String brand, int price){
        super(brand, price);
    }

    @Override
    public void write() {
        System.out.println("InkBrush writes after brushing.");
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.9;
    }
}
