package basic_problem;
import java.util.Scanner;


//Write a program called SumProductMinMax3 that prompts user for three integers. 
//The program shall read the inputs as int; compute the sum, product, minimum and maximum of the three integers; 
//and print the results

public class SumProductMinMax3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 1st integer: ");
		int num1 = in.nextInt();
		System.out.print("Enter 2nd integer: ");
		int num2 = in.nextInt();
		System.out.print("Enter 3rd integer: ");
		int num3 = in.nextInt();
		
		int sum, product, min, max;
		
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		
		//find minimum
		if(num1 < num2 && num1 < num3) {
			min = num1;
		}
		else if(num2 < num1 && num2 < num3) {
			min = num2;
		}
		else {
			min = num3;
		}
		
		//find maximum
		if(num1 > num2 && num1 > num3) {
			max = num1;
		}
		else if(num2 > num1 && num2 > num3) {
			max = num2;
		}
		else {
			max = num3;
		}
		
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		System.out.println("The min is: " + min);
		System.out.println("The max is: " + max);
		

		


	}

}
