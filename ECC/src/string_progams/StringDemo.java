package string_progams;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {

		String name = "John Doe";

		String names = "John Johny Doe";

		///////////////////////////////////////////////////////////
		int length = name.length();

		int spaceIndex = name.indexOf(" ");

		String[] nameParts = names.split(" ");
		///////////////////////////////////////////////////////////

		System.out.println(name.length());

		System.out.println(name.charAt(5));

		System.out.println(name.indexOf("n"));

		System.out.println(name.substring(2, 6));

		System.out.println(name.substring(3));

		System.out.println(name.substring(0, spaceIndex));

		System.out.println(name.substring(spaceIndex + 1));

		System.out.println(name.subSequence(spaceIndex, length));

		System.out.println(name.substring(spaceIndex, length));

		System.out.println(Arrays.toString(nameParts));

		System.out.println(nameParts.length);

	}

}
