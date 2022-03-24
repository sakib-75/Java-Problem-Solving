package java_core_concepts;

public class AbstractClass {

	public static void main(String[] args) {
		
		Car tesla = new Tesla("Tesla Model S", "Red", 88000);
		tesla.show();
		tesla.run();
		
		Car toyota = new Toyota("Toyota Camry", "Black", 54000);
		toyota.show();
		toyota.run();
		
	}

}


abstract class Car{
	protected String model, color;
	protected long price;
	//Constructor
	Car(){
		System.out.println("Car is created");
	}
	
	//Default method
	void show() {
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Price: $" + price);
	}
	
	//Abstract method
	abstract void run();
	
}


class Tesla extends Car{
	Tesla(String m, String c, long p){
		model = m;
		color = c;
		price = p;		
	}
	
	void run() {
		System.out.println("Tesla car running");
	}
	
}


class Toyota extends Car{
	Toyota(String m, String c, long p){
		model = m;
		color = c;
		price = p;		
	}
	
	void run() {
		System.out.println("Toyota car running");
	}
	
}


