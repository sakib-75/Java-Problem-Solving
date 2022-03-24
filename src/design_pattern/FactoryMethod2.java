package design_pattern;

public class FactoryMethod2 {

	public static void main(String[] args) {

		Burgerfactory bf = Burgerfactory.createinstance();

		Burger b1 = bf.getburgerbyname("Chicken burger");
		System.out.println("Price: " + b1.price);

		Burger b2 = bf.getburgerbyname("Double beef burger");
		System.out.println("Price: " + b2.price);

		Burger b3 = bf.getbeefburger(2);
		System.out.println("No of patties: " + b3.noofpatties);
		System.out.println("Pattyweight: " + b3.pattyweight);

	}

}

class Burger {
	protected int price, noofpatties, pattyweight;

}

class Chickenburger extends Burger {
	Chickenburger() {
		price = 250;
		noofpatties = 1;
		pattyweight = 60;
	}
}

class Beefburger extends Burger {
	Beefburger() {
		price = 270;
		noofpatties = 1;
		pattyweight = 60;
	}
}

class Doublebeefburger extends Burger {
	Doublebeefburger() {
		price = 300;
		noofpatties = 2;
		pattyweight = 90;
	}
}

class Burgerfactory {
	// Singleton...................................
	private static Burgerfactory singleinstance;

	public static Burgerfactory createinstance() {
		if (singleinstance == null) {
			singleinstance = new Burgerfactory();
		}
		return singleinstance;
	}

	private Burgerfactory() {
	}
	// ..............................................

	Burger getbeefburger(int noofpatties) {
		if (noofpatties == 1) {
			return new Beefburger();
		} else if (noofpatties == 2) {
			return new Doublebeefburger();
		}
		return null;
	}

	Burger getburgerbyname(String burgername) {
		if (burgername.equals("Chicken burger")) {
			return new Chickenburger();
		} else if (burgername.equals("Beef burger")) {
			return new Beefburger();
		} else if (burgername.equals("Double beef burger")) {
			return new Doublebeefburger();
		}
		return null;
	}
}
