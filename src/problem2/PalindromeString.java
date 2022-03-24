package problem2;
import java.util.Scanner;

//Java Program to Check Palindrome String
public class PalindromeString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = inp.nextLine(), reverseStr = "";
		char ch;
		
		for (int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			reverseStr = ch + reverseStr;
		}
		
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a Palindrome String.");
		}
		else {
			System.out.println(str + " is not a Palindrome String.");
		}

	}

}
