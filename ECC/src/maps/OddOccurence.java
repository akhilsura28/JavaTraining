package maps;

import java.util.*;

public class OddOccurence {

	public static void main(String[] args) {
		
		int Array[] = {1 ,2 ,1 , 1, 3 ,2 ,3 ,4 ,4 ,3 ,4 ,4 ,6 };
		
		HashMap<Integer,Integer> occurence = new HashMap<Integer,Integer>();
		
		for(Integer key : Array){
			
			if(!occurence.containsKey(key)){
				occurence.put(key, 1);
			}else{
				int value = occurence.get(key);// returns the value to which the specified key is mapped
				value ++;
				occurence.put(key, value);
				}
		}
		
		System.out.println(occurence);
		
		for(Map.Entry<Integer, Integer> entry : occurence.entrySet()){
			
			if(entry.getValue() % 2 != 0)
				System.out.println(entry);
		}

	}

}
