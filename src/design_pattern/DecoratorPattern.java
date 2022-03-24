package design_pattern;

public class DecoratorPattern {

	public static void main(String[] args) {

		Burger_ burger = new Chickenburger_();
		System.out.println(".....Normal Burger.....");
		burger.show();

		Burger_ decorated1 = new AddCheese(new Chickenburger_());
		Burger_ decorated2 = new AddCheese(new Beefburger_());

		System.out.println(".....Burger with extra added cheese.....");
		decorated1.show();
		decorated2.show();

	}

}

class Burger_ {
	protected int price;
	protected String types;

	void show() {
		System.out.println("Burger type: " + types);
	}
}

class Chickenburger_ extends Burger_ {
	Chickenburger_() {
		price = 250;
		types = "Chicken Burger";
	}

}

class Beefburger_ extends Burger_ {
	Beefburger_() {
		price = 270;
		types = "Beef Burger";
	}

}

class Doublebeefburger_ extends Burger_ {
	Doublebeefburger_() {
		price = 300;
		types = "Double Beef Burger";
	}

}

abstract class BurgerDecorator extends Burger_ {
	protected Burger_ decoratedBurger;

	public BurgerDecorator(Burger_ decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
	}

	public void show() {
		decoratedBurger.show();
	}
}

class AddCheese extends BurgerDecorator {
	public AddCheese(Burger_ decoratedBurger) {
		super(decoratedBurger);
	}

	public void show() {
		decoratedBurger.show();
		addcheese(decoratedBurger);
	}

	private void addcheese(Burger_ decoratedBurger) {
		int finalPrice = decoratedBurger.price + 20;

		System.out.println("Decoration: Cheese added");
		System.out.println("Final price: " + finalPrice);
		System.out.println("");
	}
}
