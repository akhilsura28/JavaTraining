package inheritance;

public class Player {

	private int id ;
	
	private String name ;
	
	private static int idGen = 1001 ;

/////////////////////////////////////////////////////
	
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
	
///////////////////////////////////////////////////////
	
	public void autoIdGen() {
		id = idGen++;
	}
	
////////////////////////////////////////////////////////
	
	public Player(){
		
	}
	
	public Player(int id, String name) {

		this.id = id;
		this.name = name;
		
	}
	
////////////////////////////////////////////////////////
	
}
