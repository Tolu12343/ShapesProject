package Main;

import java.util.ArrayList;

import AShape.AShape;
import AShape.Circle;
import AShape.Rectangle;

public class Main {
public static void main(String[] args) {
	
	Rectangle firstRectangle = new Rectangle(1, 10, 10);
	System.out.println(firstRectangle.counter);
	Circle firstCircle = new Circle(1, 10);
	Rectangle secondRectangle = new Rectangle(2, 20, 10);
	Circle secondCircle = new Circle(2, 10);
	
	ArrayList<AShape> shapeList = new ArrayList<>();
	shapeList.add(firstRectangle);
	shapeList.add(firstCircle);
	shapeList.add(secondCircle);
	shapeList.add(secondRectangle);
	System.out.println(Circle.count);
	System.out.println(Rectangle.counter);
	for(AShape element : shapeList) {
		if(element instanceof Rectangle ) {
			Rectangle r1 = (Rectangle) element;
			System.out.println("The area of " + element.name + " with " + " id " + element.id + " is " + r1.areacal());
			System.out.println("The perimeter of " + element.name + " with " + " id " + element.id + " is " + r1.perimeterCal());
		}
		if(element instanceof Circle ) {
			Circle c1 = (Circle) element;
			System.out.println("The area of " + element.name + " with " + " id " + element.id + " is " + c1.areacal());
			System.out.println("The perimeter of " + element.name + " with " + " id " + element.id + " is " + c1.perimeterCal());
		}
		
		
	}

	
}

}
