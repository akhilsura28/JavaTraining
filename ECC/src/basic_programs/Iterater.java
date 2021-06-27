package basic_programs;

import java.util.*;

public class Iterater {

	public static void main(String[] args) {

		List<String> listName = new ArrayList<String>();

		listName.add("TeresaLisbon");
		listName.add("PatrickJane");
		listName.add("JohnHopkin");
		listName.add("KylieJenner");
		listName.add("NataliaDormer");

		Iterator<String> itr = listName.iterator();
		
		while(itr.hasNext()){
			
			String t = itr.next();
			
			if(t.charAt(0) > 'M')
				
				itr.remove();
				
			
	//		else

			//	t = t + " Passed";
			
		}
		
		
		for(String name : listName){
			System.out.println(name);
		}
		
	}
}
