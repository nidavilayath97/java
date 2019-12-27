
public class Employee {
	

	public Employee() {
	}
	
	
		
public Employee(int id,String name, double balance) {
	this.id=id;
	this.name=name;
	this.balance=balance;
	}

private int id;
public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;
}
	
	
	private String name;
	public String getname() {
		return name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public void setname(String name) {
		this.name=name;
	}

	private double balance;
	public double getbalance() {
		return balance;
	}
	
	public void setbalance(double balance) {
		this.balance=balance;
	}
public void addsalary(double salary )	{
	balance=balance+salary;
}
	
	
}
