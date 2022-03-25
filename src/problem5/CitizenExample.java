package problem5;

public class CitizenExample {

    public static void main(String[] args) {

        Citizen [] arr = new Citizen[5];

        arr[0]= new Citizen(101,"Rahim",1234);
        arr[1]= new Citizen(102,"Karim",1234,12000);
        arr[2]= new Citizen(103,"Salam",1234,25000);
        arr[3]= new Citizen(104,"Kuddus",1234,16000);
        arr[4]= new Citizen(104,"Kuddus",1234,30000);

        int count=0;

        for(Citizen c:arr)
        {
            if(c.salary<20000)
            {
                count++;
                System.out.println("Name: " +c.name);
            }
        }
        System.out.println(count +" "+"Citizen Salary is less than 20,000");
    }

}
