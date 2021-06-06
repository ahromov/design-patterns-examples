package creational.singleton;

public class Main {

	public static void main(String[] args) {

		TestSingleton instance = TestSingleton.getInstance();
		TestSingleton instance2 = TestSingleton.getInstance();

		System.out.println(instance == instance2);
	}
}
