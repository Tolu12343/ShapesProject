package AShape;

public class Rectangle extends AShape implements ShapeCalculating{
	public double length;
	public double breadth;
	public static int  counter;
       public Rectangle (int id, double length, double breadth) {
    	   this.length = length;
    	   this.breadth = breadth;
    	   this.name = "Rectangle";
    	   this.vertices = 4;
    	   this.id = id;
    	   this.counter +=1;
       }
	@Override
	public double areacal() {
		this.area = this.length * this.breadth;
		return this.area;
	}
	@Override
	public double perimeterCal() {
		this.perimeter = (this.length)*2 + (this.breadth)*2;
		return this.perimeter;
	}
       
}
