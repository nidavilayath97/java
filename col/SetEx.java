package col;


	import java.util.*;




	public class SetEx {
		
		public static void main(String[] args) {
			Employee e1=new Employee(1,"chandra");
			Employee e2=new Employee(2,"Ravi");
	        Employee e3=new Employee(3,"Alekhya");
			Employee e4=new Employee(4,"Nandini");
			Set <Employee> set= new LinkedHashSet ();
			//boolean added=set.add(e1);
		     set.add(e2);
		     set.add(e3);
		     set.add(e4);
		     
		     int size=set.size();
		     System.out.println("size="+size);
		     boolean contains=set.contains(e2);
		     System.out.println("set contains e2="+contains);
		     SetEx ex=new SetEx();
		     ex.print(set);
		     boolean removed=set.remove(e2);
		     System.out.println("removed=" +removed);
		     ex.print(set);
		     
		     Comparator <Employee> comparator=new EmployeeComparator();
		     Set<Employee> set1=new TreeSet<>(comparator);
		     
		     
			//boolean same=e1==e2;
			//System.out.println("e1 and e2 same=" +same);
			//boolean equals=e1.equals(e2);
			//System.out.println("e1 equals e2=" +equals);
			//ex.print(set);

			
			
		}
		
		public void print(Set<Employee> set) {
			for (Employee e:set) {
				
				System.out.println( e.getid()+"" +e.getname());
			}
			
	
			
		}
		}

	



