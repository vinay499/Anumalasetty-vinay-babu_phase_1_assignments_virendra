package core.programs;

	public class Try {

		public static void main(String args[]){  
			int a[]=new int[10];
			try{  
				int data=30/0;  
				System.out.println(data); 
				
			}  

			catch(NullPointerException e){
				System.out.println(e);
			} 
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			try {
				 a[10]=90;
				 System.out.println(a[10]);
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println(ae);
				
			}
		  finally
		  {
			  System.out.println("FINALLY BLOCK IS ALWAYS EXECUTED");
		  }  

		  System.out.println("REST OF THE CODE...");  
		  }

}
