package design_pattern;

public class Singleton {

    public static void main(String[] args) {

        Calculator c1 = Calculator.createinstance();
        System.out.println(c1.add(5, 4));

        Taxcalculator tx1 = new Taxcalculator();
        System.out.println(tx1.calculatetax(25000));

    }

}

class Calculator {
    private static Calculator singleinstance;

    public static Calculator createinstance() {
        if (singleinstance == null) {
            singleinstance = new Calculator();
        }
        return singleinstance;
    }

    // Constructor
    private Calculator() {
    }

    public int add(int a, int b) {
        return a + b;
    }

}

class Taxcalculator {
    public int calculatetax(int salary) {
        Calculator c2 = Calculator.createinstance();
        int tax = salary - c2.add(15, 5);
        return tax;
    }
}
