package filehandling_forObject_practise;

import java.io.*;

public class ReadProDetails {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new FileReader("productInfo"));

		String line = bf.readLine();
		System.out.println(line);
		String[] arr = line.split(":");
		int id = Integer.parseInt(arr[1].trim());
		
		
		line = bf.readLine();
		System.out.println(line);
		arr = line.split(";");
		String name = arr[1].trim();
		
		
		line = bf.readLine();
		System.out.println(line);
		arr = line.split("-");
		int quantity = Integer.parseInt(arr[1].trim());
		
		
		line = bf.readLine();
		System.out.println(line);
		arr = line.split("-");
		int priceEach = Integer.parseInt(arr[1].trim());
		
		
		Product p1 = new Product(id,name,quantity,priceEach);
		System.out.println(p1);
		
	}

}
