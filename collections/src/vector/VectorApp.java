package vector;

import java.util.Vector;

public class VectorApp {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(4);
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		System.out.println("size "+v.size());
		System.out.println("size "+v.capacity());
		v.addElement("five");
		v.addElement("six");
		System.out.println("size "+v.size());
		System.out.println("size "+v.capacity());
		System.out.println("Elements are "+v);
		if(v.contains("fiv"))
		{
			System.out.println("yes contains");
		}
		else
		{
			System.out.println("noo");
		}
		System.out.println("First ele "+v.firstElement());
		System.out.println("First ele "+v.lastElement());
		
		System.out.println(v.clone());
		
	}
	

}
