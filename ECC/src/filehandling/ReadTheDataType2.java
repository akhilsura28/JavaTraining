package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadTheDataType2 {

	public static void main(String[] args) throws IOException{
		
		FileReader setData = new FileReader("Demo");
		
		int i = setData.read();
		
		while(i != -1){
			
			System.out.print((char)i);
			i = setData.read();
		}
		
	}

}
