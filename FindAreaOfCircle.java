// 20. Find Area of Circle

package inspiron;
import java.util.Scanner;


public class FindAreaOfCircle 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 
		 System.out.print("Enter the radius: "); 
		 /*We are storing the entered radius in double
		 * because a user can enter radius in decimals
		 */
		 double radius = scan.nextDouble(); 
		 //Area = PI*radius*radius
		double area = Math.PI * (radius * radius); 
		 System.out.println("The area of circle is: " + area); 
		 //Circumference = 2*PI*radius
		double circumference= Math.PI * 2*radius; 
		 System.out.println( "The circumference of the circle is:"+circumference) ; 

	}

}

/*output:
 Enter the radius: 4
The area of circle is: 50.26548245743669
The circumference of the circle is:25.132741228718345 */
