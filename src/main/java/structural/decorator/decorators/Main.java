package structural.decorator.decorators;

import structural.decorator.objects.Component;
import structural.decorator.objects.Window;

public class Main {

	public static void main(String[] args) {
		Component windowWithBorder = new BorderDecorator(new Window());
		windowWithBorder.draw();

		Component windowWithBorderAndColor = new ColorDecorator(new BorderDecorator(new Window()));
		windowWithBorderAndColor.draw();
	}

}
