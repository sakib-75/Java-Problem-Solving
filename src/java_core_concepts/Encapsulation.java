package java_core_concepts;

public class Encapsulation {

	public static void main(String[] args) {
		
		Account ac = new Account();
		ac.setAccount_no(171811);
		ac.setName("Sakibul Islam");
		ac.setEmail("sakib75.cse@gmail.com");
		ac.setAmount(35000);
		
		System.out.println("Account Information");
		System.out.println("Account no: " + ac.getAccount_no());
		System.out.println("Name: " + ac.getName());
		System.out.println("Email: " + ac.getEmail());
		System.out.println("Amount: " + ac.getAmount());

	}

}


class Account{
	//private data members  
	private long account_no;
	private String name, email;
	private float amount;
	
	//public getter and setter methods  
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long acc_no) {
		this.account_no = acc_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}