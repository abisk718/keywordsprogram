package programkey;


	import programkey.Peoplerange;
	import programkey.RectangularArea;
	import programkey.SquareArea;

	abstract class  Peoplerange
	{
		public void getinformation()
		{
			System.out.println("welcome ");
		}
	public abstract void area();
	}
	 class SquareArea extends Peoplerange{
		public void area()
		{
			System.out.println("located Square area");//print the statement
		}
	}
	class RectangularArea extends Peoplerange{
		public void area()
		{
			System.out.println("located recangularArea");//print the statement
		}
	}
	public class Extends
	{
	public static void main(String[] args) {
		SquareArea SquareArea=new SquareArea();//method calling
		SquareArea.getinformation();
		SquareArea.area();
		
		System.out.println("........");
		
		RectangularArea RectangularArea=new RectangularArea();//method calling
		RectangularArea.getinformation();
		RectangularArea.area();
		
	}
	}
	
