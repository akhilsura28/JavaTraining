package filehandling;

import java.io.FileOutputStream;

import java.io.IOException;

public class WritingToFile {

	public static void main(String[] args) throws IOException{
	
		String info = "Google LLC is an American multinational technology company "
				+ "that specializes in Internet-related services and products,"
				+ " which include online advertising technologies, a search engine,"
				+ " cloud computing, software, and hardware"
				+ "Google was founded in September 1998 by Larry Page and Sergey Brin while they"
				+ " were Ph.D. students at Stanford University in California";
		
		FileOutputStream getData = new FileOutputStream("C:\\Users\\Akhil sura\\Desktop\\google.txt");
		
		byte[] data = info.getBytes();
		
		getData.write(data);
		
		getData.close();
	}

}
