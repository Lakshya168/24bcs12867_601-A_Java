abstract class Vehicle {

    abstract void start();
    abstract void stop();
    abstract int getSpeed();

    void fuelType() {
        System.out.println("Uses petrol or diesel");
    }

    void wheels() {
        System.out.println("Has wheels for movement");
    }
}


class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with a key");
    }

    void stop() {
        System.out.println("Car stops using brakes");
    }

    int getSpeed() {
        return 120;
    }
}

public class class_java {
    public static void main(String[] args) {
        Vehicle v = new Car();

        v.start();
        v.fuelType();
        v.wheels();
        System.out.println("Speed: " + v.getSpeed());
        v.stop();
    }
}
