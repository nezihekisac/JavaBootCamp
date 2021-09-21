package day02.inheritance_abstraction;

public final class Tesla extends Car{ // Tesla Is A Car

    public Tesla(int year, String model, String color, double price) {
        super(year,"Tesla", model, color, price);
    }


    public void start() {
        System.out.println("Say start");
    }
}
