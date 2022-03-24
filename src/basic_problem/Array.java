package basic_problem;

public class Array {

    public static void main(String[] args) {

        // General Array
        int[] arr1 = new int[5];
        System.out.println("General Array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 2;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int x : arr1) {
            sum = sum + x;
        }
        System.out.println("Array elements Sum:" + sum);

        // 2D Array
        int[][] arr2 = new int[3][5];
        System.out.println("2D Array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arr2[i][j] = i + j + 1;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Object Array");
        // Object Array
        Student[] ar = new Student[5];
        ar[0] = new Student("Sakib", 54, "CSE", 3.89);
        ar[1] = new Student("Nayeem", 50, "CSE", 2.56);
        ar[2] = new Student("Jawad", 69, "CSE", 3.36);
        ar[3] = new Student("Rahim", 30, "EEE", 3.67);
        ar[4] = new Student("Karim", 53, "BBA", 2.75);
        int count = 0;
        for (Student s : ar) // Enhance for loop
        {
            if (s.cgpa > 3.00) {
                count++;
                s.show();

            }

        }
        System.out.println("Total(CGPA>3.00):" + count + " " + "Student");

    }

}

class Student {
    String name;
    long id;
    String dept;
    double cgpa;

    public Student(String n, long i, String d, double c) {
        name = n;
        id = i;
        dept = d;
        cgpa = c;
    }

    public void show() {
        System.out.println("Name:" + name + " " + "ID:" + id + " " + "Dept:" + dept + " " + "CGPA:" + cgpa);

    }

}
