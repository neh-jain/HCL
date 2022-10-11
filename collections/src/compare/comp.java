package compare;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
class Names implements Comparable<Names>
{
	@Override
	public String toString() {
		return "Names [name=" + name + "]";
	}
	private String name;
	public Names(String name)
	{
		this.name = name;
	}
	@Override
	public int compareTo(Names obj)
	{
		if(name.length() == obj.name.length())
		return 0;
		else if(name.length() < obj.name.length())
		return -1;
		else
		return 1;
	}
}
public class comp {

	public static void main(String[] args) {
//		String a = "q";
//		String b = "r";
//		System.out.println(a.compareTo(b));
		comp c =new comp();
		List names = new LinkedList<>();
		names.add(new Names("mm"));
		names.add(new Names("bb"));
		names.add(new Names("vv"));
		c.printList(names);
	}
	void printList(List<String> list)
	{
		Iterator<String> i = list.iterator();
		while(i.hasNext())
			System.out.println("Element "+i.next());
	}
}