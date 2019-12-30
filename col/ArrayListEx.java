package col;

import java.util.*;


public class ArrayListEx {
	
	public static void main(String[] args) {
		List <Integer> list=new LinkedList ();
		list.add(1000);
		list.add(200);
		list.add(300);
		
		int firstElement=list.get(0);
		System.out.println(firstElement);
		ArrayListEx ex=new ArrayListEx();
		ex.print(list);
		list.remove(1);
		Object object=2;
		list.remove(object);
		ex.print(list);
		list.add(0,1);    //ading value 1 in index0 array
		ex.print(list);
		int size=list.size();
		System.out.println("size="+size);
		boolean isEmpty=list.isEmpty();
		System.out.println("isEmpty="+isEmpty);
		boolean contains=list.contains(1);  /* using contains*/
		System.out.println("list contains:"+contains);
		ex.printByIterator(list);
		
		/*using Comparator*/
		
		IntegerComparator comparator=new IntegerComparator();
		list.sort(comparator);  //sort method is already defined by java
		ex.print(list);
		
		}
	
	public void printByIterator(List<Integer> list) {
		Iterator<Integer> iterator=list.iterator();
		while (iterator.hasNext()) {
			Object o=iterator.next();
			int num=(int)o;
			System.out.println("elements="+num);
			
		}
	}
	
	public void print (List <Integer> list) {
		for (Object e:list) {
			int num=(int)e;
			System.out.println(num);
		}
	}

}
