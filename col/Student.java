package col;

public class Student {
	private int id;
	public Student (int id) {
		this.id=id;
	}
	
	public int getid() {
		return id;
	}
	
	@Override
	public hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if(obj==null || !(obj instanceof Student))
			return false;
		Student other =(Student)obj;
		return this.id==obj.id;
		
	}

}
