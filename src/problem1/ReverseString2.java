package problem1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

//Java program to Reverse a String using ListIterator
//Step 1: Input a string
//Step 2: Convert string to Char Array
//Step 3: Add char to a ArrayList
//Step 4: Reverse ArrayList and print 

public class ReverseString2 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = inp.nextLine();
		
		char[] ch = input.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		
		for(char c : ch) {
			list.add(c);			
		}
		
		Collections.reverse(list);
		ListIterator<Character> li = list.listIterator();
		
		System.out.print("Reversed string: ");
		while(li.hasNext()) {
			System.out.print(li.next());
		}

	}

}
