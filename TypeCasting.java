package core.programs;

public class TypeCasting {

	public static void main(String[] args) {
		int i = 100;
		long l=i;
		System.out.println("long value"+ 1);
		
		int o=(int) i;
		System.out.println("int value"+ o);
		  
		char  t=(char) i;
		System.out.println("char value"+ t);
		
		double d=1906766565868.007969847578776565675;
		float r =(float) d;
		System.out.println("float value" + r);
		System.out.println("double value" + d);
		
		double d2=19067566565868.00796984757877;
		long l2 =(long) d2;
		int i2=(int ) l2;
		System.out.println("double value"+ d2);
		System.out.println("long value"+ l2);
		System.out.println("int value "+ i2);
		
		
		float f=l;
				System.out.println("float value"+ f);
				
				
	   byte b;
	   int ii=257;
	   double dd= 323.142;
	   System.out.println("conversion of int to byte.");
	   b=(byte) ii;
	   System.out.println("*\nConversion of double to byte."  );
	   
	   b=(byte) dd;
	   System.out.println("dd = "+ dd +"b =" + b);
		
		
		

	}

}
