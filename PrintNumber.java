// Java program to print an Integer( Entered by user)

package inspiron;

import java.util.Scanner;



public class PrintNumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in); 
		 System.out.print("Enter a number: "); 
		 
		int number = reader.nextInt(); 
		 
		 System.out.println("You entered: " + number);

	}

}
