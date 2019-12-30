package col;
import java.util.*;


public class EmployeeComparator implements Comparator <Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getid()>o2.getid()) {
			return 1; //to sort in ascending order
			
		}
		
		if (o1.getid()< o2.getid()) {
			return -1;
		}
		return 0;
	}
	

}
