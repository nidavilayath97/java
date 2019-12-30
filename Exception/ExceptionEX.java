package Exception;

import col.Employee;

public class ExceptionEX {
	private Employee employee;
	
    public static void main(String[] args) {
    	ExceptionEX ex = new ExceptionEX();
    	try{
    		ex.execute();
    	}catch (IncorrectException exception) {
    		System.out.println("Id was negative");
    		
    	}
    	
    	catch (Exception e) {
    		System.out.println("Someting went wrong..this is a blanket catch");
    	}
    	finally {
    		System.out.println("finally command always gets executed");
    	}
    	
    	System.out.println("After execute in main");
    }

public void execute() {

		//int id=employee.getid();
		//Throwable e= new NullPointerException();  //to throw  manually  any null pointer exceptions created
		 if (employee.getid()< 0) {
			 RuntimeException e= new IncorrectException("id cannot be negative");
			 throw e;
			 }
		
		
	
}
}
