// 13. While Loop Demonstration

package inspiron;
import java.util.Scanner;

public class WhileLoopDemo 
{

	public static void main(String[] args)
	{
		int number, sum = 0; 
		 Scanner sc = new Scanner(System.in); 
		 
		 System.out.println("n Please Enter any integer Value below 10: "); 
		 number = sc.nextInt(); 
		 
		 while (number <= 10)
		 { 
			 sum = sum + number; 
			 number++; 
		 } 
		 System.out.format(" Sum of the Numbers From the While Loop is: %d ", 
		sum); 

	}

}

/* output:
 * n Please Enter any integer Value below 10: 
 
 4
 Sum of the Numbers From the While Loop is: 49 */