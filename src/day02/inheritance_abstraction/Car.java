package day02.inheritance_abstraction;

public class Car {

    public int year;
    public String make, model, color;
    public double price;

    public Car(int year, String make, String model, String color, double price) { // initializes instances
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void drive(){
        System.out.println("Driving "+make+" "+model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
