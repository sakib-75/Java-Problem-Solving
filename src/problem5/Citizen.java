package problem5;

public class Citizen {
    public int id;
    public String name;
    public int phone;
    public int salary;

    public Citizen(int a,String b,int c)   //Three parameter
    {
        id=a;
        name=b;
        phone=c;
        salary=0;
    }
    public Citizen(int w,String x,int y,int z)   //Four parameter
    {
        id=w;
        name=x;
        phone=y;
        salary=z;
    }

}
