package ProblemStatement2;

import java.util.Scanner;

public class Sequences {
	public static void main(String[] args)
	{
		 Scanner s1 = new Scanner(System.in);
		  System.out.println("Enter a number 1: ");
		  int a = s1.nextInt();
		  Scanner s2 = new Scanner(System.in);
		  System.out.println("Enter a number 2: ");
		  int b = s2.nextInt();
		   int c;
		for(int i =0 ;i<=13;i++)
		{
			c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
