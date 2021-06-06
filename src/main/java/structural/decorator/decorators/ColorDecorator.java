package structural.decorator.decorators;

import structural.decorator.objects.Component;

public class ColorDecorator extends Decorator {

	public ColorDecorator(Component component) {
		super(component);
	}

	public void afterDraw() {
		System.out.println("... add color");
	}
	
}
