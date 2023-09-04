package Polymorphism.RunTimePolymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add( new Car(1000, 250));
        carList.add( new Car(2300, 230));
        carList.add( new Car(4500, 350));
        carList.add( new Car(900, 190));
        carList.add( new Car(6700, 180));
        carList.add( new Car(3400, 195));

        Collections.sort(carList);
        System.out.println(carList);
    }
}
