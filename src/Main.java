import com.polymorphism.Car;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Base car",8);

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());


    }
}


import java.util.Objects;

