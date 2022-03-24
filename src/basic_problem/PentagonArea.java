package basic_problem;

import java.util.Scanner;

//Write a Java method to create the area of a pentagon
public class PentagonArea {

	public static void pentagonArea1(float s) {
		float area;
		area = (float) ((Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * Math.pow(s, 2)) / 4);
		System.out.println("Area of pentagon: " + area);
	}

	public static void pentagonArea2(float s, float a) {
		float area;
		area = (5 / 2) * s * a;
		System.out.println("Area of pentagon: " + area);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("Enter solution way(1/2): ");
		int way = inp.nextInt();

		switch (way) {

		case 1:

			System.out.print("Enter the length of sides: ");
			float s1 = inp.nextFloat();
			pentagonArea1(s1);
			break;

		case 2:

			System.out.print("Enter the length of sides: ");
			float s2 = inp.nextFloat();
			System.out.print("Enter the length of apothem: ");
			float a = inp.nextFloat();
			pentagonArea2(s2, a);
			break;

		default:

			System.out.print("Enter 1 or 2");
			break;

		}

	}

}
