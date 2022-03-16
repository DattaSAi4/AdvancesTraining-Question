package EvenNumber;

import java.util.Scanner;

public class DisplayEven {
	
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number");
		    int n =s1.nextInt();
		    for(int i =0 ;i<=n;i++)
		    {
		    	if(i%2==0)
		    	{
		    		System.out.println(" This is an even number: " +i);
		    	}
		    }
	}

}
