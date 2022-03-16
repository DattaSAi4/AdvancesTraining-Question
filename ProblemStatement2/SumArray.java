package ProblemStatement2;
//add the index up to 14 and store in 15
public class SumArray {
	
	static int[] arr = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};	
	
	
	public static int add()
	{
		 int  sum =0;
		for(int i =0 ;i<arr.length-5;i++)
		{
		sum += arr[0];
		}
		return
		arr[14]=sum;
	
	}
	
	public static void main(String[] args)
	{
		System.out.println(add());
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}
