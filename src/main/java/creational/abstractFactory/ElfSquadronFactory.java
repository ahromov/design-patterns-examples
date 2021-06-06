package creational.abstractFactory;

public class ElfSquadronFactory extends SquadronFactory {

	public Mage createMage() {
		return new ElfMage();
	}

	public Archer createArcher() {
		return new ElfArcher();
	}

	public Warrior createWarrior() {
		return new ElfWarrior();
	}

}

class ElfMage implements Mage {

	public void cast() {
		System.out.println("Magic is used");
	}

}

class ElfArcher implements Archer {

	public void shoot() {
		System.out.println("Archer is shooting");
	}

}

class ElfWarrior implements Warrior {

	public void attack() {
		System.out.println("Warrior attack !");
	}

}
