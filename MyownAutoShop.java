public class MyownAutoShop{
    (int speed,double regularPrice,String color, int year,int manufacutureDiscount)
    public static void main(String[]args){
        Sedan sedan1 =new Sedan (200,2500.0,"blue",20);
        Ford Ford1= new Ford (300,56.00,"pink",2022,30);
        Ford Ford2=new Ford(36,498.00,"yellow",2023,45);
        Car car1=new Car(45,99.9,"white");


        system.out.println("sedan price is" sedan1.getSalePrice());
         system.out.println("ford1 price is" ford1.getSalePrice());
          system.out.println("ford2 price is" ford2.getSalePrice());
           system.out.println("car price is" car1.getSalePrice());
    }
}