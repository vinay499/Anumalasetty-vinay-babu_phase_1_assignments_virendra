package core.programs;


	import java.util.TreeMap;

	public class TreeMapDemo {
	    public static void main(String[] args) {
	    	
	        TreeMap<String, Integer> fruits = new TreeMap<String, Integer>();
	        fruits.put("apple-1", 120);
	        fruits.put("pineapple-4", 99);
	        fruits.put("kiwi-3", 130);
	        fruits.put("grapes-2", 190);
	        fruits.put("muskmelon-6", 89);
	        fruits.put("strawberries-5", 142);
	        
	        for(String key: fruits.keySet()){
				System.out.println(key  +" : "+ fruits.get(key));
	        }
	    }
	}

