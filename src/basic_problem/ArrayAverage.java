package basic_problem;

import java.util.Scanner;

//Write a Java program to calculate the average value of array elements
public class ArrayAverage {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("1. Average calculation of 1D array");
		System.out.println("2. Average calculation of 2D array");
		System.out.print("Enetr option (1/2): ");
		int option = in.nextInt(), i, j;
		float sum = 0, average;

		switch (option) {

		case 1:

			System.out.print("Enter the length of 1D array: ");
			float[] numArr1D = new float[in.nextInt()];

			for (i = 0; i < numArr1D.length; i++) {
				System.out.print("Enter the value of Array[" + i + "]: ");
				numArr1D[i] = in.nextFloat();
			}

			// Calculate avg
			for (i = 0; i < numArr1D.length; i++) {
				sum = sum + numArr1D[i];
			}

			average = sum / numArr1D.length;
			System.out.println("Average value of the array elements is : " + average);
			break;

		case 2:

			System.out.println("Enter the lenth of row of 2D array: ");
			int row = in.nextInt();
			System.out.println("Enter the lenth of column of 2D array: ");
			int column = in.nextInt();

			float[][] numArr2D = new float[row][column];

			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					System.out.print("Enter the value of Array[" + i + "][" + j + "]: ");
					numArr2D[i][j] = in.nextFloat();
				}
			}

			// Calculate avg
			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					sum = sum + numArr2D[i][j];
				}
			}

			average = sum / (row * column);
			System.out.println("Average value of the array elements is : " + average);
			break;

		default:
			System.out.println("Enter option 1 or 2");
			break;

		}

	}

}
