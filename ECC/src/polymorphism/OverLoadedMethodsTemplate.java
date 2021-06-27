package polymorphism;

//THERE HAS TO BE DIFFERENCE IN THE NO AND TYPE OF ARGUMENTS IN EACH METHOD OF SAME NAME.
//

public class OverLoadedMethodsTemplate {

	void add(){
		System.out.println("Today is a beautiful day");
	}
	
	
	void add(int a){
		
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
	}
	

	void add(float a){
		
		int b = 21 ;
		
		float c = 34f;
		
		System.out.println(b + " " + c);
	}
	
	float add(float a , float b){
		
		return (a - b);
	}
	
	
	void add (String s , float a){
		
		System.out.println(s + "  " + a);
	}
}
