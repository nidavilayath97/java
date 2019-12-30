package col;
import java.util.*;
import col.Student;


public class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student a , Student b) {
		if (a.getid() > b.getid()){
			return 1;
		}
		if (a.getid() < b.getid()) {
			return -1;
		}
		return 0;
	}
	

}
