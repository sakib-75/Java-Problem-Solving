package java_core_concepts;

//That is, the same entity (method or operator or object) 
//can perform different operations in different scenarios
public class Polymorphism {

	public static void main(String[] args) {
		
		Shape sq, cr;
		
		sq = new Square(); //object of square
		sq.render();
		
		cr = new Circle(); //object of circle
		cr.render();

	}

}

class Shape{
	public void render() {
		System.out.println("Rendering shape");
	}
}

class Square extends Shape{
	public void render() {
		System.out.println("Rendering square");
	}
}

class Circle extends Shape{
	public void render() {
		System.out.println("Rendering circle");
	}
}

