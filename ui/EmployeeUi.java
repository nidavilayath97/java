package ui;


import dao.EmployeeDaoImpl;
import entities.Employee;
import service.EmployeeServiceImpl;
import service.IEmployeeService;

import java.util.Collection;
import java.util.Set;

public class EmployeeUi {
    private IEmployeeService service = new EmployeeServiceImpl(new EmployeeDaoImpl());

    public static void main(String[] args) {
        EmployeeUi ui = new EmployeeUi();
        ui.runUi();
    }

    public void runUi() {
        try {
            Employee e1 = new Employee(1, "chandra");
            Employee e2 = new Employee(2, "satya");
            service.addEmployee(e1);
            service.addEmployee(e2);
            Employee fetched1 = service.findEmployeeById(1);
            Employee fetched2 = service.findEmployeeById(2);
            System.out.println(fetched1.getName());
            System.out.println(fetched2.getName());
            System.out.println("********printing all employees****");
            Set<Employee> employees = service.allEmployees();
            print(employees);
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("something went wrong");
        }
    }

    void print(Collection<Employee>employees){
        for (Employee e:employees){
            System.out.println(e.getName());
        }
    }
}
