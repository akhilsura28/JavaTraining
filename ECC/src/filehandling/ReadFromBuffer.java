package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromBuffer {

	public static void main(String[] args) throws IOException {

		FileReader run = new FileReader("info");

		BufferedReader br = new BufferedReader(run);

		String line = br.readLine();

		while (line != null) {

			System.out.println(line);
			line = br.readLine();

		}

		br.close();
		run.close();

	}

}
