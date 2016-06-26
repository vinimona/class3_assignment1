// To calculate square root and cube root of a number in Java. 
// Use Math class and its static method sqrt(...) & cbrt(...).

package Class3_assignments;
import java.lang.Math;
import java.util.Scanner;

public class class3_assignment1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num;
		Scanner scan_in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = scan_in.nextDouble();
		
		System.out.println("Square root of " + num + " is = " + Math.sqrt(num));
		System.out.println("Cube root of " + num + " is = " + Math.cbrt(num));
		
		if (scan_in != null)
			scan_in.close();
		
	}

}
