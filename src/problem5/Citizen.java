package problem5;

public class Citizen {
    public String name;
    public int id, phone;
    public double salary;

    public Citizen(int id, String name, int phone)   //Three parameter
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = 0;
    }

    public Citizen(int id, String name, int phone, double salary)   //Four parameter
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

}
