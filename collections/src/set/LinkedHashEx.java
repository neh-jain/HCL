package set;
import java.util.LinkedHashSet;
class Book
{
	int id;
	String name;
	Book(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	
}
public final class LinkedHashEx {

	public static void main(String[] args) {
		LinkedHashSet<Book> b = new LinkedHashSet<>();
		Book b1 = new Book(1,"C");
		Book b2 = new Book(2,"C++");
		Book b3 = new Book(3,"C#");
		b.add(b1);
		b.add(b2);
		b.add(b3);
		System.out.println(b);
		for(Book i:b)
		{
		System.out.println(i);
		}
	}
}