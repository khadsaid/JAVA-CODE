public class Ford extends car{
    private int year;
    private int manufacutureDiscount;
    public Ford (int speed,double regularPrice,String color, int year,int manufacutureDiscount){
        super(speed,regularPrice,color);
        this.year=year;
        this.manufacutureDiscount=manufacutureDiscount;
    }
    public double getSalePrice(){
        return (super.getSalePrice()-manufacutureDiscount);
    }

}