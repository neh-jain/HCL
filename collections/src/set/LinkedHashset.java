package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		ls.add("one");
		ls.add("two");
		ls.add("three");
		ls.add("three");
		ls.add("four");
		Iterator<String> i = ls.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		ls.remove("four");
		System.out.println(ls);
		
	}
}