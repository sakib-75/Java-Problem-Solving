package problem3;
import java.util.Scanner;

//Display Fibonacci Series
public class FibonacciSeries1 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = inp.nextInt(), firstNum = 0, secondNum = 1, nextNum;
		
		System.out.println("Fibonacci Series till " + n + " terms:");
		
		for (int i = 1; i <= n; ++i) {
			System.out.print(firstNum + " ");
			
			nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
			
		}

	}
	
}
