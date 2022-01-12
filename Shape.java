package core.programs;


	public class Shape {
		int side;
		float radius;
		int length;
		int breadth;
		Shape()
		{
			
		}
		Shape(float r)
		{
			radius=r;
		}
		Shape(int l,int b)
		{
			length=l;
			breadth=b;
		}
		public float areaofCircle()
		{
			return 3.14f*radius*radius;
		}
		public int areaofSquare()
		{
			return side*side;
		}
		public int areaofRectangle()
		{
			return length*breadth;
		}
		public int area (int height,int base)
		{
			return (height*base)/2;
		}
		public float area(float diagonal1,float diagonal2)
		{
			return(diagonal1+diagonal2)/2;
		}
		
		public static void main(String[] args)
		{
			Shape circle=new Shape(9.3f);
			Shape square=new Shape(9);
			Shape rectangle=new Shape(30,20);
			Shape triangle=new Shape();
			Shape rhombus=new Shape();
			System.out.println("Area of circle "+circle.areaofCircle());
			System.out.println("Area of Square "+square.areaofSquare());
			System.out.println("Area of rectangle "+rectangle.areaofRectangle());
			System.out.println("Area of triangle "+triangle.area(42,7));
			System.out.println("Area of rhombus "+rhombus.area(20.58f,58.2f));
			
			
			
		}
	}

