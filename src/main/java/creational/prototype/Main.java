package creational.prototype;

public class Main {

	public static void main(String[] args) {

		Human original = new Human(18, "Oleg");
		System.out.println(original);

		Human copy = (Human) original.copy();
		System.out.println(copy);
	}

}

interface Copyable {

	Object copy();

}

class Human implements Copyable {

	int age;
	String name;

	public Human(int age, String name) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [age = " + age + ", name = " + name + "]";
	}

	public Object copy() {
		Human copy = new Human(age, name);
		return copy;
	}

}