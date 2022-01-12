package core.programs;

public class Constructor {
	
		public static int calculate(int a,int b)
		{
		int  c=a+b;
		System.out.println("addition of two numbers" + c);
		return c;
		}
		
		public static double calculate(int r)
		{
		 double circle=0.25*3.14*r*r;
		 System.out.println("area of circle"   + circle);
		 return circle;
		}
		 
		 public static double calculate(double width,int length)
		 {
		 double rect=length*width;
		 System.out.println("area of rectangle"  +rect);
		 return rect;
		 }


	public static void main(String[] args)
	{
		  Constructor cal=new Constructor();
		  cal.calculate(2,5);
		  cal.calculate(25);
		  cal.calculate(8.63,6);
		 
	}
	}

