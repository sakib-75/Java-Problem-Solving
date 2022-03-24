package design_pattern;

public class BuilderPattern {

	public static void main(String[] args) {
		
		CivilEngineer nur = new CivilEngineer();
		House h1 = nur.getHouse(new ApartmentBuilder());
		System.out.println(h1.materialType);

	}

}

interface HousePlan {
	public void setArea();

	public void setMaterial();

	public void setColor();
}

interface HouseBuilder {
	House createHouse();
}

//..............................................................

abstract class House implements HousePlan {
	String materialType;
	int area;
	String color;
}

//....................Apartment..................................

class Apartment extends House {
	@Override
	public void setArea() {
		area = 2200;
		System.out.println("Setting Apartment area");
	}

	@Override
	public void setMaterial() {
		materialType = "Bricks";
		System.out.println("Setting materials to apartment");
	}

	@Override
	public void setColor() {
		color = "Off-white";
		System.out.println("Setting color to apartment");
	}
}

class ApartmentBuilder implements HouseBuilder {
	@Override
	public House createHouse() {
		House house = new Apartment();
		house.setArea();
		house.setMaterial();
		house.setColor();
		return house;
	}
}

//.........................Hut..................................

class Hut extends House {
	@Override
	public void setArea() {
		area = 3000;
		System.out.println("Setting Hut area");
	}

	@Override
	public void setMaterial() {
		materialType = "Bamboo";
		System.out.println("Setting materials to Hut");
	}

	@Override
	public void setColor() {
		color = "Gray";
		System.out.println("Setting color to Hut");
	}
}

class HutBuilder implements HouseBuilder {

	@Override
	public House createHouse() {
		House house = new Hut();
		house.setMaterial();
		house.setArea();
		house.setColor();
		return house;
	}
}

//..........................Igloo.................................

class Igloo extends House {
	@Override
	public void setArea() {
		area = 1500;
		System.out.println("Setting Igloo area");
	}

	@Override
	public void setMaterial() {
		materialType = "Snow";
		System.out.println("Setting materials to Igloo");
	}

	@Override
	public void setColor() {
		color = "White";
		System.out.println("Setting color to igloo");
	}
}

class IglooBuilder implements HouseBuilder {
	@Override
	public House createHouse() {
		House house = new Igloo();
		house.setArea();
		house.setMaterial();
		house.setColor();
		return house;
	}
}

//..............................................................

class CivilEngineer {

	House getHouse(HouseBuilder hb) {
		return hb.createHouse();
	}
}
