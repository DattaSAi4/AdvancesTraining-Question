package Rectangle;

import java.util.Scanner;

public class TestRectangle {
	
	public static void main(String[] args)
	{
		for(int i=1;i<5;i++)
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println(+i+ " ." +"Enter length of the Rectangle");
		       int length =s1.nextInt();
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter breath of the Rectangle");
			int breath = s2.nextInt();
			Rectangle r1 = new Rectangle( length ,breath);
			r1.calculatearea();	
		}
	}
}
