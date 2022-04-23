package problem1;

import java.util.Scanner;

//Java program to Reverse a String using swapping
public class ReverseString3 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = inp.nextLine();
		
		char[] temparray = input.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;
 
		for (left = 0; left < right; left++, right--) {
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}
		
		System.out.print("Reversed string: ");
		for (char c : temparray){
			System.out.print(c);
		}


	}

}
