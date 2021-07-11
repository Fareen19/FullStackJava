// 18. Area of a Square (entered user input)

package inspiron;
import java.util.Scanner; 

public class FindAreaOfSquare {

	public static void main(String[] args) 
	{
		System.out.println("Enter Side of Square:"); 
		 //Capture the user's input
		 Scanner scan = new Scanner(System.in); 
		 //Storing the captured value in a variable
		double side = scan.nextDouble(); 
		 //Area of Square = side*side
		double area = side*side; 
		 System.out.println("Area of Square is: "+area); 

	}

}

/*output:
 Enter Side of Square:
4
Area of Square is: 16.0*/ 
