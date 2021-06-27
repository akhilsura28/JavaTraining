package filehandling_forObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadEmpDetails {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new FileReader("empDetails"));

		String line = bf.readLine();
		System.out.println(line);
		String[] s = line.split(":");
		// System.out.println(" 0 : "+ s[0] + " 1 : "+ s[1] );
		int id = Integer.parseInt(s[1].trim());
		// System.out.println(id);

		line = bf.readLine();
		System.out.println(line);
		s = line.split(":");
		String name = s[1].trim();
		// System.out.println(name);

		line = bf.readLine();
		System.out.println(line);
		s = line.split(":");
		String dept = s[1].trim();
		//System.out.println(dept);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(dept);
		
		Employee e1 = new Employee(id,name,dept);
		System.out.println(e1);
			
	}

}
