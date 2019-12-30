package col;

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

  @Override
  public boolean equals (Object obj) {
	  
	  //col.Employee e1=new col.Employee(10);
	  //col.Employee e2=e1;
	  //boolean result=e1.equals(e2);
    if (obj==this) {
    	return true;
    }
    
    //col.Employee e1=new col.Employee(10);
    //col.Employee e2=null;
    //boolean result=e1.equals(e2);
    //
    // col.Employee e1=new col.Employee(10);
    //string e2="10";
    //boolean result=e1.equals(e2);
    //
    if (obj ==null|| !(obj instanceof Employee)) {
    	return false;
    	
    }
    
    //col.Employee e1=new col.Employee(10);
    //col.Employee e2=new col.Employee(10);
    // boolean result=e1.equals(e2);
    //
    Employee e=(Employee)obj;
    return e.id==this.id;

  }
}
