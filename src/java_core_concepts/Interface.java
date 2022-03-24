package java_core_concepts;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Interface {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("1. Rhombus");
		System.out.println("2. Triangle");
		System.out.print("Enter 1 or 2: ");
		int opt = inp.nextInt();
		
		switch(opt) {
		
		case 1:
			System.out.print("Enter length of any sides: ");
			float side = inp.nextFloat();
			
			System.out.print("Enter height of rhombus: ");
			float height = inp.nextFloat();
			
			Rhombus r = new Rhombus(side, height);
			//method of Triangle class
			r.getArea();
			//method of Polygon class
			r.getPerimeter(side, side, side, side);
			break;
			
			
		case 2:
			System.out.print("Enter 1st side length: ");
			float side1 = inp.nextFloat();
			
			System.out.print("Enter 2nd side length: ");
			float side2 = inp.nextFloat();
			
			System.out.print("Enter 3rd side length: ");
			float side3 = inp.nextFloat();
			
			Triangle t = new Triangle(side1, side2, side3);
			//method of Triangle class
			t.getArea();
			//method of Polygon class
			t.getPerimeter(side1, side2, side3);
			break;
			
			
		default:
			System.out.print("Enter 1 or 2");
			break;
			
		}

	}

}


interface Polygon{
	//Abstract method
	void getArea();
	
	//Default method
	default void getPerimeter(float ...sides) {
		float perimeter = 0;
		
		for(float side : sides) {
			perimeter += side;
		}
		
		System.out.println("Perimeter: " + perimeter);
	}
}


class Rhombus implements Polygon{
	
	private float base, height, area;
	
	//Initializing base value
	Rhombus(float b, float h){
		this.base = b;
		this.height = h;
	}
	
	public void getArea() {
		area = base * height;
		System.out.println("Area: " + area);
	}
	
}


class Triangle implements Polygon{
	
	private float a, b, c;
	private double s, area;
	
	//Initializing sides value
	Triangle(float x, float y, float z){
		this.a = x;
		this.b = y;
		this.c = z;
	}
	
	public void getArea() {
		s = (double) (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		final DecimalFormat df = new DecimalFormat(".0000");
		System.out.println("Area: " + df.format(area));		
	}
	
}







