package problem2;

import java.util.Scanner;

//Java Program to Check Palindrome String
public class PalindromeString {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user_input = inp.nextLine();

        StringBuilder str = new StringBuilder();
        str.append(user_input);
        str.reverse();
        String reverse_str = str.toString();

        if (user_input.equalsIgnoreCase(reverse_str)) {
            System.out.println(user_input + " is a Palindrome String.");
        } else {
            System.out.println(user_input + " is not a Palindrome String.");
        }

    }

}
