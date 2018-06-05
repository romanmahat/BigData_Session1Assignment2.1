import java.util.Scanner;

public class questionnumber2 {

	public static void main(String args[])
	   {
	      int x, y, sum;
	 
	      
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter first Number");
	      x = in.nextInt();
	      System.out.println("Enter second number");
	      y = in.nextInt();
	      
	      sum = x + y;
	 
	      System.out.println("Sum of the integers = " + sum);
	   }
}
