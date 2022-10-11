package list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class app {
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		app a = new app();
		countries.add("India");
		countries.add("USA");
		countries.add("Korea");
		countries.add("UK");
		countries.add("Japan");
		countries.add("Dubai");
		countries.add("Canada");
		a.printList(countries);
		System.out.println("************");
		List<String> demo = new ArrayList<>();
		demo.add("one");
		demo.add("two");
		demo.add("three");
		demo.add("four");
		demo.add("five");
		a.printList(demo);
	}
	void printList(List<String> li)
	{
		for(String ele : li)
		{
			System.out.println("Element "+ele);
		}
	}
}