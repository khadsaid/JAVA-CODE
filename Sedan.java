public class Sedan extends car{
    private int length;
    public  Sedan(int speed,double regularPrice,String color,int length){
        super(speed,regularPrice,color);
        this.length=length;
    }
    public double getSalePrice(){
        if (length>20){
            return super.getSalePrice()-(0.05 * super.getSalePrice());
        }else{
            return super.getSalePrice()-(0.1 * super.getSalePrice());
        }
    }
}