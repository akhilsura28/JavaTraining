package interfaces_practise_2;

public class Student {

	private int id ;
	
	private String name ;

	protected static int idgen = 1001; 
	
	/////////////////////////////////////////
	public Student(){
		
	}

	public Student(int id , String name) {
		this.id = idgen ;
		this.name = name;
	}

	/////////////////////////////////////////
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	///////////////////////////////////////////

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	///////////////////////////////////////////
}
