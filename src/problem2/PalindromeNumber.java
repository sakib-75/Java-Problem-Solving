package problem2;
import java.util.Scanner;


//Java Program to Check Palindrome Number
public class PalindromeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a numbre: ");
		int number = inp.nextInt(), originalNum, remainder, reversed = 0;
		
		originalNum = number;
		
		while (number != 0) {
			remainder = number % 10;
			reversed = (reversed * 10) + remainder;
			number /= 10;
		}
		
		if (originalNum == reversed) {
			System.out.println(originalNum + " is Palindrome.");
		}
		else {
			System.out.println(originalNum + " is not Palindrome.");
		}
		

	}

}
