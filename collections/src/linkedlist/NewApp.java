package linkedlist;
import java.util.LinkedList;
public class NewApp {
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		NewApp a = new NewApp();
		countries.add("India");
		countries.add("USA");
		countries.add("Korea");
		countries.add("UK");
		countries.add("Japan");
		countries.add("Dubai");
		countries.add("Canada");
		a.printList(countries);
		System.out.println("************");
		countries.add(2,"Russia");
		a.printList(countries);
		System.out.println("************");
		countries.set(5,"China");
		a.printList(countries);
		System.out.println("************");		
		countries.remove(); //removes 1st element
		countries.remove(2);
		a.printList(countries);
		System.out.println("************");	
	}
	void printList(LinkedList<String> li)
	{
		for(String ele : li)
		{
			System.out.println("Ele "+ele);
		}
	}
}