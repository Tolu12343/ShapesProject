package AShape;

public class Circle extends AShape implements ShapeCalculating {
	public double radius;
	public static int count;
  public Circle( int id, double radius) {
	   this.radius = radius;
	   this.name = "Circle";
	   this.vertices = 0;
	   this.id = id;
	   this.count +=1;
  }

@Override
public double areacal() {
	this.area = Math.PI * (Math.pow(this.radius, 2));
	return this.area;
}

@Override
public double perimeterCal() {
	this.perimeter = Math.PI *this.radius*2;
	return this.perimeter;
}
}
