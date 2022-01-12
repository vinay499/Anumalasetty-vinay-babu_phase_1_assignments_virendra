package core.programs;
import java.util.*;

public class Fruits {
	public static void main(String[] args)
	{
		HashSet h=new HashSet();
		
		h.add("Apple");
		h.add("Banana");
		h.add("Blue berry");
		h.add("pine apple");
		h.add("custard apple");
		h.add("straw berry");
		h.add("kiwi");
		h.add("lemon");
		h.add("carn berry");
		h.add("grapes");
		
		System.out.println("Hashset is "+h);
		System.out.println("Size of Hashset is "+ h.size());
		
		h.remove("grapes");
		h.remove("lemon");
		h.add("Mango");
		h.add("star fruit");
		h.add("green apple");
		System.out.println("Size of Hashset after is "+ h.size());
		

		
		
		System.out.println("Does hashset contains orange" + h.contains("orange"));		
		System.out.println("is hashset empty  " + h.isEmpty());
		
	}

}
