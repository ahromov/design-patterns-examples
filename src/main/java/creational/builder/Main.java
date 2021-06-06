package creational.builder;

public class Main {
	public static void main(String[] args) {
		Car car = new CarBuilder().buildMake("Mercedes").buildTransmission(Transmission.AUTO).buildSpeed(240).build();

		System.out.println(car);
	}
}

enum Transmission {
	AUTO, MANUAL
}

class Car {
	
	String make = "Default";
	Transmission transmission = Transmission.MANUAL;
	int maxSpeed = 120;

	public void setMake(String make) {
		this.make = make;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public String toString() {
		return "Car [make = " + make + ", transmission = " + transmission + ", speed = " + maxSpeed + "]";
	}
}

class CarBuilder {
	
	String m;
	Transmission t;
	int s;

	CarBuilder buildMake(String m) {
		this.m = m;
		return this;
	}

	CarBuilder buildTransmission(Transmission t) {
		this.t = t;
		return this;
	}

	CarBuilder buildSpeed(int s) {
		this.s = s;
		return this;
	}

	Car build() {
		Car car = new Car();
		car.setMake(m);
		car.setTransmission(t);
		car.setMaxSpeed(s);
		return car;
	}
	
}