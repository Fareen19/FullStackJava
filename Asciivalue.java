// 5. Find the ASCII Value
package inspiron;

public class Asciivalue {

	public static void main(String[] args) {
		char ch = 'H'; 
		 int ascii = ch; 
		 // You can also cast char to int
		int castAscii = (int) ch; 
		 System.out.println("The ASCII value of " + ch + " is: " + ascii); 
		 System.out.println("The ASCII value of " + ch + " is: " + castAscii); 

	}

}

/*Output:
 * The ASCII value of H is: 72
The ASCII value of H is: 72
*/
