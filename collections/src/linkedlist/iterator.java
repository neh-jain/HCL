package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iterator {
	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		iterator a = new iterator();
		countries.add("India");
		countries.add("USA");
		countries.add("Korea");
		countries.add("UK");
		countries.add("Japan");
		countries.add("Dubai");
		countries.add("Canada");
		a.printList(countries);
		System.out.println("******************");
		countries.sort(null);
		a.printList(countries);
		System.out.println("******************");
		Collections.reverse(countries);
		a.printList(countries);
		

	}
	void printList(List<String> list)
	{
		Iterator<String> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println("Element "+i.next());
		}
	}
}