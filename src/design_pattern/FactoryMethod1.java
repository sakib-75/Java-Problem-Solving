package design_pattern;

public class FactoryMethod1 {

	public static void main(String[] args) {

		Bookfactory book1 = new Bookfactory();

		Book b1 = book1.createbookbymood("Motivated");
		b1.printcovertype();

		Book b2 = book1.createbookbymood("In class");
		b2.printcovertype();

		Book b3 = book1.createbookbymood("Leisurely");
		b3.printcovertype();

	}

}

class Book {
	String type;
	String covertype;

	void printcovertype() {
		System.out.println(covertype);
	}
}

class Textbook extends Book {
	Textbook() {
		type = "Textbook";
		covertype = "Paper";
	}
}

class Practicebook extends Book {
	Practicebook() {
		type = "Practicebook";
		covertype = "Plastic";
	}
}

class Literaturebook extends Book {
	Literaturebook() {
		type = "Literaturebook";
		covertype = "Hard";
	}
}

//factory method
class Bookfactory {
	Book createbookbymood(String mood) {
		switch (mood) {
			case "Leisurely":
				return new Literaturebook();
			case "Motivated":
				return new Practicebook();
			case "In class":
				return new Textbook();
		}
		return null;
	}
}
