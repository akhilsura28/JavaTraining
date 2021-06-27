package basic_programs;

import java.util.Scanner;

public class Adding {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
int num1=sc.nextInt();

int num2=sc.nextInt();

int sum;

int diff;

sum=num1+num2;

diff=num1-num2;

System.out.println("The sum of "+ num1 + " and " + num2 + " is :" + sum);

System.out.println("The difference of "+ num1 + " and "+ num2 +" is :" + diff);

	}

}
