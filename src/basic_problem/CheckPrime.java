package basic_problem;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {

        System.out.print("Enter a number to check prime: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(), i = 2;
        boolean flag = false;
        while (i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }

}
