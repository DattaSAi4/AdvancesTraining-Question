package ProblemStatement2;

import java.util.Scanner;

public class palidrom2 {
	
	public static void main(String[] args)
	{
		String rev="";
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a String");
	  String str=s1.nextLine();	
	  int leng = str.length();
	  for(int i =str.length()-1; i>=0;i-- )
	  {
		  rev = rev + str.charAt(i);
	  }
	  if(rev.equalsIgnoreCase(str))
	  {
		  System.out.println("It is palidram");
	  }
	  else
	  {
		  System.out.println("It is not a palidram");
	  }
	}

}
