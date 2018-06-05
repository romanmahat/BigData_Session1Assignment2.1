import java.util.Scanner;

	class AdditinCal
	{
		int res=0;
		AdditinCal(int x,int y)
		{
		 res=x+y;
		}
	}
	class questionnumber3
	{
	public static void main(String[] arg)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println(" first number is");
		a=sc.nextInt();
		System.out.println("second number is ");
		b=sc.nextInt();
		AdditinCal c=new AdditinCal(a,b);
		System.out.println("sum is  : "+c.res);
	}
	}

	