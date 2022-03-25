package problem4;

import java.util.Scanner;

public class CarBoatExample {
    public static void main(String[] args) {

        Vehicle[] v = new Vehicle[3];

        int n, x1, x2, temp;
        Scanner m = new Scanner(System.in);

        System.out.print("Enter choice: ");
        n = m.nextInt();


        if (n == 1) {

            for (int i = 0; i < v.length; i++) {
                System.out.println("Car:" + i);
                System.out.print(i + ". Enter car seat:");
                x1 = m.nextInt();
                System.out.print(i + ". Enter size:");
                x2 = m.nextInt();

                v[i] = new Car(x1, x2);
            }

            System.out.println("Sorting object array size for car :");
            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < v.length - i - 1; j++) {
                    if (v[j].size > v[j + 1].size) {
                        temp = v[j].size;
                        v[j].size = v[j + 1].size;
                        v[j + 1].size = temp;
                    }
                }
            }

            for (Vehicle vehicle : v) {
                System.out.println(vehicle.size);
            }
        }


        if (n == 2) {

            for (int i = 0; i < v.length; i++) {
                System.out.println("Boat:" + i);
                System.out.print(i + ". Enter Boat speed:");
                x1 = m.nextInt();
                System.out.print(i + ". Enter size:");
                x2 = m.nextInt();

                v[i] = new Boat(x1, x2);
            }

            System.out.println("Sorting object array size for boat :");
            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < v.length - i - 1; j++) {
                    if (v[j].size > v[j + 1].size) {
                        temp = v[j].size;
                        v[j].size = v[j + 1].size;
                        v[j + 1].size = temp;
                    }
                }
            }

            for (Vehicle vehicle : v) {
                System.out.println(vehicle.size);
            }
        }
    }

}
