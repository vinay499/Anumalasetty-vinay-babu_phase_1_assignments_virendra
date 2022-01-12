package core.programs;
abstract class Vehicle{
	abstract void run();
	abstract void stop();
	public void fuel(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	public void fuel(float a,String b)
	{
		System.out.println(a+" "+b);
	}
	public void fuel(char a,int b)
	{
		System.out.println(a+" "+b);
	}
	int speed=60;
	long distance=420;
	public Vehicle()
	{
		System.out.println("This is default constructor");
	}
	public Vehicle(int speed,long distance)
	{
		System.out.println(speed+" "+distance);
	}
}
class twowheelers extends Vehicle
{
	void run()
	{
		System.out.println("the vehicle is running");
	}
	void stop()
	{
		System.out.println("the vehicle has been stopped");
	}
	public twowheelers()
	{
		System.out.println("default constructor");
	}
	int speed=95;
	long distance=562;
	int notire=2;
	void display()
	{
		System.out.println("No.of tires "+notire+" "+"speed "+speed+" "+"distance "+distance);
		System.out.println("variables of parent class"+super.speed+" "+super.distance);
	}
}
 public class Vechile
{
	public static void main(String[] args)
	{
	
		Vehicle v=new twowheelers();
		v.run();
		v.stop();
		//v.display();
		//v.vehicle(52,23);
		v.fuel(25,5);
	}
}
