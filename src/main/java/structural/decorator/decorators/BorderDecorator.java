package structural.decorator.decorators;

import structural.decorator.objects.Component;

public class BorderDecorator extends Decorator {

	public BorderDecorator(Component component) {
		super(component);
	}

	public void afterDraw() {
		System.out.println("... add border");
	}
	
}
