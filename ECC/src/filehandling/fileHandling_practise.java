package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling_practise {

	public static void main(String[] args) throws IOException{
		
		//writingToFileUsingFileWriter();

		//writingToFileUsingFileOutputStream();
		
		//readingFromFileUsingFileInputStream();
		
		//readingFromFileUsingFileReader();
		
		readingLimitedData();
	}
	
	
	public static void writingToFileUsingFileWriter() throws IOException{
		
		String data = "Today is a GoodDay......... Iam so HappY";
		
		FileWriter run = new FileWriter("C:\\Users\\Akhil sura\\Desktop\\google");
		
		run.write(data);
		
		run.close();
	}
	
	public static void writingToFileUsingFileOutputStream() throws IOException{
		
		String data = "learn as there is no Today Live as there is no Tommoroww !";
		
		FileOutputStream run = new FileOutputStream("demoFile");
		
		byte[] convertedData = data.getBytes();
		
		run.write(convertedData);
		
		run.close();
	} 

	public static void readingFromFileUsingFileInputStream() throws IOException{
				
		FileInputStream run = new FileInputStream("demoFile");
		
		int i = run.read();
		
		while(i != -1){
			System.out.print((char)i);
			i = run.read();
		}
		
		run.close();
	}
	
	
	public static void readingFromFileUsingFileReader() throws IOException{
		
		FileReader run = new FileReader("C:\\Users\\Akhil sura\\Desktop\\google.txt");
		
		int i = run.read();
		
		while(i != -1){
			System.out.print((char)i);
			i = run.read();
		}
		
		run.close();
	}
	
	
	public static void readingLimitedData() throws IOException{
		
		FileReader run = new FileReader("C:\\Users\\Akhil sura\\Desktop\\google.txt");
		
		char[] characters = new char[200];
		
		//run.read(characters);
		
		System.out.println("----------------------------------------------------------");
		
		run.read(characters, 50, 100);
		for(int i = 0 ; i < characters.length ;i++){
			
			System.out.println( i + " " + characters[i]);
		}
				
		
	}
	
	
	
	
}
