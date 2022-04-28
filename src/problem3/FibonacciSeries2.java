package problem3;
import java.util.Scanner;

//Display Fibonacci series up to a given number
public class FibonacciSeries2 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the value of limit: ");
		int n = inp.nextInt(), firstNum = 0, secondNum = 1, nextNum;
		
		System.out.println("Fibonacci Series Upto " + n + ": ");
		
		while (firstNum <= n) {
			System.out.print(firstNum + " ");
			
			nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
			
		}
		

	}

}
