package creational.builder;

public class Main {

    public static void main(String[] args) {
        Car car = new Car()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildSpeed(240)
                .build();

        Account account2 = new Account()
                .accountHolder("Andrii")
                .accountName("Hromov")
                .accountNumber(200l)
                .balance(6000000000d)
                .build();

        System.out.println(account2 + "\n" + car);
    }
}

enum Transmission {
    AUTO, MANUAL
}

class Car {

    String make = "Default";
    Transmission transmission = Transmission.MANUAL;
    int maxSpeed = 120;

    Car buildMake(String m) {
        this.make = m;
        return this;
    }

    Car buildTransmission(Transmission t) {
        this.transmission = t;
        return this;
    }

    Car buildSpeed(int s) {
        this.maxSpeed = s;
        return this;
    }

    Car build() {
        return this;
    }

    @Override
    public String toString() {
        return "Car [make = " + make + ", transmission = " + transmission + ", speed = " + maxSpeed + "]";
    }
}