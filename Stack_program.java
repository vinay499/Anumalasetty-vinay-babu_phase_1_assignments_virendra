
	package core.programs;


	import java.util.Stack;
	public class Stack_program {

		public static void main(String[] args)
		{

		Stack stack1 = new Stack();

		    // pushing the elements
		    stack1.push("apple");
		    stack1.push("mango");
		    stack1.push("pineapple");
		    stack1.push("orange");
		    stack1.push("grapes");
		    stack1.push("delhi");
		    stack1.push("darjilling");
		    stack1.push("kurnool");
		    stack1.push("nellore");
		    stack1.push("9");
		    stack1.push("15");
		    stack1.push("10");
		    stack1.push("11");
		    stack1.push("a");
		    stack1.push("s");
		     
		   
		    System.out.println(stack1);
		   
		    stack1.pop();
		    stack1.pop();
		    stack1.pop();
		    stack1.pop();
		    stack1.pop();
		   
		    System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
		   
		    stack1.pop();
		    stack1.pop();
		   
		    System.out.println("after removing 2 elements"+ " stack-1 is: " + stack1.peek());
		   
		    System.out.println("index of elemtn  inside the stack "+ stack1.indexOf("apple"));
		    System.out.println("index of elemtn  inside the stack "+ stack1.indexOf("delhi"));
		         
		}
		}

