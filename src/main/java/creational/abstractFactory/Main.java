package creational.abstractFactory;

public class Main {

	public static void main(String[] args) {
		ElfSquadronFactory elfSquadronFactory = new ElfSquadronFactory();
		createSquadron(elfSquadronFactory);
	}

	public static void createSquadron(SquadronFactory factory) {
		Mage mage = factory.createMage();
		mage.cast();
		Archer archer = factory.createArcher();
		archer.shoot();
		Warrior warrior = factory.createWarrior();
		warrior.attack();
	}

}
