package basic_problem;
import java.util.Scanner;

//Write a Java method to find the smallest number among three numbers
public class SmallestNumber {
	
	public static int smallestNumber(int num1, int num2, int num3) {
		if((num1 < num2) && (num1 < num3)) {
			return num1;
		}
		else if((num2 < num1) && (num2 < num3)) {
			return num2;
		}
		else {
			return num3;
			
		}
	}
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int number1 = inp.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int number2 = inp.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int number3 = inp.nextInt();
		
		int smallest_number = smallestNumber(number1, number2, number3);
		
		System.out.print("Smallest number is " + smallest_number);
		

	}

}
