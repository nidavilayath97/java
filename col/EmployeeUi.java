package col;

import java.util.*;
import Exception.IncorrectException;

public class EmployeeUi {
	public static void main(String[] args) {
		EmployeeUi ui=new EmployeeUi();
		ui.execute();
	}

	
	  Map <Integer, Employee>  store =new HashMap<>();
	  
	  public void execute() {
		  try{
			  Employee e1=new Employee(1,"Abhinav");
		  
		  addEmployee(e1);
		  
		  Manager m1=new Manager(3,"ravi");
		  addEmployee(m1);
		  addEmployee(new Employee(-1,"Ravi"));
		   m1.addManagedEmployee(e1);
		  print();
		  Employee fetched=findById(2);
		  System.out.println(fetched.getname());
	  }catch (IncorrectException e) {
		  System.out.println("incorrect id");
	  }
	  }
	  
	  
	  public Employee findById(int id) {
		  Employee e=store.get(id);
		  return e;
	  }
	  
	  public void addEmployee(Employee e) {
		  int id=e.getid();
		  if(id<0) {
			  throw new IncorrectException ("id is negative");
			  
		  }
		  store.put(id, e);
	  }
	  
	  
	  public void print() {
		  Set<Integer> keys=store.keySet();
		  for (Integer id :keys) {
			  Employee e= store.get(id);
			  System.out.println(e.getname() +e.getbalance());
			  boolean isManager = e instanceof Manager;
			  if(isManager) {
				  Manager m=(Manager) e;
				  System.out.println("Managed Employees");
				  Employee[ ] managedEmployees=m.getManagedEmployees();
				  for (Employee managed: managedEmployees) {
					  if (managed !=null) {
						  System.out.println(managed.getname() +""  + managed.getbalance());
					  }
				  }
				  
			  }
			  
			  
		  }
	  }
}
