

package Rectangle;

public class Rectangle {
	
	int length;
	int breadth;
	
	Rectangle(int length , int breath)
	{
		this.length =length;
		this.breadth= breath;	
	}	
	
	public void calculatearea()
	{
		int area = this.length *this.breadth;
		System.out.println("The length of the Rectangle: "  +this.length);
		System.out.println("The breadth of the Rectangle: "  +this.breadth);
		System.out.println("The area of the Rectangle: "  +area);
	}
	
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(5 ,10);
		r1.calculatearea();
	}
}

