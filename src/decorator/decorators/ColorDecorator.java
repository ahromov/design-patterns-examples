package decorator.decorators;

import decorator.objects.Component;

public class ColorDecorator extends Decorator {

	public ColorDecorator(Component component) {
		super(component);
	}

	public void afterDraw() {
		System.out.println("... add color");
	}
	
}
