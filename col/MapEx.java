package col;
import java.util.*;

public class MapEx {
	
	public static void main(String[] args) {
		Map<Integer,Employee>map = new TreeMap<>(new EmployeeKeyComparator ());
		//Map<Integer,Employee>map = new HashMap<>();
		//Map<Integer,Employee>map = new TreeMap<>();
		Employee e1=new Employee(1, "Nida");
		Employee e2=new Employee (2, "Nandini");
		
		map.put(1, e1);
		map.put (2,e2);
		
		Employee fetched1=map.get(1);
		Employee fetched2=map.get(2);
		MapEx ex=new MapEx();
		ex.printByKeys(map);
		
		map.remove (2);
		ex.printByEntries(map);
		map.put(2, e2);
		
		ex.printByValues(map);
	}
	
	public void printByEntries(Map<Integer,Employee>map) {
		Set<Map.Entry<Integer, Employee>> entries= map.entrySet();
		for (Map.Entry<Integer, Employee>entry :entries) {
			int key=entry.getKey();
			Employee value=entry.getValue();
			System.out.println(value.getname());
		}
	}
	public void printByValues(Map<Integer,Employee> map) {
		 Collection<Employee>Values=map.values();
		 for(Employee e :Values) {
			 System.out.println(e.getname());
		 }
	}
	
	
  
	 public void printByKeys(Map<Integer,Employee> map) {
		 Set<Integer>keys=map.keySet();
		 for(int key:keys) {
			 Employee Value=map.get(key);
			 System.out.println(Value.getname());
			 
		 }
	 }
}
