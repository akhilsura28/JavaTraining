package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadTheData {

	public static void main(String[] args) throws IOException{
		
		FileInputStream f = new FileInputStream("C:\\Users\\Akhil sura\\Desktop\\google.txt");
		
	//	f.read(); 			// the return type of this method is 'int'
		
	//	System.out.println((char)f.read());	 // typecasting	again converts the int type to its ASCII value
		
		int i = f.read();
		
		while(i != -1){
			
			System.out.print((char)i);
			i = f.read();
		}
				
		f.close();

	}

}
