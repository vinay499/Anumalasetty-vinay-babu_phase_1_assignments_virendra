package core.programs;

public class Custom {
	
		 static void Performance(int salary)throws PerformanceException{  
			     if(salary<2100)  
			    		 throw new PerformanceException ("you need to work hard"); 
			     else if  
			    	 (salary >=2100 && salary<= 5000)
			    	 throw new PerformanceException ("your salary is some how good"); 
			     else if 
			     (salary >=5100 && salary <=9000)
			    	 throw new PerformanceException("salary is very good"); 
			     else 
			    	 System.out.println("invalidamount");
			   }
			   public static void main (String[] args) {
				   try {
					   Performance(4000);
				   }
				   catch (Exception e)
				   {
					   System.out.println("Exception occured: "+ e.getMessage());
				   }
			   }
	}
	class PerformanceException extends Exception{
		PerformanceException(String e) {
			super(e);
		}
	}
	