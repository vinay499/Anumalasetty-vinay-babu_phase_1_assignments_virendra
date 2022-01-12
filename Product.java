package core.programs;

class Products {
                int id=78;
                String name="amul";
                
                void display() {
                System.out.println("Id:"+id+" "+"Name:"+name);
                }
}
class A extends Products{
	int count=50;
	String category="butter";
	void display() {
		System.out.println("Id:"+id+" "+"Name:"+name+" "+"count:" +count+""+"category:"+category);	
	}
}
	
class B extends Products{
	int count=90;
	String category="milk";
	void display() {
		System.out.println("Id:"+id+" "+"Name:"+name+" "+"count:" +count+""+"category:"+category);	
	}
}
class C extends  Products{
	int count=56;
	String category="choco";
	void display() {
		System.out.println("Id:"+id+" "+"Name:"+name+" "+"count:" +count+""+"category:"+category);	
	}
}
class sub_A extends A {
	int price =30;
	void product1()
	{
		System.out.println("total price :"+count*price )	;
		System.out.println("id"+id+" "+"name of the product"+name+" "+"category "+ category);
			}
}
class sub_B extends B{
	int price =10;
	void product2 () {
		System.out.println("total price :"+count*price )	;
		System.out.println("id"+id+" "+"name of the product"+name+" "+"category "+ category);
	}
}
public class Product{
	public static void main(String []args)
	{
		sub_A A1 = new sub_A();
		A1.product1();
		A1.display();
		A1.display();
		sub_B B1= new sub_B();
		B1.product2();
		B1.display();
		B1.display();
		
	}
	
	
}
