// 25. User Inputting Array Elements

package inspiron;
import java.util.Scanner;
public class ArrayInput 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 
		 int array[] = new int[10]; 
		 int sum = 0; 
		 System.out.println("Enter the elements:"); 
		 for (int i=0; i<10; i++) 
		 { 
			 array[i] = scan.nextInt(); 
		 } 
		 for( int num : array)
		 { 
			 sum = sum+num; 
		 } 
		 System.out.println("Sum of array elements is:"+sum);

	}

}




/*output:
 Enter the elements:
66
55
77
44
33
22
88
99
11
123
Sum of array elements is:618 */
