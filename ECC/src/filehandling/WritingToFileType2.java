package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFileType2 {

	public static void main(String[] args) throws IOException {
		
		String s = "Microsoft Corporation is an American multinational technology company with headquarters "
				+ "in Redmond, Washington. It develops, manufactures, licenses, supports, and sells computer "
				+ "software, consumer electronics, personal computers, and related services";
		
		write(s);
		

	}

	public static void write(String s)throws IOException{
		
		FileWriter w = new FileWriter("Demo");
		
		w.write(s);
		
		w.close();
		
	}
}
