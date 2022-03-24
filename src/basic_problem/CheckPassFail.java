package basic_problem;
import java.util.Scanner;


//Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50; 
//or prints "FAIL" otherwise. The program shall always print “DONE” before exiting

public class CheckPassFail {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int mark = in.nextInt();
		
		if(mark >= 50) {
			System.out.println("PASS");
		}
		else{
			System.out.println("FAIL");
		}
		
		System.out.println("DONE");
		
		

	}

}
