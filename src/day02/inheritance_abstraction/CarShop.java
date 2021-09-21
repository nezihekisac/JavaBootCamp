package day02.inheritance_abstraction;

public class CarShop { // CarShop Has A Tesla

    public static void main(String[] args) {

        Tesla tesla = new Tesla(2021,"Model 3", "White", 40000 );

        BMW bmw = new BMW(2020, "X6", "Red", 45000);

        System.out.println(tesla);
        System.out.println(bmw);


    }
}
