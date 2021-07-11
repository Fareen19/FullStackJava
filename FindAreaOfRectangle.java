// 17. Area of a Rectangle

package inspiron;
import java.util.Scanner;

public class FindAreaOfRectangle
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 
		 System.out.println("Enter the length of Rectangle:"); 
		 double length = scan.nextDouble(); 
		 System.out.println("Enter the width of Rectangle:"); 
		 double width = scan.nextDouble(); 
		 //Area = length*width;
		double area = length*width; 
		 System.out.println("Area of Rectangle is:"+area);

	}

}

/* output:
  Enter the length of Rectangle:
5
Enter the width of Rectangle:
6
Area of Rectangle is:30.0
*/

