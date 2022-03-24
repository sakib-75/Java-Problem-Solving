package problem1;
import java.util.Scanner;

//java program to reverse a number
public class ReverseNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = inp.nextInt(), remainder, reversed = 0;
		
		System.out.println("Original Number: " + number);
		
		while(number != 0) {
			remainder = number % 10;
			reversed = (reversed * 10) + remainder;
			number /= 10;
		}
		
		System.out.println("Reversed Number: " + reversed);

	}

}
