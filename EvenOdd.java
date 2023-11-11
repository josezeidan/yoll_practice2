package interviewPractice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		

		
		System.out.println("Please enter an Integer");
		
		Scanner scanner = new Scanner(System.in);
		
		int num =  Integer.parseInt(args[0]);

		if(num%2 == 0) 
			System.out.println(num + " is Even");
		else
			System.out.println(num + " is Odd");
		

		scanner.close();
		
		
	}
	

}
