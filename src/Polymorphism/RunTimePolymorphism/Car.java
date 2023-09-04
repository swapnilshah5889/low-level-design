package Polymorphism.RunTimePolymorphism;

public class Car implements Comparable<Car> {
    int price;
    int speed;
    Car(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString(){
        return "("+this.price+", "+this.speed+") ";
    }

    @Override
    public int compareTo(Car c) {
        return this.price - c.price;
    }
}
