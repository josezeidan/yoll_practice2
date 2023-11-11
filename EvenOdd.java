package interviewPractice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Please enter an Integer");
		
		//Scanner scanner = new Scanner(System.in);
		
		//int num = scanner.nextInt();
		
		System.out.println(evenodd(23));
		
		
	}
	
	public static String evenodd(int num) {
		
		
		if(num%2 == 0) 
			return num+" is Even";
		else
			return num+" is Odd";
		
	}

}
