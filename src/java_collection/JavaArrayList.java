package java_collection;
import java.util.ArrayList;
import java.util.ListIterator;

public class JavaArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<>();
		
		// Add Elements to ArrayList
		color.add("Red");
		color.add("Pink");
		color.add("Black");
		color.add("Blue");
		color.add(3, "Orange");
		System.out.println("Color: " + color);
		
		// Add All Elements 
		ArrayList<String> color2 = new ArrayList<>();
		color2.add("color a");
		color2.add("color c");
		color2.add(1, "color b");
		
		color.addAll(1, color2);
		
		System.out.println("Color: " + color);
		System.out.println("ArrayList length: " + color.size() +", "+ color2.size());
				
		// Access ArrayList Elements
		String get_elem = color.get(2);
		System.out.println("Get Element: " + get_elem);

		//Change ArrayList Elements
		color.set(3, "New Color");
		System.out.println("Modified ArrayList: " + color);

		//Remove ArrayList Elements
		String str = color.remove(color.indexOf("Black"));
		System.out.println("Removed Element: " + str);

		//Java ArrayList contains()
		String checkData = "Pink";
		System.out.print(checkData + " is present in the arraylist: ");
		System.out.println(color.contains(checkData));
		
		//Java ArrayList retainAll()
		color.retainAll(color2);
		System.out.println("Common Elements: " + color);
		
		
		//View data using ListIterator
		ListIterator<String> li = color.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		//ArrayList to Array
		String[] arr = new String[color.size()];
		color.toArray(arr);
		
		for (String clr : arr) {
			System.out.print(clr + ", ");
		}

	}

}
