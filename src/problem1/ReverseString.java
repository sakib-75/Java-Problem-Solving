package problem1;

import java.util.Scanner;

//java program to reverse a string
public class ReverseString {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user_str = inp.nextLine();
        StringBuilder reversed = new StringBuilder();
        char ch;

        System.out.println("Original string: " + user_str);

        for (int i = 0; i < user_str.length(); i++) {
            ch = user_str.charAt(i);
            reversed.insert(0, ch);
        }

        System.out.println("Reversed string: " + reversed);

    }

}
